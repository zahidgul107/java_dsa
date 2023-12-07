package com.dsa;

public class ReverseNumber {
	
	public static void main(String[] args) {
		int n = 12345;
		int reverseNumber = 0;
		while (n > 0) {
			int rem = n % 10;
			n = n/10;
			reverseNumber = reverseNumber * 10 + rem;
		}
		System.err.println(reverseNumber);
	}

}
