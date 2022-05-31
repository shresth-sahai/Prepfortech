class Solution:
    def mySqrt(self, x: int) -> int:
        ## https://leetcode.com/problems/sqrtx/
        l = 0
        r = x
        ans = -1
        while l <= r:
            m = (l + r) // 2

            if m ** 2 == x:
                return m
            elif m ** 2 < x:
                ans = m
                l = m + 1
            else:
                r = m - 1

        return ans