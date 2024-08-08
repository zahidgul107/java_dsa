package random_number_invoice.invoice;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Random;

public class InvoiceNumberGenerator {

    // Method to generate a unique invoice number
    public String generateInvoiceNumber() {
        // Generate current financial year
        int currentYear = LocalDate.now().getYear();
        int financialYearStart = LocalDate.of(currentYear, 4, 1).getYear();
        int financialYearEnd = LocalDate.of(currentYear + 1, 3, 31).getYear();
        
        // Example: financial year string format
        String financialYear = financialYearStart + "-" + financialYearEnd;

        // Generate a random number (example, should use database sequence for production)
        Random random = new Random();
        int randomNumber = random.nextInt(1000); // Generate a random number between 0 and 999

        // Format the invoice number
        String invoiceNumber = String.format("%03d/%s", randomNumber, financialYear);

        return invoiceNumber;
    }

    // Example usage
    public static void main(String[] args) {
        InvoiceNumberGenerator generator = new InvoiceNumberGenerator();
        String invoiceNumber = generator.generateInvoiceNumber();
        System.out.println("Generated Invoice Number: " + invoiceNumber);
    }
}
