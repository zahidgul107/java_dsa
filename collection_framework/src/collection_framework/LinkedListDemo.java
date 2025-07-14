package collection_framework;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		Node node1 = new Node();
		Node node2 = new Node();
		
		node1.value = 1;
		node2.value = 2;
		
		node1.next = node2;
		node2.next = null;
		
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.get(2);  	// 0(n)
		linkedList.addLast(4); 	// 0(1)
		linkedList.addFirst(0); // 0(2)
		linkedList.getFirst();
		linkedList.getLast();
		
		System.err.println(linkedList);
		
		linkedList.removeIf(n -> n % 2 == 0);
		
		System.err.println(linkedList);
		
		LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "Dog", "Elephant"));
		LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog", "Lion"));
		
		animals.removeAll(animalsToRemove);
		
		System.err.println(animals);
		
	}

}

class Node {
	
	public int value;
	
	public Node next;
}
