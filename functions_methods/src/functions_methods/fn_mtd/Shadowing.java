package functions_methods.fn_mtd;

public class Shadowing {
	static int x = 90; // this will be shadowed at line 8
	public static void main(String[] args) {
		System.err.println(x);  // 90
		int x = 40;
		System.err.println(x); // 40
		fun();  // 90
	}
	
	static void fun() {
		System.err.println(x);
	}

}
