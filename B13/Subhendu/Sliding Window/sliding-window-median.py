import statistics


class Solution:
    def medianSlidingWindow(self, nums: List[int], k: int) -> List[float]:
        ## https://leetcode.com/problems/sliding-window-median/
        i = 0
        ans = []
        for j in range(len(nums)):
            if j - i + 1 == k:
                ans.append(statistics.median(nums[i:j + 1]))
                i += 1
        return ans