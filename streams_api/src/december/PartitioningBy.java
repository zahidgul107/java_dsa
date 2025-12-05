package december;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningBy {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		Map<Boolean, List<Integer>> partition = nums.stream()
				.collect(Collectors.partitioningBy(n -> n % 2 == 0));
		
		System.err.println(partition);

	}

}
