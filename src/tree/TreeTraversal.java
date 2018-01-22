package tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {
	
	/**
	 * 宽度优先遍历 BFS Breadth First Search
	 */
	public void widthOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		Queue<TreeNode> nodeQueue = new LinkedList<>();
		nodeQueue.add(root);
		while(!nodeQueue.isEmpty()) {
			TreeNode tempNode = nodeQueue.poll();
			System.out.print(tempNode.getValue());
			if(tempNode.getLeft() != null) {
				nodeQueue.add(tempNode.getLeft());
			}
			if(tempNode.getRight() != null) {
				nodeQueue.add(tempNode.getRight());
			}
		}
	}
	
	//深度优先遍历 DFS Depth First Search
	/**
	 * 前序遍历
	 * @param root
	 */
	public void preOrder(TreeNode root) {
		if(root == null){
			return;
		}
		System.out.print(root.getValue());
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}
	
	public void preOrder(IntNode root) {
		if(root == null){
			return;
		}
		System.out.print(root.getValue());
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}
	
	/**
	 * 中序遍历
	 * @param root
	 */
	public void inOrder(TreeNode root) {
		if(root == null){
			return;
		}
		inOrder(root.getLeft());
		System.out.print(root.getValue());
		inOrder(root.getRight());
	}
	
	/**
	 * 后序遍历
	 * @param root
	 */
	public void postOrder(TreeNode root) {
		if(root == null){
			return;
		}
		postOrder(root.getLeft());
		postOrder(root.getRight());
		System.out.print(root.getValue());
	}
	
	public static void main(String[] args) {
		TreeCreator tc = new TreeCreator();	
		TreeNode root = tc.createTree("ABDEGCF", "DBGEACF");
		TreeTraversal tt = new TreeTraversal();
		tt.preOrder(root);
		System.out.println();
		tt.inOrder(root);
		System.out.println();
		tt.postOrder(root);
		System.out.println();
		tt.widthOrder(root);
	}
}
