package tree;

/**
 * 求树的镜像
 * @author 80635
 *
 */
public class InversionTree {

	public static TreeNode inversionOfTree(TreeNode root) {
		if(root == null) {
			return null;
		}
		TreeNode tempNode = root.getLeft();
		root.setLeft(root.getRight());
		root.setRight(tempNode);
		inversionOfTree(root.getLeft());
		inversionOfTree(root.getRight());
		
		return root;
	}
	
	public static void main(String[] args) {
		TreeCreator tc = new TreeCreator();	
		TreeNode root = tc.createTree("AC", "AC");
		inversionOfTree(root);
		TreeTraversal tt = new TreeTraversal();
		tt.preOrder(root);
		System.out.println();
		tt.inOrder(root);
		System.out.println();
		tt.postOrder(root);
		
	}
}
