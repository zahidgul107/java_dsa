package random_number_invoice.invoice;

import java.time.LocalDate;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class InvoiceNumberGenerators {

    private AtomicInteger counter = new AtomicInteger(1);

    // Method to generate the financial year string
    private String getFinancialYear() {
        int currentYear = LocalDate.now().getYear();
        int financialYearStart = LocalDate.of(currentYear, 4, 1).getYear();
        int financialYearEnd = LocalDate.of(currentYear + 1, 3, 31).getYear();
        return financialYearStart + "-" + financialYearEnd;
    }

    // Method to generate a unique invoice number
    public String generateInvoiceNumber() {
        String financialYear = getFinancialYear();
        
        // Generate a three-digit sequence number
        int sequenceNumber = 1; // This should be fetched from a database in a real application
        String formattedSequenceNumber = String.format("%04d", sequenceNumber);
        
        // Format the invoice number
        String invoiceNumber = String.format("%s/%s", formattedSequenceNumber, financialYear);
        
        return invoiceNumber;
    }

    // Example usage
    public static void main(String[] args) {
        InvoiceNumberGenerator generator = new InvoiceNumberGenerator();
        for (int i = 0; i < 2100; i++) { // Generate 10 invoice numbers for demonstration
            String invoiceNumber = generator.generateInvoiceNumber();
            System.out.println("Generated Invoice Number: " + invoiceNumber);
        }
    }
}

