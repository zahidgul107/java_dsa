package functions_methods.fn_mtd;

import java.util.Scanner;

public class Questions {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	//	int n = in.nextInt();
	//	System.err.println(isPrime(n));
	//	System.err.println(isArmStrong(n));
		for(int i = 100; i <= 1000; i++) {
			if(isArmStrong(i)) {
				System.err.println(i + " ");
			}
		}

	}
	
	static boolean isArmStrong(int n) {
		int original = n;
		int sum = 0;
		
		while (n > 0) {
			int rem = n % 10;
			n = n / 10;
			sum = sum + rem*rem*rem;
		}
		return sum == original;
	}
	
	static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		int c = 2;
		while (c * c <= n) {
			if(n % c == 0) {
				return false;
			}
			c++;
		}
		return c * c > n;
	}

}
