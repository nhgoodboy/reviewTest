package tree;

/**
 * 判断是否平衡二叉树
 * @author 80635
 *
 */
public class IsBalance {

	// 总体思路还是按照二叉树后序遍历的方式，先判断左子树，再判断右子树
    // 判断左子树的过程中，要找到 两个 有效信息
    // 第一：左子树的深度； 第二：左子树是否是平衡树
    // 若左子树不是平衡树，则可以判断整棵树不是平衡树，直接返回 false
    // 若左子树是平衡术，则根据返回左子树的深度，返回左子树的深度是为了
    // 当递归最后返回的时候，利用跟节点的左右子树的深度，判断整棵树是不是平衡树
    // 右子树的遍历也是同样的道理

    // 这里定义为一个元素个数的数组，是为了在递归调用时，其中某次递归调用改变了这个值，
    // 对其他所有的过程可见，相当于一个全局变量
	public boolean isBalance(TreeNode head) {
		boolean[] res = new boolean[1];
		res[0] = true;
		getHeight(head, 1, res);
		return res[0];
	}

	 // level 纪录的是，不满足平衡树的节点所在的树中的层次。
	private int getHeight(TreeNode head, int level, boolean[] res) {
		if(head == null) {
			return level;
		}
		int lH = getHeight(head.getLeft(), level + 1, res);
		// 如果发现左子树已经不是平衡二叉树，则直接返回
        // 其实这个 if 语句的判断对整体程序对理解有一点对障碍，完全可以没有，
        // 这个判断对作用就在于，当法相某个左子树已经不是平衡树当时候，可以直接返回了，程序不用在继续递归调用
        // 其实完全可以没有，这样只是减少了算法计算量，但是对于整个程序的理解造成一定的困难，至少对我来说是这样。
		if(!res[0]) {
			return level;
		}
		int rH = getHeight(head.getRight(), level + 1, res);
		if(!res[0]) {
			return level;
		}
		if(Math.abs(lH - rH) > 1) {
			res[0] = false;
		}
		return Math.max(lH, rH);
	}
	
	public static void main(String[] args) {
		TreeCreator tc = new TreeCreator();
		TreeNode root = tc.createTree("ABDEGCF", "DBGEACF");
		IsBalance ib = new IsBalance();
		System.out.println(ib.isBalance(root));
	}
	
	
	//yjz
	public static boolean isBalanceBinaryTree(TreeNode root) {
		boolean[] res = new boolean[1];
		res[0] = true;
		getSubTreeHeight(root, 1, res);
		return res[0];
	}

	private static int getSubTreeHeight(TreeNode root, int level, boolean[] res) {
		if(root == null) {
			return level; 
		}
		int leftHeight = getSubTreeHeight(root.getLeft(), level + 1, res);
		if(!res[0]) {
			return level;
		}
		int rightHeight = getSubTreeHeight(root.getRight(), level + 1, res);
		if(!res[0]) {
			return level;
		}
		if(Math.abs(leftHeight - rightHeight) > 1) {
			res[0] = false;
		}
		return Math.max(leftHeight, rightHeight);
	}
}
