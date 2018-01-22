package test_11_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import test_11_10.EnclosingOne.InsideOne;
import test_11_10_two.MainTest2;

public abstract class MainTest{
	private int a = 100;
	
	
	public void add(int a) {
		this.a = a + 1;
	}
	
	abstract void method2();
	
	public static void main(String[] args) {
		InsideOne asd = new EnclosingOne().new InsideOne();
		List<Integer> a = Arrays.asList(1,2,3,4,5);
		List<Integer> b = a.subList(0, 1);
		System.out.println(MainTest2.d);
//		MainTest mainTest = new MainTest();
//		mainTest.add(20);
//		System.out.println(mainTest.a);
//		Integer a = null;
//		System.out.println(a);
//		ProtectedTest test = new ProtectedTest();
////		System.out.println(test.a);
//		System.out.println(test.b);
//		System.out.println(test.c);
//		System.out.println(test.d);
//		System.out.println(test.e);
//		System.out.println(ProtectedTest.f);
//		System.out.println(test.g);
//		System.out.println(test.h);
//		int i = 2;
//		i = ++i;
//		int b = 2;
//		b = b++;
//		System.out.println(i);
//		System.out.println(b);
//		System.out.println(new ProtectedTest());
//		System.out.println(new ProtectedTest() == new ProtectedTest());
//		System.out.println(new ProtectedTest().i == new ProtectedTest().j);
//		System.out.println(new ProtectedTest().i == new ProtectedTest().k);
//		System.out.println(new ProtectedTest().j == new ProtectedTest().k);
		int sd = test1_1.as;
		System.out.println(sd);
	}
}
