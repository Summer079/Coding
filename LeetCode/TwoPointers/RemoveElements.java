/**
 * Given an integer array nums and an integer val, remove all occurrences of val in the array in-place.
 * The order of the remaining elements may be changed. After removal, return the number of elements in nums 
 * that are not equal to val.
 *
 * To achieve this:
 * - You need to modify the array such that the first k elements of the array (where k is the count of elements 
 *   not equal to val) contain the elements that are not equal to val.
 * - The remaining elements of the array are irrelevant.
 * - Return the integer k, which represents the number of elements in the array that are not equal to val.
 *
 * Note:
 * - The length of nums can be greater than or equal to 1.
 * - You are expected to do this in-place, without using extra space.
 * - Custom Judge:
 *   The judge will test your solution by comparing the modified array to the expected output.
 *   The output will be considered correct if the first k elements match the expected result.
 *
 * Example 1:
 *   Input: nums = [3, 2, 2, 3], val = 3
 *   Output: 2, nums = [2, 2, _, _]
 *   Explanation: After removal, the first two elements of nums are 2. The rest are irrelevant.
 *
 * Example 2:
 *   Input: nums = [0, 1, 2, 2, 3, 0, 4, 2], val = 2
 *   Output: 5, nums = [0, 1, 4, 0, 3, _, _, _]
 *   Explanation: After removal, the first five elements are [0, 1, 4, 0, 3] (order may vary). 
 *   The remaining elements can be ignored.
 */


package TwoPointers;

class RemoveElements {

    public int removeElement(int[] nums, int val) {
        int i = 0; 
        

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];  
                i++;  
            }
        }
        
        return i; 
    }

    public static void main(String[] args) {
    	RemoveElements solution = new RemoveElements();
        
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int k1 = solution.removeElement(nums1, val1);
        System.out.println("New length: " + k1);
        System.out.print("Modified array: ");
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " "); 
        }
        System.out.println();

        // Test case 2
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int k2 = solution.removeElement(nums2, val2);
        System.out.println("New length: " + k2);
        System.out.print("Modified array: ");
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + " "); 
        }
        System.out.println();
    }
}
