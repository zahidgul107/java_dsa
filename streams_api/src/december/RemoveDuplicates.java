package december;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	
	public static void main(String args[]) {
		
		List<Integer> nums = Arrays.asList(1, 2, 2, 3, 3, 4, 5);
		
		List<Integer> unique = nums.stream()
				.distinct()
				.collect(Collectors.toList());
		
		System.err.println(unique);
	}

}
