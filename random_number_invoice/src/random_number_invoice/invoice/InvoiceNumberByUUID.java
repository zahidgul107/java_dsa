package random_number_invoice.invoice;

import java.time.LocalDate;
import java.util.UUID;

public class InvoiceNumberByUUID {

    // Method to generate the financial year string
    private String getFinancialYear() {
        int currentYear = LocalDate.now().getYear();
        int financialYearStart = LocalDate.of(currentYear, 4, 1).getYear();
        int financialYearEnd = LocalDate.of(currentYear + 1, 3, 31).getYear();
        return financialYearStart + "-" + financialYearEnd;
    }

    // Method to generate a unique invoice number using UUID
    public String generateInvoiceNumber() {
        UUID uuid = UUID.randomUUID(); // Generate a random UUID
        String formattedUUID = uuid.toString().substring(0, 8); // Take the first 8 characters of UUID
        
        // Generate the financial year string
        String financialYear = getFinancialYear();

        // Format the invoice number
        String invoiceNumber = String.format("%s/%s", uuid.toString(), financialYear);

        return invoiceNumber;
    }

    // Example usage
    public static void main(String[] args) {
        InvoiceNumberGenerator generator = new InvoiceNumberGenerator();
        for (int i = 0; i < 10000; i++) { // Generate 10 invoice numbers for demonstration
            String invoiceNumber = generator.generateInvoiceNumber();
            System.out.println("Generated Invoice Number: " + invoiceNumber);
        }
    }
}

