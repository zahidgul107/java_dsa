package collection_framework;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<>();		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);		
		System.err.println(s);		
		Integer removedEle = s.pop();		
		System.err.println(s);
		Integer peek = s.peek();
		System.err.println(peek);
		System.err.println(s);
		System.err.println(s.isEmpty());
		System.err.println(s.size());
		int index = s.search(3);
		System.err.println(index);

	}

}
