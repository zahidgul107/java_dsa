package question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueWords {
	
	public static void main(String args[]) {
		
		String str = "Java is fun and Java is powerful";
		
		System.err.println(uniqueWords(str));
	}
	
	public static List<String> uniqueWords(String str) {

		return Arrays.stream(str.split(" ")).map(String::toLowerCase).distinct().sorted().collect(Collectors.toList());
	}

}
