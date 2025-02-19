package java_8.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElement {
	
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>();
		Collections.addAll(list, 1,2,3,2,4,5,6,9,6);
		Set<Integer> set = new HashSet<>();
		
		List<Integer> duplicateList = list.stream().filter(n -> !set.add(n)).collect(Collectors.toList());
		System.err.println(duplicateList);
	}

}
