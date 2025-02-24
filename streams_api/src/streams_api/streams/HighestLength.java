package streams_api.streams;

import java.util.Arrays;
import java.util.Comparator;

public class HighestLength {
	
	public static void main(String args[]) {
		
		String s = "I am learning stream api in java";
		
		String ans = Arrays.stream(s.split(" "))
				.max(Comparator.comparing(String::length)).get();
		
		System.err.println(ans);
		
	}

}
