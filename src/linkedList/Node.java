/**
 * 
 */
/**
 * @author 80635
 *
 */
package linkedList;

public class Node{
	private int value;
	private Node next;
	
	public Node() {
		super();
	}

	public Node(int value) {
		super();
		this.value = value;
	}
	
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}

	public static void printLinkedList(Node head){
		while(head != null) {
			System.out.print(head.getValue());
			System.out.print(" ");
			head = head.getNext();
		}
		System.out.println();
	}
	
}