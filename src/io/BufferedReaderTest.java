package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s = br.readLine()).length() != 0) {
			System.out.println(s);
		}
//		br.close();
	}
}
