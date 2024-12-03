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

