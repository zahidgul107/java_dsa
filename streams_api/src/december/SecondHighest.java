package december;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighest {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(5, 1, 9, 7, 9, 4);
		
		Integer secondhighest = nums.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.orElse(null);
		
		System.err.println(secondhighest);

	}

}
