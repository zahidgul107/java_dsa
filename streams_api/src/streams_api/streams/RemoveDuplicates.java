package streams_api.streams;

import java.util.Arrays;

public class RemoveDuplicates {
	
	public static void main(String args[]) {
		
		String s = "dabcadefg";
		
		s.chars().distinct().mapToObj(x -> (char)x).forEach(System.out::print);
		
		Arrays.stream(s.split("")).distinct().forEach(System.out::println);
		
	}

}
