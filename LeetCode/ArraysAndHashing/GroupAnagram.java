package ArraysAndHashing;

import java.util.*;

public class GroupAnagram {

	public List<List<String>> groupAnagrams(String[] strs) {

		if (strs == null || strs.length == 0) {
			return new ArrayList<>();
		}

		Map<String, List<String>> map = new HashMap<>();

		for (String str : strs) { 
			char[] charArray = str.toCharArray();
			Arrays.sort(charArray);
			String sortedStr = new String(charArray); 

			if (!map.containsKey(sortedStr)) { 
				map.put(sortedStr, new ArrayList<>());
			}
			map.get(sortedStr).add(str);

		}
		return new ArrayList<>(map.values());
	}

	public static void main(String[] args) {
		GroupAnagram solution = new GroupAnagram();

		String[] strs1 = { "eat", "tea", "tan", "ate", "nat", "bat" };
		String[] strs2 = { "" };
		String[] strs3 = { "a" };

		System.out.println("Example 1:");
		System.out.println("Input: " + Arrays.toString(strs1));
		System.out.println("Output: " + solution.groupAnagrams(strs1)); 

		System.out.println("\nExample 2:");
		System.out.println("Input: " + Arrays.toString(strs2));
		System.out.println("Output: " + solution.groupAnagrams(strs2)); 

		System.out.println("\nExample 3:");
		System.out.println("Input: " + Arrays.toString(strs3));
		System.out.println("Output: " + solution.groupAnagrams(strs3)); 
	}

}
