class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        ### https://leetcode.com/problems/single-number/
        ans = 0
        for i in nums:
            ans ^= i
        return ans