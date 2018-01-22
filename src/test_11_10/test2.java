package test_11_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test2<T> extends test1_1{

	public test2(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	private static int a = 2;
	
	public final void method1() {
		System.out.println(super.getA());
	}
	
	public void method1(test1_1<?> a) {
		
	}
	
	public void method2(Object a) {
		System.out.println(a.getClass().getSimpleName());
	}
	
	public static void main(String[] args) throws IOException {
		test1_1 test1 = new test1_1(a);
		test2 ts2 = new test2<>(a);
		System.out.println(ts2.getAs());
		ts2.setAs(14);
		ts2.method1();
		System.out.println(ts2.getAs());
		System.out.println(test1.getAs());
		ts2.method1();
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
}
