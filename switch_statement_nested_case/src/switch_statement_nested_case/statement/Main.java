package switch_statement_nested_case.statement;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
	/*	String fruit = in.next();
	
		switch (fruit) {
		case "Mango": {
			System.out.println("King of fruit");
			break;
		}
		case "Apple": {
			System.out.println("A sweet red fruit");
			break;
		}
		case "Orange": {
			System.out.println("Round fruit");
			break;
		}
		case "Graphes": {
			System.out.println("Small fruit");
			break;
		}
		default:
			System.out.println("Please enter a valid fruit");
		} */
		
	//	int day = in.nextInt();
		
	/*	switch (day) {
			case 1 -> System.out.println("Monday");
			case 2 -> System.out.println("Tuesday");
			case 3 -> System.out.println("Wednesday");
			case 4 -> System.out.println("Thursday");
			case 5 -> System.out.println("Friday");
			case 6 -> System.out.println("Saturday");
			case 7 -> System.out.println("Sunday");
		}  */
		
	/*	switch (day) {
			case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
			case 6, 7 -> System.out.println("Weekend");
		}    */
		
/*		switch (day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Weekday");
			break;
		case 6:
		case 7:
			System.out.println("Weekend");
			break;
		}   */
		
		int empId = in.nextInt();
		
		String department = in.next();
		
		switch (empId) {
		case 1 -> System.out.println("Kunal Kushwaha");
		case 2 -> System.out.println("Rahul Rana");
		case 3 -> {
			System.out.println("Emp Number 3");
			switch (department) {
			case "IT" -> System.out.println("IT");
			case "Management" -> System.out.println("Management Department");
			default -> System.out.println("No Department Entered");
			}
		}
		default -> System.out.println("Enter correct EmpId");
		}
	}
}
