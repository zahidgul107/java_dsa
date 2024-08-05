package exception;

public class ArithmeticEx {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            int result = 10 / 0; // This will throw an ArithmeticException
            System.out.println("This line will not be executed");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("Inside finally block");
        }
        System.out.println("Code after try-catch-finally block");
    }
}

