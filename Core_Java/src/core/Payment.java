package core;

public abstract class Payment {
	
	protected double amount;
	
	public Payment(double amount) {
		this.amount = amount;
	}

	public abstract void processPayment();
	
	public void printReceipt() {
		System.out.println("Payment of $" + amount + " processed. Receipt generated.");
	}
}
