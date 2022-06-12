class Solution:
    def hammingWeight(self, n: int) -> int:
        ### https://leetcode.com/problems/number-of-1-bits/
        count = 0
        while n:
            count += 1
            n = n & (n-1)
        return count