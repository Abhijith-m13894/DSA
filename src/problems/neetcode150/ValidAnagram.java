package problems.neetcode150;

public class ValidAnagram {
	/**
	 * Problem: #242. Valid Anagram
	 * 
	 * Source: LeetCode
	 * 
	 * NeetCode 150: Yes
	 * 
	 * Category: Character frequency / Array
	 * 
	 * Data Structure: Array (Frequency Array)
	 * 
	 * Pattern: Frequency counting and comparison
	 * 
	 * Problem: Given two strings s and t, return true if t is an anagram of s, and
	 * false otherwise. Input: s = "rat", t = "car" Output: false An Anagram has two
	 * strings of same length and same charecter count. Just positions vary
	 *
	 * Example:Input: Input: s = "anagram", t = "nagaram". Output: true
	 * 
	 * Difficulty: Easy
	 * 
	 * Time Complexity: O(n)
	 *
	 * Space Complexity: O(1) Since the frequency array always contains 26 elements.
	 */

	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] count = new int[26];
		for (char c : s.toCharArray()) {
			count[c - 'a']++;
		}
		for (char c : t.toCharArray()) {
			count[c - 'a']--;
		}
		for (int frequency : count) {
			if (frequency != 0) {
				return false;
			}
		}
		return true;
	}
}
