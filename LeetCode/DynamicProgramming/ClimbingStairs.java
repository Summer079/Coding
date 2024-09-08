package DynamicProgramming;

public class ClimbingStairs {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        int[] testCases = {1, 20, 3, 4, 5, 6, 7};
        
        for (int n : testCases) {
            int result = solution.climbStairs(n);
            System.out.println("Number of ways to climb " + n + " steps: " + result);
        }
    }
}

class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        
        int one = 1; // Number of ways to climb to step 1
        int two = 2; // Number of ways to climb to step 2
        
        for (int i = 3; i <= n; i++) {
            int steps = one + two; // Number of ways to reach the current step
            one = two; // Move forward in the sequence
            two = steps; // Update the number of ways for the next step
        }
        
        return two;
    }
}

