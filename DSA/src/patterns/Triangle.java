package patterns;

public class Triangle {
	
	public static void main(String args[]) {
		triangle(4, 0);
	}
	
	public static void triangle(int r, int c) {
		
		if(r == 0) {
			return;
		}
		
		if(c < r) {
			triangle(r, c + 1);
			System.err.print("*");
		} else {
			triangle(r - 1, 0);
			System.err.println();
		}
	}

}
