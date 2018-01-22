package algorithm;

/**
 * 数组中某个数字的次数
 * @author 80635
 *
 */
public class GetTimeOfNum {
	
	public static int getTimeOfNum(int[] array, int num) {
		int time = 0;
		if(array != null && array.length > 0) {
			int first = getFirstNum(array, num, 0, array.length - 1);
			int last = getEndNum(array, num, 0, array.length - 1);
			if(first > -1 && last > -1) {
				time = last - first + 1;
			}
		}
		return time;
	}

	private static int getFirstNum(int[] array, int num, int start, int end) {
		if(start > end ) {
			return -1;
		}
		int middleIndex = (start + end) / 2;
		int middleNum = array[middleIndex];
		if(middleNum == num) {
			if((middleIndex > 0 && array[middleIndex - 1] != num) || middleIndex == 0) {
				return middleIndex;
			}else {
				end = middleIndex - 1;
			}
		}else if(middleNum > num) {
			end = middleIndex - 1;
		}else {
			start = middleIndex + 1;
		}
		return getFirstNum(array, num, start, end);
	}

	private static int getEndNum(int[] array, int num, int start, int end) {
		if(start > end) {
			return -1;
		}
		int middleIndex = (start + end) / 2;
		int middleNum = array[middleIndex];
		if(middleNum == num) {
			if((middleIndex < array.length - 1 && array[middleIndex + 1] != num) 
					|| middleIndex == array.length - 1) {
				return middleIndex;
			}else {
				start = middleIndex + 1;
			}
		}else if(middleNum < num) {
			start = middleIndex + 1;
		}else {
			end = middleIndex - 1;
		}
		return getEndNum(array, num, start, end);
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,3,3,3,3,5,9};
		System.out.println(getTimeOfNum(a, 3));
	}
}
