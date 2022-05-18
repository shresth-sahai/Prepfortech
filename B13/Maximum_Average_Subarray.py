import sys
class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        maxs = -sys.maxsize
        l = 0
        r = 0
        summ = 0
        while(r<len(nums)):
            if (r-l+1) < k:
                summ += nums[r]
                r+=1
            if (r-l+1) == k:
                summ += nums[r]
                maxs = max(summ, maxs)
                summ -= nums[l]
                l+=1
                r+=1
        return maxs/k
        
