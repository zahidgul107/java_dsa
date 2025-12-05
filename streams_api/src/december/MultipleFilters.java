package december;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultipleFilters {
	
	public static void main(String args[]) {
		
		List<Integer> nums = Arrays.asList(1, 5, 10, 15, 20, 25);
		
		List<Integer> filtered = nums.stream()
				.filter(n -> n > 10)
				.filter(n -> n % 5 == 0)
				.collect(Collectors.toList());
		
		System.err.println(filtered);
	}

}
