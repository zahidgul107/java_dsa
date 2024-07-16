package strings.classes;

public class SB {
	
	public static void main(String args[]) {
		
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < 26; i++) {
			char ch = (char) ('a' + i);
			builder.append(ch);
		}
		
		System.err.println(builder.toString());
	}

}
