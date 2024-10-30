package core;

public class CreditCardPayment extends Payment {
	
	private String cardNumber;
	
	public CreditCardPayment(double amount, String cardNumber) {
		super(amount);
		this.cardNumber = cardNumber;
	}

	@Override
	public void processPayment() {
		System.out.println("Processing credit card payment for $" + amount + " using card: " + cardNumber);
		
	}

}
