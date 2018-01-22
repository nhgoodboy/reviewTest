package test_11_10_two;

import java.util.HashMap;
import java.util.Map;

import test_11_10.ProtectedTest;

public class MainTest2 extends Thread{
	
	public static int d = 3;

	
	public void methodTest() {
		System.out.println();
	}
	
	public void method1() {
		System.out.println("MainTest2.method1()");
	}

	public static void main(String[] args) {
		MainTest2 pt = new MainTest2();
		pt.method1();
//		ProtectedTest test = new ProtectedTest();
//		MainTest2 maintest = new MainTest2();
//		maintest.methodTest();
//		System.out.println(test.a);
//		System.out.println(test.b);
//		System.out.println(test.c);
//		System.out.println(test.d);
//		System.out.println(maintest.c);
		System.out.println((int)(180.00 / 100.00));
		String a = new String("123");
		String b = new String("123");
		System.out.println(a == b);
		for(int i = 1; i < 6; i++) {
			if(i < 5) {
				continue;
			}
		}
		int[] a1 = {1,2,3,4,5};
		int asd = a1.length;
		System.out.println("asd:" + new int[]{0,1,2,3});
		MainTest2 test2 = new MainTest2();
		test2.method1();
		
		Map map = new HashMap<>();
//		map.ge
	}
	
	public void method11() {
		 final int x = 2;
		 System.out.println(x);
	}
	
//	public void method2() {
//		 final int z = 2;
//		 System.out.println(x);
//	}
}
