package com.dsa;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int ans = 0;
		while (true) {
			System.err.println("Enter Operation: ");
			char op = in.next().trim().charAt(0);
			
			if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
				System.err.println("Enter two numbers: ");
				int num1 = in.nextInt();
				int num2 = in.nextInt();
				if (op == '+') {
					ans = num1 + num2;
				} else if (op == '-') {
					ans = num1 - num2;
				} else if (op == '*') {
					ans = num1 * num2;
				} else if (op == '/') {
					if (num2 != 0) {
						ans = num1 / num2;
					}
				} else if (op == '%') {
					ans = num1 % num2;
				}
			} else if (op == 'x' || op == 'X') {
				break;
			} else {
				System.err.println("Invalid Operation");
			}
			System.err.println(ans);
		}
	}

}
