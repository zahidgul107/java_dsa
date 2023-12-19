package functions_methods.fn_mtd;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {
		
		fun(2, 3, 5, 23);
		
		multiple(2, 7, "zahid", "gul");

	}
	
	static void multiple(int a, int b, String ...v) {
		
	}

	static void fun(int ...v) {
		System.err.println(Arrays.toString(v));
	}
}
