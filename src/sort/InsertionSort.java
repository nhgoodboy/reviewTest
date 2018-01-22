package sort;

import java.util.Arrays;

/**
 * 插入排序
 * @author 80635
 *
 */
public class InsertionSort {

	public static void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int value = arr[i];  
			int position = i;
			while (position > 0 && value < arr[position - 1]) {
				arr[position] = arr[position - 1];
				position--;
			}
			arr[position] = value;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, -1, 9, 0, 7, 4, 5 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
