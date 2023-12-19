package functions_methods.fn_mtd;

import java.util.Arrays;

public class Overloading {
	
	public static void main(String[] args) {
		fun(67);
		fun("zahid");
		varArgs(2, 3, 43);
	}
	
	static void fun(int a) {
		System.err.println(a);
	}
	
	static void fun(String name) {
		System.err.println(name);
	}
	
	static void varArgs(int ...v) {
		System.err.println(Arrays.toString(v));
	}
	
	static void varArgs(String ...v) {
		System.err.println(Arrays.toString(v));
	}

}
