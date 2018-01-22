package tree;

/**
 * 判断数组是否二叉搜索树的后序遍历
 * @author 80635
 *
 */
public class IsBinarySearchTree {

	/**
	 * 判断是否二叉搜索树 (有问题)
	 * @param post 后续遍历数组
	 * @return
	 */
	public static boolean isBinarySearchTree(int[] post) {
		if(post == null || post.length <= 0) {
			return false;
		}
		boolean isBinarySearchTree = true;
		//get the root value
		int root = post[post.length - 1];
		
		if(post[0] > root) {
			int i = 0;
			int pre = post[i];
			while(i < post.length - 1) {
				if(post[i + 1] > pre) {
					isBinarySearchTree = false;
					break;
				}
				pre = post[i + 1];
				i++;
			}
		}
		
		if(post[0] <= root) {
			int i = 0;
			int pre = post[i];
			int leftBiggest = post[0];
			int rightStart;
			while(i < post.length - 1) {
				if(post[i + 1] < pre) {
					if(post[i + 1] < root) {
						return false;
					}
					leftBiggest = post[i - 1];
					rightStart = i;
					break;
				}
				pre = post[i + 1];
				i++;
			}
			while(i < post.length - 1) {
				if(post[i + 1] > pre || post[i + 1] < leftBiggest) {
					isBinarySearchTree = false;
					break;
				}
				pre = post[i + 1];
				i++;
			}
		}
		
		return isBinarySearchTree;
	}
	
	/**
	 * 递归解法
	 * @param sequence 后序遍历数组
	 * @param length 数组长度
	 * @return
	 */
	public static boolean verifySquenceOfBSF(int sequence[], int length) {
		if(sequence == null || length <= 0) {
			return false;
		}
		int root = sequence[length - 1];
		//左子树的结点小于根节点
		int i = 0;
		for(; i < length - 1; i++) {
			if(sequence[i] > root) {
				break;
			}
		}
		//右子树的结点大于根节点
		int j = i;
		for(; j < length - 1; j ++) {
			if(sequence[j] < root) {
				return false;
			}
		}
		//判断左子树是不是二叉搜索树
		boolean left = true;
		if(i > 0) {
			left = verifySquenceOfBSF(sequence, i);
		}
		////判断右子树是不是二叉搜索树
		boolean right = true;
		if(j < length - 1) {
			right = verifySquenceOfBSF(sequence, length - i - 1);
		}
		return left && right;
	}
	
	public static void main(String[] args) {
		int[] a = {5,7,6,9,11,10,8};
		int[] b = {};
		int[] c = {3,4,6,9,8,10};
		int[] d = {9,8,7,6,5};
		int[] e = {6,9,8,7,6,5};
		int[] f = {9,8,7,6,3,10};
		int[] g = {1,3,9,8,2};
		int[] h = {1,2,3,4,5};
		int[] i = {3,3,3,3};
		int[] j = {9,15,8,10};
		System.out.println(isBinarySearchTree(a));
		System.out.println(isBinarySearchTree(b));
		System.out.println(isBinarySearchTree(c));
		System.out.println(isBinarySearchTree(d));
		System.out.println(isBinarySearchTree(e));
		System.out.println(isBinarySearchTree(f));
		System.out.println(isBinarySearchTree(g));
		System.out.println(isBinarySearchTree(h));
		System.out.println(isBinarySearchTree(i));
		System.out.println(isBinarySearchTree(j));
		
		System.out.println();
		
		System.out.println(verifySquenceOfBSF(a, a.length));
		System.out.println(verifySquenceOfBSF(b, b.length));
		System.out.println(verifySquenceOfBSF(c, c.length));
		System.out.println(verifySquenceOfBSF(d, d.length));
		System.out.println(verifySquenceOfBSF(e, e.length));
		System.out.println(verifySquenceOfBSF(f, f.length));
		System.out.println(verifySquenceOfBSF(g, g.length));
		System.out.println(verifySquenceOfBSF(h, h.length));
		System.out.println(verifySquenceOfBSF(i, i.length));
		System.out.println(verifySquenceOfBSF(j, j.length));
	}
}
