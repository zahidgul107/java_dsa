package streams_api.streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordLengthInString {
	
	public static void main(String[] args) {
		String str = "Welcome to my portfolio";
		System.err.println(count(str));
		System.err.println(countToMantainTheOrder(str));
	}

	private static Map<String, Integer> count(String str) {
		return Arrays.stream(str.split(" ")).collect(Collectors.toMap(word -> word, String::length));
	}
	
	private static Map<String, Integer> countToMantainTheOrder(String str) {
        return Arrays.stream(str.split(" "))
                .collect(Collectors.toMap(
                        word -> word,
                        String::length,
                        (a, b) -> a,
                        LinkedHashMap::new
                ));
    }

}
