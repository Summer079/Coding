

/**
 * Duplicate Integer
 * Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
 * 
 * Example 1:
 *
 * Input: nums = [1, 2, 3, 3]
 * 
 * Output: true
 * Example 2:
 * 
 * Input: nums = [1, 2, 3, 4]
 * 
 * Output: false
 */

package ArraysAndHashing;

import java.util.HashSet;

class Duplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true; // Duplicate found
            }
        }
        return false; // No duplicates found
    }
}

public class ContainsDuplicate {
    public static void main(String[] args) {
        Duplicate solution = new Duplicate();

        // Example 1: Array with duplicates
        int[] nums1 = { 1, 2, 3, 1 };
        boolean containsDuplicate1 = solution.containsDuplicate(nums1);
        System.out.println("Array 1 contains duplicates: " + containsDuplicate1); // Output: true

        // Example 2: Array without duplicates
        int[] nums2 = { 4, 5, 6, 7 };
        boolean containsDuplicate2 = solution.containsDuplicate(nums2);
        System.out.println("Array 2 contains duplicates: " + containsDuplicate2); // Output: false
    }
}

package ArraysAndHashing;

import java.util.HashSet;

class Duplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true; // Duplicate found
            }
        }
        return false; // No duplicates found
    }
}

public class ContainsDuplicate {
    public static void main(String[] args) {
    	Duplicate solution = new Duplicate();
        
        // Example 1: Array with duplicates
        int[] nums1 = {1, 2, 3, 1};
        boolean containsDuplicate1 = solution.containsDuplicate(nums1);
        System.out.println("Array 1 contains duplicates: " + containsDuplicate1); // Output: true
        
        // Example 2: Array without duplicates
        int[] nums2 = {4, 5, 6, 7};
        boolean containsDuplicate2 = solution.containsDuplicate(nums2);
        System.out.println("Array 2 contains duplicates: " + containsDuplicate2); // Output: false
    }
}
