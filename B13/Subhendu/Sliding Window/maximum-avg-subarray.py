class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        ## https://leetcode.com/problems/maximum-average-subarray-i/
        i = j = 0
        n = len(nums)
        s = 0
        m_s = -float('inf')
        while j < n:
            if j - i + 1 < k:
                s += nums[j]
                j += 1

            if j - i + 1 == k:
                s += nums[j]
                m_s = max(m_s, s)
                s -= nums[i]
                j += 1
                i += 1

        return m_s / k
