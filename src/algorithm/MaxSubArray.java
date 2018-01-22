package algorithm;

/**
 * 求数组的最大子数组的和，时间复杂度为O(n),空间复杂度为O(1)
 * @author 80635
 *
 */
public class MaxSubArray {

	private static boolean invalidInput = false;
	public static int maxSubArray(int[] array) {
		if(array == null || array.length <= 0) {
			invalidInput = true;
			return 0;
		}
		invalidInput = false;
		
		int curSum = 0;
		int greatestSum = 0x80000000;  //最小的整数
		for(int i = 0; i < array.length; i++) {
			if(curSum <= 0) {  //当前子数组和小于0即把下一个数赋给当前子数组的和
				curSum = array[i];
			}else {         
				curSum += array[i];
			}
			if(curSum > greatestSum){  //当前子数组和大于保存的最大值即更新最大值
				greatestSum = curSum;
			}
		}
		return greatestSum;
	}
	
	public static void main(String[] args) {
		System.out.println(0x80000000);
		int[] a = {-4, -9, -5, -40, -6, -11};
		if(!invalidInput) {
			System.out.println(maxSubArray(a));
		}else {
			System.out.println("invalidInput");
		}
//		System.out.println(new String("1234").length());
//		System.out.println(new String("3680").compareTo(new String("332")));
	}
}
