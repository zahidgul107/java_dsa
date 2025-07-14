package sort.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Comparators {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("banana", "apple", "date");
		list.sort((a, b) -> a.length() - b.length());
		System.err.println(list);

	}

}

class Student {
	
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
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
}

class Main {
	
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("Charlie", 3.5));
		list.add(new Student("Alice", 3.5));
		list.add(new Student("Bob", 3.7));
		
		list.add(new Student("Akshit", 3.9));
		
		Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
		list.sort(comparator);
		
	/*	list.sort((a, b) -> {
			if(b.getGpa() - a.getGpa() > 0)
				return 1;
			else if(b.getGpa() - a.getGpa() < 0)
				return -1;
			else
				return a.getName().compareTo(b.getName());
		});  */
		list.forEach(s ->
			System.err.println(s.getName() + " :" + s.getGpa())
		);
		
		String res = list.stream().map(Student::toString).collect(Collectors.joining(", "));
		System.err.println(res);
	}
	
}
