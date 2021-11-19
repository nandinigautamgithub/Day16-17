package day16;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String x = "earth";
		String y = "heart";

		boolean checkAnagram = isAnagrams(x, y);
		if (checkAnagram)
			System.out.println("String is an Anagram.");
		else
			System.out.println("String is not an Anagram.");
	}

	private static boolean isAnagrams(String x, String y) {
		char[] c1 = x.toCharArray();
		char[] c2 = y.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if (Arrays.toString(c1).equals(Arrays.toString(c2)))
			return true;
		else
			return false;
	}

}
