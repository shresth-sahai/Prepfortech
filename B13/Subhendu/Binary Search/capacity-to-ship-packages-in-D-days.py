class Solution:
    def shipWithinDays(self, weights: List[int], days: int) -> int:
        ## https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
        l = max(weights)
        r = sum(weights)
        def within_d_days(wt):
            acc = 0
            count_days = 1
            for i in weights:
                acc += i
                if acc > wt:
                    acc = i
                    count_days += 1
            return count_days <= days
        ans = -1
        while l <= r:
            m = (l+r)//2
            if within_d_days(m):
                ans = m
                r = m - 1
            else:
                l = m + 1
        return ans