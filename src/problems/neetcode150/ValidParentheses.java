package problems.neetcode150;

import java.util.Stack;

public class ValidParentheses {
	/**
	 * Problem: #20 - Valid Parentheses
	 * 
	 * Source: LeetCode
	 * 
	 * NeetCode 150: Yes
	 * 
	 * Category: Stack operations
	 * 
	 * Data Structure: Stack
	 * 
	 * Pattern: Matching pairs using LIFO / Stack
	 * 
	 * Problem: Given a string s containing just the characters '(', ')', '{', '}',
	 * '[' and ']', determine if the input string is valid. An input string is valid
	 * if: Open brackets must be closed by the same type of brackets. Open bracket
	 * must be closed in the correct order. Every close bracket has a corresponding
	 * open bracket of the same type.
	 *
	 * Example:Input: s = "()" Output: true; Input: s = "(]" Output: false
	 * 
	 * Difficulty: Easy
	 * 
	 * Time Complexity: O(n)
	 *
	 * Space Complexity: O(n)
	 */

	public boolean isValid(String s) {

		Stack<Character> stack = new Stack<>();

		for (char c : s.toCharArray()) {
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			}
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();

                if (c == ')' && top != '(') {
                    return false;
                }
                if (c == ']' && top != '[') {
                    return false;
                }
                if (c == '}' && top != '{') {
                    return false;
                }
            }
		}
        return stack.isEmpty();
	}
	
}
