package question;

public class Count {
	
	public static void main(String args[]) {
		
		String s = "Automa@123tion";
		int lCount = 0;
		int sCount = 0;
		int dCount = 0;
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(Character.isLetter(ch)) {
				lCount++;
			} else if(Character.isDigit(ch)) {
				dCount++;
			} else {
				sCount++;
			}
		}
		
		System.err.println(lCount + " " + sCount + " " + dCount);
		
	}

}
