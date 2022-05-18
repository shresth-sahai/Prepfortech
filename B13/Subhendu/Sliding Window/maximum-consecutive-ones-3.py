class Solution:
    def longestOnes(self, nums: List[int], k: int) -> int:
        ### https://leetcode.com/problems/max-consecutive-ones-iii/
        i = 0
        size = float('-inf')
        for j in range(len(nums)):
            if nums[j] == 0:
                k -= 1
            while k < 0:
                if nums[i] == 0:
                    k += 1
                i += 1
            size = max(size, j - i + 1)
        return size
