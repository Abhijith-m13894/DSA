package problems.neetcode150;

public class CoinChangeII {
	/**
	 * Problem: #518 - Coin Change II
	 * 
	 * Source: LeetCode
	 * 
	 * NeetCode 150: Yes
	 * 
	 * Category: Dynamic Programming / Counting
	 * 
	 * Data Structure: Array
	 * 
	 * Pattern: 1D Dynamic Programming / Unbounded Knapsack
	 * 
	 * Problem: You are given an integer array coins representing different
	 * denominations and an integer amount. Return the number of combinations that
	 * make up the given amount.You may use each coin an unlimited number of times.
	 * The order of coins does not matter. For example, [1, 2, 2] and [2, 1, 2]
	 * represent the same combination.
	 *
	 * Example: Input: amount = 5, coins = [1, 2, 5]; Output: 4
	 * 
	 * Difficulty: Medium
	 * 
	 * Time Complexity: O(coins.length * amount)
	 *
	 * Space Complexity: O(amount)
	 */
	
	public int change(int amount, int[] coins) {

	    int[] dp = new int[amount + 1];
	    dp[0] = 1;
	    
	    for (int coin : coins) {

	        for (int current = coin; current <= amount; current++) {
	            dp[current] += dp[current - coin];
	        }
	    }

	    return dp[amount];
	}
}
