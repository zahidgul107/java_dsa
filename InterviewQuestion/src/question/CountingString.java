package question;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingString {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "bat", "cat", "banana", "dog");
		Map<Integer, Long> strLenMap = list.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
		
		System.err.println(strLenMap);
	}

}
