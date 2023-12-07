package com.dsa;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a = 0;
		int b = 1;
		int count = 2;
		
		while (count <= n) {
			int temp = b;
			b = b + a;
			a = temp;
			count++;
		}
		System.err.println(b);
	}

}

