package problems.neetcode150;

public class AddTwoNumbers {
	/**
	 * Problem: #2. Add Two Numbers
	 *
	 * Source: LeetCode
	 *
	 * NeetCode 150: Yes
	 *
	 * Category: Linked List / Mathematical Simulation
	 *
	 * Data Structure: Singly Linked List
	 *
	 * Pattern: Simultaneous traversal + Carry handling
	 *
	 * Problem: Given two non-empty linked lists representing two non-negative
	 * integers, add the two numbers and return the result as a linked list.
	 *
	 * The digits are stored in reverse order.
	 *
	 * Example: Input: l1 = [2,4,3], l2 = [5,6,4] Output: [7,0,8]
	 *
	 * Difficulty: Medium
	 *
	 * Time Complexity: O(max(n, m))
	 *
	 * Space Complexity: O(max(n, m))
	 *
	 * Note: The output linked list itself requires O(max(n, m)) space.
	 */

	/**
	 * * Definition for singly-linked list. * * In LeetCode, this class is already
	 * provided. * It is included here so the problem can be compiled locally.
	 */
	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
		ListNode dummyNode = new ListNode(0);
		ListNode presentNode = dummyNode;
		
		while (l1 != null || l2 != null || carry != 0) {
			
			int value1 = (l1 == null) ? 0 : l1.val;
			int value2 = (l2 == null) ? 0 : l2.val;
			
			int sum = value1 + value2 + carry;
			int digit = sum % 10;
			carry = sum / 10;
			
			presentNode.next = new ListNode(digit);
			presentNode = presentNode.next;
			
			if (l1 != null) {
				l1 = l1.next;
			}
			if (l2 != null) {
				l2 = l2.next;
			}
		}
		
		return dummyNode.next;
	}
}
