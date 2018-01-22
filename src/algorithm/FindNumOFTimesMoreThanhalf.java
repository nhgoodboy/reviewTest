package algorithm;

/**
 * 找出数组中次数大于数组大小的一半的数字
 * @author 80635
 *
 */
public class FindNumOFTimesMoreThanhalf {

	public static int findNum(int[] a) {
		if(a == null || a.length < 1) {
			return 0x80000000;
		}
		if(a.length == 1) {
			return a[0];
		}
		int cur = a[0];
		int times = 1;
		for(int i = 1; i < a.length; i++) {
			if(a[i] == cur) {
				times++;
			}else {
				if(times > 0) {
					times--;
				}else {
					cur = a[i];
					times = 1;
				}
			}
		}
		return cur;
	}
	
	public static void main(String[] args) {
		System.out.println(findNum(new int[] {1,2,3,3,3,2}));
		System.out.println(findNum(null));
		System.out.println(findNum(new int[] {1}));
		System.out.println(findNum(new int[] {1,2}));
	}
}
