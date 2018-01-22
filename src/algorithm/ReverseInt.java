package algorithm;

/**
 * 反转数字
 * @author 80635
 *
 */
public class ReverseInt {

	public static int reverse(int x)
	{
	    int result = 0;

	    while (x != 0)
	    {
	        int tail = x % 10;
	        int newResult = result * 10 + tail;
	        if ((newResult - tail) / 10 != result)
	        { return 0; }
	        result = newResult;
	        x = x / 10;
	    }

	    return result;
	}
	
	public static void test1() {
		for (int i = 0; i < 100000; i++) {
			Integer a = new Integer(i);
//			System.out.print(a + " ");
		}
	}
	
	public static void test2() {
		Integer a;
		for (int i = 0; i < 100000; i++) {
			a = new Integer(i);
//			System.out.print(a + " ");
		}
	}
	
	public static int reverse2(int x) {
        int output = 0;
        
        while (true) {
            if (x == 0) {
                return x;
            }
            
            output = output * 10 + x % 10;
            
            if ((x /= 10) == 0) {
                return output;
            }
            
            if (output > 214748364 || output < -214748364) {
                return 0;
            }
        }
    }
	
	public static void main(String[] args) {
		System.out.println(reverse2(-1234));
//		long startTime = System.currentTimeMillis();
//		System.out.println(startTime);
//		test1();
//		System.out.println();
//		long endTime = System.currentTimeMillis();
//		System.out.println(endTime - startTime);
	}
}
