package question;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		fibonacciSeries(10);
	}
	
	public static void fibonacciSeries(int n) {
		
		int firstNum = 0;
		int secondNum = 1;
		int nextNum;
		
		for(int i = 0; i <= n; i++) {
			System.err.print(firstNum + " ");
			nextNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = nextNum;
		}		
	}

}
