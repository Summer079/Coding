/**
* Given two strings s and t, return true if t is an anagram of s, and false otherwise.
*
* An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters
* exactly once.
*/

package ArraysAndHashing;

import java.util.HashMap;

public class ValidAnagramMap {

	public static boolean isAnagram(String s, String t) {
		// if length are of not same return false.
		if (s.length() != t.length()) {
			return false;
		}

		// Use HashMap to store character frequencies
		HashMap<Character, Integer> countmap = new HashMap<>();

		// Count characters in string s
		for (char c : s.toCharArray()) {
			countmap.put(c, countmap.getOrDefault(c, 0) + 1);
		}

		// Subtract counts using characters from string t
		for (char c : t.toCharArray()) {
			if (!countmap.containsKey(c)) {
				return false; // If countmap doesn't contain the character, return false
			}
			// when there is one occurrence this will decrease to 0
			countmap.put(c, countmap.get(c) - 1);
			if (countmap.get(c) == 0) {
				countmap.remove(c);

			}
		}

		return countmap.isEmpty();
	}

	public static void main(String[] args) {
		System.out.println(isAnagram("listen", "silent"));
		System.out.println(isAnagram("hello", "world"));
	}

}
