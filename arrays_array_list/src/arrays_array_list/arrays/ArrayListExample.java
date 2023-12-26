package arrays_array_list.arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		
//		list.add(2);
//		list.add(24);
//		list.add(254);
//		list.add(24);
//		list.add(27);
//		
//		System.err.println(list);
//		
//		list.set(0, 99);
//		
//		list.remove(2);
		
		// Input
		for(int i = 0; i < 5; i++) {
			list.add(in.hashCode());
		}
		
		// get item at any index
		for(int i = 0; i < 5; i++) {
			System.err.println(list.get(i));
		}
		
	//	System.err.println(list);

	}

}
