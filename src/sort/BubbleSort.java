package sort;

import java.util.Arrays;

public class BubbleSort {

	public static void sort(int[] arr) {
		boolean flag = true;  //判断是否已排好序
		for (int i = 0; i < arr.length - 1 && flag; i++) {
			flag = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {2, 4, -1, 9, 0, 7, 4}; 
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
