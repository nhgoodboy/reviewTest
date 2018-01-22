package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 查找路径中值的和为指定数量的路径，并打印出来
 * @author 80635
 *
 */
public class FindPath {

	public static void findPath(IntNode root, int expectedSum) {
		if(root == null) {
			return;
		}
		int currentSum = 0;
		List<Integer> pathList = new ArrayList<>();
		
		findThePath(root, expectedSum, currentSum, pathList);
	}
	
	private static void findThePath(IntNode root, int expectedSum, int currentSum, List<Integer> pathList) {
		currentSum += root.getValue();
		pathList.add(root.getValue());
		boolean isLeaf = (root.getLeft() == null) && (root.getRight() == null);  //判断是否叶结点
		if(isLeaf && currentSum == expectedSum) {  //是叶结点并且路径值符合
			for (Integer i : pathList) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		if(currentSum < expectedSum) {
			if(root.getLeft() != null) {
				findThePath(root.getLeft(), expectedSum, currentSum, pathList);
			}
			if(root.getRight() != null) {
				findThePath(root.getRight(), expectedSum, currentSum, pathList);
			}
		}
		
		//在返回父结点之前，在路径上删除当前结点，并在currentSum中减去当前的值
		currentSum -= root.getValue();
		pathList.remove(pathList.size() - 1);
	}

	public static void main(String[] args) {
		TreeCreator tc = new TreeCreator();
		IntNode root = tc.createTree(Arrays.asList(1,2,4,6,8,3,7), Arrays.asList(4,2,8,6,1,3,7));//ABDEGCF", "DBGEACF"
		TreeTraversal tt = new TreeTraversal();
		findPath(root, 17);
	}
}
