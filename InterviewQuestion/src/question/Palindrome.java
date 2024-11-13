package question;

public class Palindrome {

	public static void main(String[] args) {
		
		String name = "madam";
		System.err.println(checkPalindrome(name));

	}
	
	public static boolean checkPalindrome(String name) {
		
		char[] charArr = name.toCharArray();
		int start = 0;
		int end = charArr.length - 1;
		
		while(start < end) {
			if(charArr[start] != charArr[end]) {
				return false;
			}
			start++;
			end--;
		}
		
		return true;
	}

}
