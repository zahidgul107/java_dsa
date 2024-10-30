package core;

public class PayPalPayment extends Payment {
	
	private String email;
	
	public PayPalPayment(double amount, String email) {
		super(amount);
		this.email = email;
	}
	
	@Override
	public void processPayment() {
		System.out.println("Processing PayPal payment for $" + amount + " using PayPal account: " + email);
	}
}
