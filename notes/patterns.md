# Problem-Solving Patterns

Patterns are reusable approaches for recognizing and solving classes of DSA problems.

## Purpose

The goal is to develop pattern recognition.

Instead of memorizing individual solutions, we want to recognize:

> "What kind of problem is this, and what technique is likely to work?"

## Initial Patterns

- Hashing / Frequency Counting
- Two Pointers
- Sliding Window
- Fast and Slow Pointers
- Prefix Sum
- Binary Search
- Stack
- Monotonic Stack
- Intervals
- Heap / Top K
- Tree DFS
- Tree BFS
- Graph DFS
- Graph BFS
- Backtracking
- Greedy
- Dynamic Programming
- Union Find
- Topological Sort

## For Each Pattern

We should eventually document:

1. What the pattern is
2. When to recognize it
3. General approach
4. Typical template
5. Time complexity
6. Space complexity
7. Common variations
8. Common mistakes
9. Representative problems

## Example

### Sliding Window

Typical signals:

- Subarray
- Substring
- Contiguous range
- Longest / shortest range satisfying a condition
- Fixed-size window
- Variable-size window

The pattern should be understood independently of any particular problem.

## Relationship with Problems

A problem can use one or more patterns.

For example:

```text
Longest Substring Without Repeating Characters

Primary Pattern:
Sliding Window

Supporting Data Structure:
HashSet / HashMap