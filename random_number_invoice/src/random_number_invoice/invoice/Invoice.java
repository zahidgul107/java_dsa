package random_number_invoice.invoice;

import java.time.LocalDate;
import java.util.Random;
import java.util.UUID;

public class Invoice {

	public static void main(String args[]) {
		UUID invoiceUuid = UUID.randomUUID();
		System.err.println("Auto Generated Invoice Number: "+invoiceUuid+ "/" + getFinancialYear());
//		for (int i = 0; i < 10000; i++) {
//		System.err.println("auto generate invoice : " + generateInvoiceNumber());
//		}
	}
	
	private static String getFinancialYear() {
        int currentYear = LocalDate.now().getYear();
        int financialYearStart = LocalDate.of(currentYear, 4, 1).getYear();
        int financialYearEnd = LocalDate.of(currentYear + 1, 3, 31).getYear();
        return financialYearStart + "-" + financialYearEnd;
    }

	public static String generateInvoiceNumber() {

		int currentYear = LocalDate.now().getYear();
		int financialYearStart = LocalDate.of(currentYear, 4, 1).getYear();
		System.err.println("financialYearStart : " + financialYearStart);
		int financialYearEnd = LocalDate.of(currentYear + 1, 3, 31).getYear();
		System.err.println("financialYearEnd : " + financialYearEnd);

		String invoiceNumber = String.format("%03d/%d-%d", getNextInvoiceNumber(), financialYearStart,
				financialYearEnd);
		return invoiceNumber;
	}

	private static int getNextInvoiceNumber() {
		Random random = new Random(System.nanoTime() % 100000);

		int nextInvoiceNumber = random.nextInt(1000000000);

		return nextInvoiceNumber;
	}

}
