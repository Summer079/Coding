package String;

/*
 * Problem: 
 * 
 * Given two strings s and goal, return true if and only if 
 * s can become goal after some number of shifts on s.
 * 
 * A "shift" on string s consists of moving the leftmost character of s
 * to the rightmost position. 
 * 
 * For example, if s = "abcde", then it will be "bcdea" after one shift. 
 * 
 * 
 * Example 1:
 * Input: s = "abcde", goal = "cdeab"
 * Output: true or 1
 * 
 * 
 * Example 2:
 * Input: s = "abcde", goal = "abced"
 * Output: false or -1

 */

import java.util.*;

class Rotating {

	public static int rotateString(String word1, String word2) {
		
		if (word1.length() != word2.length()) {
			return -1;
		}

		String concatenated = word1 + word1;
		
		if (concatenated.contains(word2)) {
			return 1;
		}
		
		return -1;
	}
}

public class RotateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rotating main = new Rotating();

		// Test case 1
		String word1 = "sample";
		String word2 = "plesam";
		int result = main.rotateString(word1, word2);
		System.out.println(result);

		// Test case 2
		word1 = "listen";
		word2 = "sitenl";
		result = main.rotateString(word1, word2);
		System.out.println(result);
	}

}
