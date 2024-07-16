package strings.classes;

import java.util.ArrayList;

public class Operators {
	
	public static void main(String args[]) {
		
		// Operator overloading: Can be acheived when there is one of the argument as String
		
		System.err.println('b' + 'b');
		System.err.println("a" + "b");
		System.err.println("a" + 1);
		
		System.err.println("kunal" + new ArrayList<>());
		System.err.println("kunal" + new Integer(56));
		
	}

}
