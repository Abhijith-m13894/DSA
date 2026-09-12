package problems.neetcode150;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWORepeatingChars {
	/**
	 * Problem: #3 - Two Sum
	 * 
	 * Source: LeetCode
	 * 
	 * NeetCode 150: Yes
	 * 
	 * Category: String / Sliding Window
	 * 
	 * Data Structure: HashSet
	 * 
	 * Pattern: Two pointer / Sliding window
	 * 
	 * Problem: Given a string s, find the length of the longest substring without
	 * duplicate characters.
	 *
	 * Example: Input: s = "abcabcbb" Output: 3 Explanation: The answer is "abc",
	 * with the length of 3. Note that "bca" and "cab" are also correct answers.
	 * Input: s = "bbbbb", Output: 1
	 * 
	 * Difficulty: Medium
	 * 
	 * Time Complexity: O(n)
	 *
	 * Space Complexity: O(1)
	 */

	public int lengthOfLongestSubstring(String s) {
		Set<Character> set = new HashSet<>();
		int left = 0;
		int right = 0;
		int maxLength = 0;

		while (right < s.length()) {
            // If character is already in the window,
            // shrink the window from the left until repeatation is resolved.
			while  (set.contains(s.charAt(right))) {
				set.remove(s.charAt(left));
				left++;
			}
			
			// Add the character to the set. 
			set.add(s.charAt(right));
			
			// Calculate current length
			int currentLength = right - left +1;
			if(currentLength > maxLength) {
				maxLength = currentLength;
			}
			
			// Slide right pointer to next item
			right++;
		}
		return maxLength;
	}
}
