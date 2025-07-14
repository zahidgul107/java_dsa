package collection_framework;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>(5, 3);
		
		vector.add(1);
		vector.add(1);
		vector.add(1);
		vector.add(1);
		vector.add(1);
		System.err.println(vector.capacity());
		vector.add(1);
		System.err.println(vector.capacity());
		vector.add(1);
		vector.add(1);
		System.err.println(vector.capacity());
		vector.add(1);
		System.err.println(vector.capacity());
		LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3));
		
		Vector<Integer> vector1 = new Vector<>(linkedList);
		System.err.println(vector1);
		
		
	}

}
