/***
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * 
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * 
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * 
 * Constraints:
 * 2 <= nums.length <= 10^4
 * -10^9 <= nums[i] <= 10^9
 * -10^9 <= target <= 10^9
 * Only one valid answer exists.
 */


package ArraysAndHashing;

import java.util.*;


class topFrequents {

	public int[] Topk(int[] nums, int val) {

		HashMap<Integer, Integer> frequencyMap = new HashMap<>();

		for (int num : nums) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);

		}

		List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());

		entryList.sort((a, b) -> b.getValue() - a.getValue());

		int[] result = new int[val];

		for (int i = 0; i < val; i++) {
			result[i] = entryList.get(i).getKey();
		}

		return result;
	}
}

public class TopKFrequent {

	public static void main(String[] args) {
		
		topFrequents occurrence = new topFrequents();

		int[] s = { 1, 1, 1, 2, 2, 2, 2, 3, 3, 3 };
		int val = 2;
		int[] result = occurrence.Topk(s, val);

		System.out.print("Top " + val + " Frequent Numbers: ");
		System.out.println(Arrays.toString(result));

	}

}
