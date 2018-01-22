package test_11_10;

import test_11_10.EnclosingOne.InsideOne;

class EnclosingOne{
   public class InsideOne {}

}

public class Inertest{
	
	private int testa;
	private Object testc;
	
	public static void main(String[] args) {
		EnclosingOne eo = new EnclosingOne();
		InsideOne in = eo.new InsideOne();
		Inertest it = new Inertest();
		System.out.println(it.testa);
		System.out.println(it.testc);
	}

	public void method1() {
		Object testb = null;
		int testd;
		testd = 3;
		System.out.println(testd);
	}
}