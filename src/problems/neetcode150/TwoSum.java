package problems.neetcode150;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	/**
	 * Problem: #1 - Two Sum
	 * 
	 * Source: LeetCode
	 * 
	 * NeetCode 150: Yes
	 * 
	 * Category: Arrays & Hashing
	 * 
	 * Data Structure: HashMap
	 * 
	 * Pattern: Complement Lookup
	 * 
	 * Problem: You are given an array of integers nums and an integer target,
	 * return indices of the two numbers such that they add up to target.
	 *
	 * Example: Input: nums = [2,7,11,15], target = 9 Output: [0,1]
	 * 
	 * Difficulty: Easy
	 * 
	 * Time Complexity: O(n)
	 *
	 * Space Complexity: O(n) 
	 */

	public int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> processedValues = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int remainingValue = target - nums[i];
			if (processedValues.containsKey(remainingValue)) {
				return new int[] { processedValues.get(remainingValue), i };
			} else {
				processedValues.put(nums[i], i);
			}
		}
		return new int[]{};
	}
}
