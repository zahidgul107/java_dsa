package question;

public class SinglyLinkedList {
	
	private ListNode head;
	
	public static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void display() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		
		System.out.print("null");
	}
	
	public void insertFirst(int val) {
		ListNode newNode = new ListNode(val);
		newNode.next = head;
		head = newNode;
	}
	
	public void insertLast(int val) {
		ListNode newNode = new ListNode(val);
		if(head == null) {
			return;
		}
		ListNode current = head;
		while(null != current.next) {
			current = current.next;
		}
		current.next = newNode;
	}
	
	public int length() {
		if(head == null) {
			return 0;
		}
		
		int count = 0;
		ListNode current = head;
		while(current != null) {
			count++;
			current = current.next;
		}
		
		return count;
	}
	
	public void insert(int position, int val) {
		ListNode node = new ListNode(val);
		if(position == 1) {
			node.next = head;
			head = node;
		} else {
			ListNode  previous = head;
			int count = 1;
			
			while(count < position - 1) {
				previous = previous.next;
				count++;
			}
			
			ListNode current = previous.next;
			previous.next = node;
			node.next = current;
		}
	}
	
	public ListNode deleteFirst(SinglyLinkedList sll) {
		if(head == null) {
			return null;
		}
		ListNode temp = head;
		head = head.next;
		temp.next = null;	
		return temp;
	}
	
	public ListNode deleteLastNode(SinglyLinkedList ssl) {
		
		if(head == null && head.next == null)
			return head;
		
		ListNode current = head;
		ListNode previous = null;
		while(current.next != null) {
			previous = current;
			current = current.next;		
		}
		previous.next = null;
		return current;
	}
	
	public static void main(String[] args) {
		
		SinglyLinkedList sll = new SinglyLinkedList();
	/*	sll.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(11);  */
		
		// Now we will connect them together to form a chain
	/*	sll.head.next = second;  // 10 --> 1
		second.next = third; // 10 --> 1 --> 8
		third.next = fourth; // 10 --> 1 --> 8 --> 11 --> null 
		
		sll.display();
		System.err.println("Length : " + sll.length());  */
	/*	sll.insertFirst(11);
		sll.insertFirst(8);
		sll.insertFirst(1);  */
	/*	sll.insert(1, 3); // 3 -> null
		sll.insert(2, 5); // 3 -> 5 -> null
		sll.insert(1, 2); // 2 -> 3 -> 5 -> null
		sll.insert(2, 4); // 2 -> 4 -> 3 -> 5 -> null
		sll.insert(5, 7); // 2 -> 4 -> 3 -> 5 -> 7 -> null  */
		sll.insert(1, 10);
		sll.insert(2, 1);
		sll.insert(3, 11);
	//	sll.deleteFirst(sll);
		sll.display();
		sll.deleteLastNode(sll);
		System.err.println("   ");
		sll.display();
	}

}
