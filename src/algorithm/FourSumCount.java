package algorithm;

import java.util.HashMap;

public class FourSumCount {
	
	public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int a : A) {
            for (int b : B) {
                hashMap.put(a + b, hashMap.getOrDefault(a + b, 0) + 1);   //if map contain (a+b), add 1, else set value 1.
            }
        }
        int result = 0;
        for (int c : C) {
            for (int d : D) {
                result += hashMap.getOrDefault(-c - d, 0);
            }
        }
        return result;
    }
	
	public static void main(String[] args) {
		int [] a = {1,2,3,4};
		int [] b = {-1,2,3,0};
		int [] c = {1,2,-3,-1};
		int [] d = {-1,2,0,-1};
		
		System.out.println(fourSumCount(a,b,c,d));
	}
}
