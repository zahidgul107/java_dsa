package java_11.features;

public class TestIsBlank {
	
	public static void main(String args[]) {
		String str = " ";
		
		if(str.isEmpty()) {
			System.err.println("String is empty");
		} else {
			System.err.println("Not Empty");
		}
		
		if (str.isBlank()) {
			System.err.println("String is blank");
		} else {
			System.err.println("Not Blank");
		}
	}

}
