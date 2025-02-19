package java_8.stream;

import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
	
	public static void main(String args[]) {
		List<Integer> list = List.of(2, 4, 5 ,7, 8);
		List<Integer> evenList =  list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.err.println(evenList);
	}

}
