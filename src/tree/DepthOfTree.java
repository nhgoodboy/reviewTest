package tree;

/**
 * 求二叉树的深度
 * @author 80635
 *
 */
public class DepthOfTree {

	public static int depthOfTree(TreeNode root) {
		if(root == null) {
			return 0;
		}
		int leftDepth = depthOfTree(root.getLeft());
		int rightDepth = depthOfTree(root.getRight());
		return Math.max(leftDepth, rightDepth) + 1;  // leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
	}
	
	public static void main(String[] args) {
		TreeCreator tc = new TreeCreator();	
		TreeNode root = tc.createTree("ABDEGCF", "DBGEACF");
		System.out.println(depthOfTree(root));
	}
}
