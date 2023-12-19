package functions_methods.fn_mtd;

public class PassingExamples {

	public static void main(String[] args) {
		
		String name = "Iron Man";
		changeName(name);
		System.err.println(name);
	}
	
	static void changeName(String naam) {
		naam = "zahid";
		System.err.println(naam);
	}

}
