package problems.neetcode150;

/**
 * Problem: #66 - Plus One
 * 
 * Source: LeetCode
 * 
 * NeetCode 150: No
 * 
 * Category: Arrays
 * 
 * Data Structure: Array
 * 
 * Pattern: Right-to-Left Traversal / Carry Propagation
 * 
 * Problem: Given a large integer represented as an array of digits, increment
 * the integer by one and return the resulting array.
 *
 * Example: Input: [1, 2, 3] Output: [1, 2, 4] & Input= [9] Output: [1,0]
 * 
 * Difficulty: Easy
 * 
 * Time Complexity: O(n)
 *
 * Space Complexity: O(1) extra space (excluding the output array)
 */

public class PlusOne {

	public int[] plusOne(int[] digits) {

		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}

			digits[i] = 0;
		}
		int[] value = new int[digits.length + 1];
		value[0] = 1;
		return value;
	}
}
