package core;

public class BankOverride {
	
	int getRateOfInterest() {
		return 0;
	}

	public static void main(String args[]) {
		
		SBI sbi = new SBI();
		ICICI icici = new ICICI();
		JK jk = new JK();
		
		System.err.println(sbi.getRateOfInterest());
		System.err.println(icici.getRateOfInterest());
		System.err.println(jk.getRateOfInterest());
	}

}


