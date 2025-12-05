package december;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveNull {
	
	public static void main(String args[]) {
		
		List<String> list = Arrays.asList("A", null, "", "Hello", " ", "Java");
		
		List<String> cleaned = list.stream()
				.filter(Objects::nonNull)
				.map(String::trim)
				.filter(s -> !s.isEmpty())
				.collect(Collectors.toList());
		
		System.err.println(cleaned);
	}

}
