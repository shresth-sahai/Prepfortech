class Solution:
    def fixedPoint(self, arr: List[int]) -> int:
        ## https://leetcode.com/problems/fixed-point/
        n = len(arr)
        l = 0
        r = n - 1
        ans = -1
        while l <= r:
            m = (l + r) // 2

            if arr[m] == m:
                ans = m
                r = m - 1
            elif arr[m] < m:
                l = m + 1
            else:
                r = m - 1
        return ans