package streams_api.streams;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharOccurance {

	public static void main(String[] args) {
		
		String str = "Welcome to my portfolio";
		System.err.println(countOccurance(str));
	}

	private static Map<Character, Long> countOccurance(String str) {
		
		return str.chars().mapToObj(ch -> (char) ch)
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
	}

}
