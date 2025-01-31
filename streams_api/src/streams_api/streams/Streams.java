package streams_api.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Streams {

	public static void main(String[] args) {
		
		
		List<Integer> nums = Arrays.asList(6, 5, 2, 8, 1, 7);
		
		Predicate<Integer> predi = n -> n%2==1;
		
		Predicate<Integer> predi1 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer n) {
				return n % 2 == 1;
			}			
		};
		
		Function<Integer, Integer> fun1 = n -> n*2;
		
		Function<Integer, Integer> fun = new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer n) {
				return n*2;
			}
		};
		
		
		
		nums.stream()
				.filter(n -> n%2==1)
				.sorted()
				.map(fun)
				.forEach(System.err::println);
	}

}
