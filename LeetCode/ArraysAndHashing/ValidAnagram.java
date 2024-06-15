package ArraysAndHashing;

public class ValidAnagram {
	
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        int[] count = new int[26];
        
        // Count characters in s
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        
        // Subtract counts for characters in t
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;
        }
        
        // Check if all counts are zero
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        ValidAnagram solution = new ValidAnagram();
        
        // Test Case 1: Anagrams
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println(solution.isAnagram(s1, t1)); 
        
        
        // Test Case 2: Anagrams with all characters the same
        String s5 = "aaaa";
        String t5 = "aaba";
        System.out.println(solution.isAnagram(s5, t5));
    }
}
