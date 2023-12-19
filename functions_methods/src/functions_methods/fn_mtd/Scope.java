package functions_methods.fn_mtd;

public class Scope {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		String name = "zahid";
		
		{
		//	int a = 3; already initialised
			a = 100;  // we can update its value
			int c = 200; 
			name = "amir";
		}
		
		int c = 300; // we can reassign it again here
		System.err.println(a);
		System.err.println(name);

	}

}
