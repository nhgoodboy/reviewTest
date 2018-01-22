package sort;

import java.util.Arrays;

public class ShellSort {
	
	public static void sort(int[] arr) {
		for (int delta = arr.length / 2; delta >= 1; delta /= 2) { //对每个增量进行一次排序
			for (int i = delta; i < arr.length; i++) {
				for (int j = i; j >= delta && arr[j] < arr[j - delta]; j -= delta) {  //注意每个地方增量和差值都是delta
					int temp = arr[j - delta];
					arr[j - delta] = arr[j];
					arr[j] = temp;
				}
			} //loop i
		}  //loop delta
	}
	
	public static void main(String[] args) {
		int[] arr = { 2, 4, -1, 9, 0, 7, 4, 5 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
