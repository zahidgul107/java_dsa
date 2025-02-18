package question;

import java.util.Scanner;

public class Power {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int b = sc.nextInt();
		int p = sc.nextInt();
		
		System.err.println(power(b, p));
	}
	
	public static int power(int b, int p) {
		
		int power = 1;
		for(int i = 1; i <= p; i++) {
			power = power * b;
		}
		return power;
	}

}
