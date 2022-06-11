class Solution:
    def increasingTriplet(self, nums: List[int]) -> bool:
        ### https://leetcode.com/problems/increasing-triplet-subsequence/
        n = len(nums)
        rmax = [0] * n
        rmax[n - 1] = nums[n - 1]
        lmax = float('inf')
        for i in range(n - 2, -1, -1):
            rmax[i] = max(rmax[i + 1], nums[i])

        for i in range(n):
            lmax = min(lmax, nums[i])
            if lmax < nums[i] < rmax[i]:
                return True
        return False