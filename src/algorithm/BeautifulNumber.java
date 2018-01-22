package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BeautifulNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
//		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		for(int i = 1; i <= cases; i++) {
			int n = in.nextInt();
			System.out.println("Case#" + i + ": " + beautiful(n));
		}
	}
	
	public static int beautiful(int n) {
		for(int radix = 2; radix < n; radix++) {
			if(isBeautiful(n, radix)) {
				return radix; 
			}
		}
		return n - 1;
	}

	private static boolean isBeautiful(int n, int radix) {
		
		while(n > 0) {
			if(n % radix != 1) {
				return false;
			}
			n /= radix;
			
		}
		return true;
	}
}
