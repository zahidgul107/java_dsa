package java_17.features;

public record Person(String name, int age) {
	
	public static void main(String args[]) {
		Person p = new Person("zahid", 24);

		System.err.println(p.name);
	}

}
