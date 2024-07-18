package pattern_questions;

public class Main {
	
	public static void main(String args[]) {
	//	pattern1(4);
	//	pattern2(4);
	//	pattern3(4);
		pattern4(6);

	}
	
	static void pattern1(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				System.err.print("* ");
			}
			System.err.println();
		}
	}
	
	static void pattern2(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.err.print("* ");
			}
			System.err.println();
		}
	}
	
//	static void pattern3(int n) {
//		for (int row = 1; row <= n; row++) {
//			for (int col = 1; col <= n-row+1; col++) {
//				System.err.print("*");
//			}
//			System.err.println();
//		}
//	}
	
	static void pat(int p) {
		for(int row = 1; row <= p; row++) {
			for(int col = 1; col <= p-row+1; col++) {
				System.err.print("* ");
			}
			System.err.println();
		}
	}
	
	static void pattern3(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = n; col >= row; col--) {
				System.err.print("*");
			}
			System.err.println();
		}
	}
	
	static void pattern4(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.err.print(col + " ");
			}
			System.err.println();
		}
	}

}
