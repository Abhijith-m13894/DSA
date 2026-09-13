package problems.leetcode;

public class ReverseString {
	/**
	 * Problem: #344 - Reverse String
	 * 
	 * Source: LeetCode
	 * 
	 * NeetCode 150: No
	 * 
	 * Category:String / Array Reversal
	 * 
	 * Data Structure:Character Array
	 * 
	 * Pattern: Two pointer/ In-place Swap
	 * 
	 * Problem: Write a function that reverses a string. The input string is given
	 * as an array of characters s. You must do this by modifying the input array
	 * in-place with O(1) extra memory.
	 *
	 * Example: Input: Input: s = ["h","e","l","l","o"] Output:
	 * ["o","l","l","e","h"]
	 * 
	 * Difficulty: Easy
	 * 
	 * Time Complexity: O(n)
	 *
	 * Space Complexity: O(1) extra space (excluding the output array)
	 */

	public void reverseString(char[] s) {
		int left = 0;
		int right = s.length - 1;

		while (right > left) {

			char temp = s[right];
			s[right] = s[left];
			s[left] = temp;
			left++;
			right--;
		}
	}
}
