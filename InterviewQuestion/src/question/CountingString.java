package question;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingString {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "bat", "cat", "banana", "dog");
		Map<Integer, Long> strLenMap = list.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
		
		// Another Native View
		Map<Integer, Integer> map = new HashMap<>();
		
		for(String s : list) {
			
			int len = s.length();
			
			if(map.containsKey(len)) {
				map.put(len, map.get(len) + 1);
			} else {
				map.put(len, 1);
			}
		}
		
		System.err.println(map);
	}

}
