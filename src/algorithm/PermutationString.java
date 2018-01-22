package algorithm;

import java.util.Arrays;

/**
 * 待完善,字符串排列
 * @author 80635
 *
 */
public class PermutationString {

	public static void permutation(char[] str) {
		if(str == null) {
			return;
		}
		permutation(str, str);
	}

	private static void permutation(char[] str, char[] begin) {
		if(begin.length == 0) {
			System.out.println(Arrays.toString(str));
		}else {
			for(int i = 0; i < begin.length; i++) {
				char temp = str[i];
//				str[i] = 
			}
		}
	}
}
