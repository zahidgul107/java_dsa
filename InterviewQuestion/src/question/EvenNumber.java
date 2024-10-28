package question;

import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
	
	public static void main(String[] args) {
		List<Integer> list = List.of(2, 4, 5, 7, 8);
		List<Integer> evenL = checkEven(list);
		System.err.println(evenL);
	}

	public static List<Integer> checkEven(List<Integer> list) {
		return list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
	}

}
