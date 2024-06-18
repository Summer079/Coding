/**
 * Longest Consecutive Sequence

Given an array of integers nums, return the length of the longest consecutive sequence of elements.

A consecutive sequence is a sequence of elements in which each element is exactly 1 greater than the previous element.

You must write an algorithm that runs in O(n) time.

Example 1:

Input: nums = [2,20,4,10,3,4,5]

Output: 4

Explanation: The longest consecutive sequence is [2, 3, 4, 5].

Example 2:

Input: nums = [0,3,2,5,4,6,1,1]

Output: 7
 */

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
