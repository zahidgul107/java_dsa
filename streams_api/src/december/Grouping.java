package december;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {

	public static void main(String[] args) {

		List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana");
		
		Map<String, Long> counts = items.stream()
				.collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		
		System.err.println(counts);

	}

}
