/**
 * 
 */
/**
 * @author 80635
 *
 */
package tree;

public class TreeNode{
	
	private final char value;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode(char value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	public char getValue() {
		return value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((left == null) ? 0 : left.hashCode());
		result = prime * result + ((right == null) ? 0 : right.hashCode());
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TreeNode other = (TreeNode) obj;
		if (left == null) {
			if (other.left != null)
				return false;
		} else if (!left.equals(other.left))
			return false;
		if (right == null) {
			if (other.right != null)
				return false;
		} else if (!right.equals(other.right))
			return false;
		if (value != other.value)
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		TreeNode a = new TreeNode('1');
		TreeNode b = new TreeNode('2');
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
	}
}