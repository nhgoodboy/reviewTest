package test_11_10;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class test12_21 implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -527321724610955451L;
	int tempint;
	private int testInt = 123;
	private int testInte = 123;
	public static void main(String[] args) {
		Set<Integer> temp = new HashSet<>();
		for(int i = 1; i < 10; i++) {
			if(temp.add(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		for(int i = 1; i < 20; i++) {
			if(temp.add(i)) {
				System.out.print(i + " ");
			}
		}
	}
}
