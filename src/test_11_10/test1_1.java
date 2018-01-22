package test_11_10;

public class test1_1<T> {
	
	protected static int as = 1;
	
	private int a = 1;
	

	public test1_1(int a) {
		super();
		this.a = a;
	}

	public static int getAs() {
		return as;
	}

	public static void setAs(int as) {
		test1_1.as = as;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
}
