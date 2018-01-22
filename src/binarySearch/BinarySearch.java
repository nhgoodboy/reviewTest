/**
 * 
 */
/**
 * @author 80635
 *
 */
package binarySearch;

public class BinarySearch{
	
	/**
	 * search element k in a sorted array.
	 * @param arr a sorted array
	 * @param k the element to search
	 * @return index in arr where k is. -1 if not found
	 */
	public int binarySearch(int[] arr, int k) {
		int a = 0;
		int b = arr.length;
		// Loop invariant: [a,b) is a valid range. (a<=b)
		// k may only be within range [a,b)
		while(a < b) {
			int m = a + (b - a) / 2;  // (a + b) / 2 may overflow;
			if(k < arr[m]) {
				b = m;
			}else if(k > arr[m]) {
				a = m + 1;
			}else {
				return m;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		System.out.println(bs.binarySearch(new int[]{1,2,3,4,5,100}, 2));
	}
}