package streams_api.streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {
	
	public static void main(String[] args) {
		
		String str = "cbadbd";
		System.err.println(findFirstNonRepeatingChar(str));
		System.err.println(findFirstRepeatingChar(str));
	}

	private static Optional<Map.Entry<Character, Long>> findFirstNonRepeatingChar(String str) {
		return str.chars().mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() == 1)
				.findFirst();
	}
	
	private static Optional<Map.Entry<Character, Long>> findFirstRepeatingChar(String str) {
		return str.chars().mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() > 1)
				.findFirst();
	}

}
