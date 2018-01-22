package linkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinkedListCreator {
	
	/**
	 * delete if value of linkedList equal value
	 * @param head
	 * @param value
	 * @return new head
	 */
	public Node deleteIfEqual(Node head, int value) {
		
		while(head != null && head.getValue() == value) {
			head = head.getNext();
		}
		
		if(head == null) {
			return null;
		}
		
		Node prev = head;
		
		while(prev.getNext() != null) {
			if(prev.getNext().getValue() == value) {
				prev.setNext(prev.getNext().getNext());
			}else {
				prev = prev.getNext();
			}
		}
		
		return head;
	}
	
	/**
	 * use loop to reverse the linkedlist
	 * @param head
	 * @return
	 */
	public Node reverseLinkedListByLoop(Node head) {
		
		Node newHead = null;
		Node curHead = head;
		
		while(curHead != null) {
			//先得到当前节点 的下一节点
			Node next = curHead.getNext();
			//反转后，当前节点的下一节点为newHead
			curHead.setNext(newHead);
			//将当前节点赋给newHead
			newHead = curHead;
			//将反转前的当前的下一节点赋给curHead
			curHead = next;
		}
		return newHead;
	}

	/**
	 * 递归创建链表
	 * @param data
	 * @return
	 */
	public Node createLinkedList(List<Integer> data) {
		if(data.isEmpty()) {
			return null;
		}
		Node firstNode = new Node(data.get(0));
		firstNode.setNext(createLinkedList(data.subList(1, data.size())));
		return firstNode;
	}
	
	/**
	 * 利用循环创建链表
	 * @param data
	 * @return
	 */
	public Node createLinkedListByLoop(List<Integer> data) {
		if(data == null || data.size() == 0) {
			return null;
		}
		Node firstNode = new Node(data.get(0));
		Node curNode = firstNode; 
		int i = 1;
		while(i < data.size()) {
			curNode.setNext(new Node(data.get(i)));
			curNode = curNode.getNext();
			i++;
		}
		curNode.setNext(null);
		return firstNode;
	}
	
	/**
	 * 递归反转链表
	 * @param head
	 * @return
	 */
	public Node reverseLinkedList(Node head) {
		if(head == null || head.getNext() == null) {
			return head;
		}
		Node newHead = reverseLinkedList(head.getNext());
		head.getNext().setNext(head);
		head.setNext(null);
		return newHead;
	}
	
	/**
	 * 合并两个有序链表，合并后的链表也有序
	 * @param args
	 */
	public Node mergeLinkedList(Node list1, Node list2) {
		if(list1 == null) {
			return list2;
		}
		if(list2 == null) {
			return list1;
		}
		Node mergedList = new Node();
		if(list1.getValue() <= list2.getValue()) {
			mergedList.setValue(list1.getValue());
			mergedList.setNext(mergeLinkedList(list1.getNext(), list2));
		}else {
			mergedList.setValue(list2.getValue());
			mergedList.setNext(mergeLinkedList(list1, list2.getNext()));
		}
		return mergedList;
	}
	
	public static void main(String[] args) {
		
		LinkedListCreator linkedListCreator = new LinkedListCreator();
		Node list1 = linkedListCreator.createLinkedListByLoop(new ArrayList<>());
		Node list2 = linkedListCreator.createLinkedListByLoop(Arrays.asList(2,4,6,9,10));
		Node.printLinkedList(linkedListCreator.mergeLinkedList(list1, list2));
		
//		Node.printLinkedList(linkedListCreator.createLinkedListByLoop(Arrays.asList(1,2,3,4,5,6,7)));
//		Node.printLinkedList(linkedListCreator.createLinkedListByLoop(new ArrayList<>()));
//		Node.printLinkedList(linkedListCreator.createLinkedListByLoop(Arrays.asList(1)));
//		Node.printLinkedList(linkedListCreator.createLinkedListByLoop(Arrays.asList(1,2,3,4,5)));
//		Node.printLinkedList(linkedListCreator.createLinkedListByLoop(Arrays.asList(3,4,5,6,7)));
//		Node.printLinkedList(linkedListCreator.createLinkedListByLoop(null));
//		Node.printLinkedList(linkedListCreator.createLinkedListByLoop(Arrays.asList(1,2,3,4,5,6,7)));
//		Node.printLinkedList(linkedListCreator.reverseLinkedList(linkedListCreator.createLinkedList(new ArrayList<>())));
//		Node.printLinkedList(linkedListCreator.reverseLinkedList(linkedListCreator.createLinkedList(Arrays.asList(1))));
//		Node.printLinkedList(linkedListCreator.reverseLinkedList(linkedListCreator.createLinkedList(Arrays.asList(1,2,3,4,5,6,7))));
//		Node.printLinkedList(linkedListCreator.reverseLinkedListByLoop(linkedListCreator.createLinkedList(Arrays.asList(1,2,3,4,5,6,7))));
//		Node.printLinkedList(linkedListCreator.reverseLinkedListByLoop(linkedListCreator.createLinkedList(Arrays.asList(1))));
//		Node.printLinkedList(linkedListCreator.reverseLinkedListByLoop(linkedListCreator.createLinkedList(new ArrayList<>())));
		
		//delete
//		Node.printLinkedList(linkedListCreator.deleteIfEqual(linkedListCreator.createLinkedList(Arrays.asList(1,2,3,4,5,6,7)), 2));
//		Node.printLinkedList(linkedListCreator.deleteIfEqual(linkedListCreator.createLinkedList(Arrays.asList(1)), 1));
//		Node.printLinkedList(linkedListCreator.deleteIfEqual(linkedListCreator.createLinkedList(new ArrayList<>()), 1));
	}
}
