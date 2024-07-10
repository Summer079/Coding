package Stack;
import java.util.*;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        Map<Character, Character> bracketLookup = new HashMap<>(3);

        bracketLookup.put(')', '(');
        bracketLookup.put('}', '{');
        bracketLookup.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);// LIFO
            if (bracketLookup.containsKey(c)) {
                if (!brackets.isEmpty() && bracketLookup.get(c).equals(brackets.peek())) {
                    brackets.pop();
                } else {
                    return false;
                }
            } else {
                brackets.push(c);
            }
        }

        return brackets.isEmpty();
    }

    public static void main(String[] args) {
    	ValidParentheses solution = new ValidParentheses();

        // Example 1
        String s1 = "[]";
        System.out.println("Input: s = \"" + s1 + "\"");
        System.out.println("Output: " + solution.isValid(s1));
        System.out.println();

        // Example 2
        String s2 = "([{}])";
        System.out.println("Input: s = \"" + s2 + "\"");
        System.out.println("Output: " + solution.isValid(s2));
        System.out.println();

        // Example 3
        String s3 = "[(])";
        System.out.println("Input: s = \"" + s3 + "\"");
        System.out.println("Output: " + solution.isValid(s3));
        System.out.println();
    }
}
