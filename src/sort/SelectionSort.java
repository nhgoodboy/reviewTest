package sort;

import java.util.Arrays;

public class SelectionSort {

	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int mink = i;
			for (int j = i + 1; j < arr.length; j++) { // 找出剩下的最小的值
				if (arr[j] < arr[mink]) {
					mink = j;
				}
			}
			if (mink != i) {
				int temp = arr[mink];
				arr[mink] = arr[i];
				arr[i] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, -1, 9, 0, 7, 4, 5 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
