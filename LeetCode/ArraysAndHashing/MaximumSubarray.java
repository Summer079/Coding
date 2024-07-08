package ArraysAndHashing;

import java.util.*;

class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];

        int sum = 0;
        int max = nums[0];

        for (int n : nums) {
            sum += n;
            max = Math.max(max, sum);

            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
    	MaximumSubarray solution = new MaximumSubarray();

        // Example 1
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result1 = solution.maxSubArray(nums1);
        System.out.println("Example 1:");
        System.out.println("Input: nums = " + Arrays.toString(nums1));
        System.out.println("Output: " + result1);
        System.out.println();

        // Example 2
        int[] nums2 = {1};
        int result2 = solution.maxSubArray(nums2);
        System.out.println("Example 2:");
        System.out.println("Input: nums = " + Arrays.toString(nums2));
        System.out.println("Output: " + result2);
        System.out.println();

        // Example 3
        int[] nums3 = {5, 4, -1, 7, 8};
        int result3 = solution.maxSubArray(nums3);
        System.out.println("Example 3:");
        System.out.println("Input: nums = " + Arrays.toString(nums3));
        System.out.println("Output: " + result3);
    }
}
