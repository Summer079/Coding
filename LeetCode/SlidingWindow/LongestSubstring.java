package SlidingWindow;

import java.util.HashMap;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        // HashMap to store characters and their indices
        HashMap<Character, Integer> charIndex = new HashMap<>();
        int maxLength = 0;
        int start = 0;
        
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            
            

            if (charIndex.containsKey(currentChar) && charIndex.get(currentChar) >= start) {
                start = charIndex.get(currentChar) + 1;
               
            }
            
            // Update the index of the current character in the HashMap
            charIndex.put(currentChar, end);
            
            // Calculate the length of the current substring without repeating characters
            maxLength = Math.max(maxLength, end - start + 1);
        }
        
        return maxLength;
    }
    
    public static void main(String[] args) {
    	LongestSubstring solution = new LongestSubstring();
        
        // Test cases
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        
        System.out.println(solution.lengthOfLongestSubstring(s1)); // Output: 3
        System.out.println(solution.lengthOfLongestSubstring(s2)); // Output: 1
        System.out.println(solution.lengthOfLongestSubstring(s3)); // Output: 3
    }
}
