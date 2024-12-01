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
