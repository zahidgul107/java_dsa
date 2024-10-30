package core;

public class MainPaymentApp {

	public static void main(String[] args) {
		Payment payment = new CreditCardPayment(120.5, "1234-5678-9012-3456");
		payment.processPayment();
		payment.printReceipt();

	}

}
