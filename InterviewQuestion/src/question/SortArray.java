package question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortArray {
	
	public static void main(String args[]) {
		int[] arr = {8, 2, 9, 3, 1, 5};
		int temp = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int num : arr) {
			System.err.println(num);
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		Collections.addAll(list, 1,2,3,2,4,5,6,9,6);
		
		System.err.println(sort(list));
		System.err.println("Sort by Descending " + sortByDesc(list));
		
	}

	private static List<Integer> sortByDesc(ArrayList<Integer> list) {
		return list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	}

	private static List<Integer> sort(ArrayList<Integer> list) {
		
		return list.stream().sorted().collect(Collectors.toList());
	}

}
