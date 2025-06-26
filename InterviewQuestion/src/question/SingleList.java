package question;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class SingleList {
	
	public static void main(String[] args) {
		
		List<List<String>> skills = Arrays.asList(
				Arrays.asList("Java", "Spring", "Spring Boot"),
				Arrays.asList("React", "Angular", "JavaScript"),
				Arrays.asList("MySQL", "PostgreSQL", "Oracle"));
		
		List<String> resList = skills.stream().flatMap(Collection::stream).collect(Collectors.toList());
		System.err.println(resList);
	}

}
