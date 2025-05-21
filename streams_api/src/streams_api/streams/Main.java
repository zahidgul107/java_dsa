package streams_api.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String args[]) {

		Employee em1 = new Employee("John", "IT", 12.0);
		Employee em2 = new Employee("David", "ITI", 30.0);
		Employee em3 = new Employee("Joy", "Electrical", 32.0);
		Employee em4 = new Employee("David JAZ", "ITI", 37.0);
		Employee em5 = new Employee("JOLLY", "Electrical", 35.0);

		List<Employee> employees = null;
		employees.add(em1);
		employees.add(em2);
		employees.add(em3);
		employees.add(em4);
		employees.add(em5);

		Map<String, List<Employee>> result = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.collectingAndThen(Collectors.toList(),
								list -> list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
										.collect(Collectors.toList()))));
		System.err.println(result);
	}

}

class Employee {

	String name;

	String department;

	Double salary;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Double getSalary() {
		return salary;
	}

	public Employee() {

	}

	public Employee(String name, String department, Double salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

}
