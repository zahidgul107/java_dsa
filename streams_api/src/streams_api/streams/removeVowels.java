package streams_api.streams;

import java.util.stream.Collectors;

public class removeVowels {
	
	public static void main(String[] args) {
		String str = "HelloWorld";
		System.err.println(removeVowel(str));
	}

	private static String removeVowel(String str) {
		return str.chars().filter(ch -> !"aeiouAEIOU".contains(String.valueOf((char) ch)))
				.mapToObj(ch -> String.valueOf((char) ch)).collect(Collectors.joining());
	}

}
