package algorithm;

/**
 * 某数的某次方
 * @author 80635
 *
 */
public class PowerWithUnsignedExponent {

	public static double powerWithUnsignedExponent(double base, int exponent) {
		if(exponent == 0) {
			return 1;
		}
		if(exponent == 1) {
			return base;
		}
		
		double result = powerWithUnsignedExponent(base, exponent >> 1);
		result *= result;
		if((exponent & 1) == 1) {
			return result *= base;
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(powerWithUnsignedExponent(2, 4));
	}
}
