/**
 * Remove Duplicates from Sorted Array
 * 
 * Problem Description:
 * Given an integer array `nums` sorted in non-decreasing order, remove the duplicates in-place 
 * such that each unique element appears only once. The relative order of the elements should 
 * remain the same. Then return the number of unique elements in `nums`.
 * 
 * The task is to modify the array `nums` such that the first `k` elements of the array 
 * contain the unique elements, and the remaining elements are irrelevant. You need to return `k`, 
 * the number of unique elements in the array.
 * 
 * Custom Judge:
 * The solution will be tested with the following code:
 * 
 * int[] nums = [...]; // Input array
 * int[] expectedNums = [...]; // The expected answer with correct length
 * 
 * int k = removeDuplicates(nums); // Calls your implementation
 * 
 * assert k == expectedNums.length; // Assert the number of unique elements
 * for (int i = 0; i < k; i++) {
 *     assert nums[i] == expectedNums[i]; // Assert the unique elements match the expected values
 * }
 * If all assertions pass, the solution will be accepted.
 * 
 * Example 1:
 * Input: nums = [1, 1, 2]
 * Output: 2, nums = [1, 2, _]
 * Explanation: The function should return k = 2, and the first two elements of nums should be [1, 2].
 * 
 * Example 2:
 * Input: nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
 * Output: 5, nums = [0, 1, 2, 3, 4, _, _, _, _, _]
 * Explanation: The function should return k = 5, and the first five elements of nums should be [0, 1, 2, 3, 4].
 * 
 * Constraints:
 * - 1 <= nums.length <= 30,000
 * - -100 <= nums[i] <= 100
 * - nums is sorted in non-decreasing order.
 */

package ArraysAndHashing;

public class RemoveDuplicate {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;  
        }

        int i = 0; 

        // Start iterating from the second element
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++; 
                nums[i] = nums[j];  
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
    	RemoveDuplicate solution = new RemoveDuplicate();

        // Example 1
        int[] nums1 = {1, 1, 2};
        int newLength1 = solution.removeDuplicates(nums1);
        System.out.println("Length: " + newLength1);  // Output: 2


        // Example 2
        int[] nums2 = {0, 0, 1, 1, 1, 2, 3, 3};
        int newLength2 = solution.removeDuplicates(nums2);
        System.out.println("Length: " + newLength2);  // Output: 5
        
    }
}

