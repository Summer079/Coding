package ArraysAndHashing;

import java.util.*;

public class LongestConsecutiveSequence {

	public int longestConsecutive(int[] nums) {
	

		Set<Integer> numSet = new HashSet<>(); 
		for (int num : nums) {
			numSet.add(num);         
		}

		int maxLength = 0; 

		for (int num : numSet) {
			
			
			if (!numSet.contains(num - 1)) { // Check if num is the start of a sequence.
				int currentLength = 1;

				while (numSet.contains(num + currentLength)) {
					currentLength++;
				}

				maxLength = Math.max(maxLength, currentLength);
			}
		}

		return maxLength;
	}

	public static void main(String[] args) {
		LongestConsecutiveSequence solution = new LongestConsecutiveSequence();


		int[] nums1 = { 100, 4, 200, 1, 3, 2 };
		System.out.println("Longest consecutive sequence length: " + solution.longestConsecutive(nums1));


		int[] nums2 = {};
		System.out.println("Longest consecutive sequence length: " + solution.longestConsecutive(nums2));

	}
}
