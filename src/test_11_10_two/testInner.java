package test_11_10_two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import test_11_10.Inertest;

public class testInner {

	public static void main(String[] args) {
		Inertest as = new Inertest();
		HashMap<Integer, Integer> hm = new HashMap<>();
		hm.put(1, 2);
		System.out.println(hm.getOrDefault(3, 123));
		
		Vector<Integer> a = new Vector<>(Arrays.asList(1,2,3,4));
		for (Integer integer : a) {
			System.out.println(integer);
			if(integer.equals(2)) {
//				a.add(6);      //不能修改a
				a.set(3, 5);
//				a.remove(integer); //不能在forEach中删除
			}
		}
		System.out.println(a.toString());
	}
}
