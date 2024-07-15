package strings.classes;

public class Comparison {
	
	public static void main(String args[]) {
		String a = "zahid";
		String b = "zahid";
		String c = a;
	//	System.err.println(c == a);
		
		String name1 = new String("hey");
		String name2 = new String("hey");
		
		System.err.println(name1 == name2);
		
		System.err.println(name1.equals(name2));
	}

}
