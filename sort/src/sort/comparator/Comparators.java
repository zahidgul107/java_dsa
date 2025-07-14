package sort.comparator;

import java.util.Arrays;
import java.util.List;

public class Comparators {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("banana", "apple", "date");
		list.sort((a, b) -> a.length() - b.length());
		System.err.println(list);

	}

}
