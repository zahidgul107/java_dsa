package collection_framework.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Student {
	
	private String name;
	
	private double gpa;
	
	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}
	
	public String getName() {
		return name;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("Charlie", 3.5));
		students.add(new Student("Bob", 3.7));
		students.add(new Student("Alice", 3.5));
		students.add(new Student("Akshit", 3.9));
		
	/*	students.sort((o1, o2) -> {
			if(o2.getGpa() - o1.getGpa() > 0) {
				return 1;
			} else if(o2.getGpa() - o1.getGpa() < 0) {
				return -1;
			} else {
				return 0;
			}
		});  */
		
		Comparator<Student> comparator = Comparator.comparing(Student::getGpa);
		Comparator<Student> comparator1 = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
		
		students.sort(comparator1);
		
		
		students.forEach(s -> {
			System.err.println(s.name +" " + s.gpa);
		});

	}

}
