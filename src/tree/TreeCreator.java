package tree;

import java.util.List;

public class TreeCreator {

	/**
	 * 根据前序遍历和中序遍历生成二叉树
	 * @param preOrder
	 * @param inOrder
	 * @return
	 */
	public TreeNode createTree(String preOrder, String inOrder) {
		if(preOrder.isEmpty()) {
			return null;
		}
		
		char rootValue = preOrder.charAt(0);
		int rootIndex = inOrder.indexOf(rootValue);
		
		TreeNode root = new TreeNode(rootValue);
		root.setLeft(
				createTree(
					preOrder.substring(1, 1 + rootIndex),
					inOrder.substring(0, rootIndex)
				));
		root.setRight(
				createTree(
					preOrder.substring(1 + rootIndex),
					inOrder.substring(1 + rootIndex)
				));
		
		return root;
	}
	
	/**
	 * 根据前序遍历和中序遍历生成二叉树
	 * @param preOrder
	 * @param inOrder
	 * @return
	 */
	public IntNode createTree(List<Integer> preOrder, List<Integer> inOrder) {
		if(preOrder.isEmpty()) {
			return null;
		}
		
		int rootValue = preOrder.get(0);
		int rootIndex = inOrder.indexOf(rootValue);
		
		IntNode root = new IntNode(rootValue);
		root.setLeft(
				createTree(
					preOrder.subList(1, 1 + rootIndex),
					inOrder.subList(0, rootIndex)
				));
		root.setRight(
				createTree(
					preOrder.subList(1 + rootIndex, preOrder.size()),
					inOrder.subList(1 + rootIndex, inOrder.size())
				));
		
		return root;
	}
}
