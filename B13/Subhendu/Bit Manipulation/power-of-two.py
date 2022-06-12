class Solution:
    def solve(self, n):
        ### https://binarysearch.com/problems/Check-Power-of-Two
        return n>0 and n & (n-1) == 0