package tree;

/**
 * 判断树A中是否含有子树B
 * @author 80635
 *
 */
public class HasSubTree {

	public boolean hasSubTree(TreeNode a, TreeNode b) {
		boolean result = false;
		if(a != null && b != null) {
			if(a.getValue() == b.getValue()) {
				result = doesAhasB(a, b);
			}
			if(!result) {
				result = hasSubTree(a.getLeft(), b);
			}
			if(!result) {
				result = hasSubTree(a.getRight(), b);
			}
		}
		return result; 
	}
	
	/**
	 * a的子树是否包含b
	 * @param a
	 * @param b
	 * @return
	 */
	private boolean doesAhasB(TreeNode a, TreeNode b) {
		if(b == null) {
			return true;
		}
		if(a == null) {
			return false;
		}
		if(a.getValue() != b.getValue()) {
			return false;
		}
		return doesAhasB(a.getLeft(), b.getLeft()) && doesAhasB(a.getRight(), b.getRight());
	}

	public static void main(String[] args) {
		TreeCreator tc = new TreeCreator();	
		TreeNode a = tc.createTree("ABDEGCF", "DBGEACF");
		TreeNode b = tc.createTree("EG", "GE");
		HasSubTree hst = new HasSubTree();
		System.out.println(hst.hasSubTree(a, b));
	}
	
}
