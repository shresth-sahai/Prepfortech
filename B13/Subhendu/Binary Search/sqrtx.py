class Solution:
    def mySqrt(self, x: int) -> int:
        ## https://leetcode.com/problems/sqrtx/
        if x < 2:
            return x
        l = 2
        r = x // 2

        while l <= r:
            m = (l + r) // 2
            if m ** 2 == x:
                return m
            elif m ** 2 < x:
                l = m + 1
            else:
                r = m - 1

        return r