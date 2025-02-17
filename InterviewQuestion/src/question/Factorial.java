package question;

public class Factorial {
	
	public static void main(String[] args) {
		System.err.println(factorial(5));
	}
	
	public static int factorial(int n) {
		if(n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}

}
