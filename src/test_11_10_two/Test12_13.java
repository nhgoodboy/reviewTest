package test_11_10_two;

import java.util.Arrays;

public class Test12_13 {
	private static boolean b2;
	private  int a1;

	public int method1() {
		int a2 = 0;
		return a2;
	}
	
	public static void main(String[] args) {
		int[] a = new int[] {1,2,3,4,5};
		int[] b = a;
		b[2] = 6;
//		System.out.println(Arrays.toString(a));
//		for (int i : a) {
//			System.out.println(i);
//		}
		int[] c = new int[2];
		int k = 0;
		c[k++] = 1;
		System.out.println(Arrays.toString(c));
		
		boolean b1 = false;
		if(b1 = false) {
			System.out.println("adsdsf");
		}else {
			System.out.println("zzz");
		}
		
		System.out.println(b2);
		System.out.println(new Test12_13().a1);
		System.out.println(new Test12_13().method1());
	}
}
