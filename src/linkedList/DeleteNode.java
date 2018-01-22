package linkedList;

import java.util.Arrays;

/**
 * delete node which is provided. O(1)
 * @author 80635
 *
 */
public class DeleteNode {

	public Node deleteNode(Node listHead, Node deleteNode) {
		if(listHead == null || deleteNode == null) {
			return listHead;
		}
		if(deleteNode == listHead) {
			return listHead.getNext();
		}else if(deleteNode.getNext() != null) {
			Node nextNode = deleteNode.getNext();
			deleteNode.setValue(nextNode.getValue());
			deleteNode.setNext(nextNode.getNext());
		}else {
			Node curNode = listHead;
			while(curNode.getNext() != deleteNode) {
				curNode = curNode.getNext();
			}
			curNode.setNext(curNode.getNext().getNext());
		}
		return listHead;
	}
	
	public static void main(String[] args) {
		LinkedListCreator llc = new LinkedListCreator();
		Node listHead = llc.createLinkedListByLoop(Arrays.asList(1,2,3,4,5));
		Node.printLinkedList(listHead);
		DeleteNode dn = new DeleteNode();
		Node deleteNode = listHead;
		Node result = dn.deleteNode(listHead, deleteNode);
		Node.printLinkedList(result);
	}
}
