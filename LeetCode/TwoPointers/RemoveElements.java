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
