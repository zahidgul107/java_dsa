package question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenNumber {
	
	public static void main(String[] args) {
		List<Integer> list = List.of(2, 4, 5, 7, 8); /* Java 9 */
//	    List<Integer> list = Arrays.asList(2, 6, 3, 7, 4);  Java 5
//	    List<Integer> list = new ArrayList<>(Arrays.asList(2, 6, 3, 7, 4));  Java 1.2
//    	List<Integer> list = Stream.of(2, 6, 3, 7, 4).collect(Collectos.toList());  Java 8
		
		List<Integer> evenL = checkEven(list);
		System.err.println(evenL);
	}

	public static List<Integer> checkEven(List<Integer> list) {
		return list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
	}

}
