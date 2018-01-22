package tree;

import java.util.Arrays;

/**
 * 将二叉搜索树转为已排序的双向链表，不能创建新结点(待完善)
 * @author 80635
 *
 */
public class BinarySearchTree2DoublyLinkedList {
	
	public static IntNode Convert(IntNode root) {
		IntNode lastNodeInList = null;
		ConvertNode(root, lastNodeInList);
		IntNode headOfList = lastNodeInList;
		while(headOfList != null && headOfList.getLeft() != null) {
			headOfList = headOfList.getLeft();
		}
		return headOfList;
	}

	private static void ConvertNode(IntNode node, IntNode lastNodeInList) {
		if(node == null) {
			return;
		}
		IntNode current = node;
		if(current.getLeft() != null) {
			ConvertNode(current.getLeft(), lastNodeInList);
		}
		current.setLeft(lastNodeInList);
		if(lastNodeInList != null) {
			lastNodeInList.setRight(current);
		}
		lastNodeInList = current;
		if(current.getRight() != null) {
			ConvertNode(current.getRight(), lastNodeInList);
		}
	}

	public static IntNode binarySearchTree2DoublyLinkedList(IntNode root) {
		
		if(root == null) {
			return root;
		}
		IntNode maxLeft = null;
		if(root.getLeft() == null) {
			maxLeft.setRight(root);
		}else {
			return binarySearchTree2DoublyLinkedList(root.getLeft());
		}
		IntNode minRight = null;
		if(root.getRight() == null) {
			minRight.setLeft(root);
		}else {
			return binarySearchTree2DoublyLinkedList(root.getRight());
		}
		
		IntNode head = root;
		while(head != null) {
			if(head.getLeft() == null) {
				return head;
			}
			head = head.getLeft();
		}
		return head;
	}

	private static IntNode findTheMinNodeInRight(IntNode root) {
		// TODO Auto-generated method stub
		if(root.getRight() == null) {
			if(root.getLeft() != null) {
				return findTheMaxNodeInLeft(root.getLeft());
			}else {
				return root.getLeft();
			}
		}else {
			return findTheMinNodeInRight(root.getRight());
		}
	}

	private static IntNode findTheMaxNodeInLeft(IntNode root) {
		// TODO Auto-generated method stub
		if(root.getLeft() == null) {
			if(root.getRight() != null) {
				return findTheMinNodeInRight(root.getRight());
			}else {
				return root;
			}
		}else {
			return findTheMaxNodeInLeft(root.getLeft());
		}
	}
	
	public static void main(String[] args) {
		TreeCreator tc = new TreeCreator();
		IntNode root = tc.createTree(Arrays.asList(8,5,4,7,6,9,10), Arrays.asList(4,5,6,7,8,9,10));
		IntNode linkedList = Convert(root);
		System.out.println(linkedList.getValue());
		IntNode temp = linkedList;
		while(temp != null) {
			System.out.println(temp.getValue());
			temp = temp.getRight();
		}
	}
}
