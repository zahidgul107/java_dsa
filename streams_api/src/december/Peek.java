package december;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Peek {

	public static void main(String args[]) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

		List<Integer> result = nums.stream().peek(n -> System.out.println("Before filter: " + n))
				.filter(n -> n % 2 == 0).peek(n -> System.out.println("After filter: " + n))
				.collect(Collectors.toList());

		System.out.println(result);

	}

}
