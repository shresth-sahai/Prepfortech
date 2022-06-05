class Solution:
    def isPowerOfFour(self, num: int) -> bool:
        ### https://leetcode.com/problems/power-of-four/
        c0 = 0
        c1 = 0
        while num:
            if num & 1 == 0:
                c0 += 1
            if num & 1 == 1:
                c1 += 1
            num = num >> 1
        if c0 % 2 == 0 and c1 == 1:
            return True
        else:
            return False 