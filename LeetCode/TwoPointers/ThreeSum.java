package TwoPointers;

import java.util.*;

class ThreeSum {
	
    public List<List<Integer>> threeSum(int[] nums) {
    	
        Arrays.sort(nums); 
        
        List<List<Integer>> result = new ArrayList<>();
        
        for (int i = 0; i < nums.length - 2; i++) {
        	if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicates
            }
            
            
            int target = -nums[i]; 
            
            //{-2,   -2,	-2,	-1,	-1,	-1,	0,	0,	0,	1,	1,	1}
       	    //  ^     ^										        ^
       	    //  i     j										        k
            
            int left = i + 1;
            int right = nums.length - 1;
            
            
           
            while (left < right) { 
            	
                int sum = nums[left] + nums[right]; // Formula:  number[j] + number[k] = - number[i]
                
                
                // there are only three possibility
                // if        1. sum == target
                // else if   2. sum < target
                // else      3. sum > target
                
                if (sum == target) { // // Formula:  number[j] + number[k] = - number[i]
                	
                    result.add(Arrays.asList(nums[i], nums[left], nums[right])); 

                    // Skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    left++;
                    right--;
                } else if (sum < target) { 
                    left++;
                } else {
                    right--;
                }
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        ThreeSum solution = new ThreeSum();
        
        // Example 1
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result1 = solution.threeSum(nums1);
        System.out.println("Example 1:");
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Output:");
        for (List<Integer> triplet : result1) {
            System.out.println(triplet);
        }
        System.out.println();
        // {2, 0,-2, 2, 0, 0}
        // Example 2
        int[] nums2 = {0, 1, 1};
        List<List<Integer>> result2 = solution.threeSum(nums2);
        System.out.println("Example 2:");
        System.out.println("Input: " + Arrays.toString(nums2));
        System.out.println("Output:");
        for (List<Integer> triplet : result2) {
            System.out.println(triplet);
        }
        System.out.println();
        
        // Example 3
        int[] nums3 = {0, 0, 0};
        List<List<Integer>> result3 = solution.threeSum(nums3);
        System.out.println("Example 3:");
        System.out.println("Input: " + Arrays.toString(nums3));
        System.out.println("Output:");
        for (List<Integer> triplet : result3) {
            System.out.println(triplet);
        }
        System.out.println();
    }
}
