"""
Given an array of positive numbers and a positive number ‘S,’
find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’.
Return 0 if no such subarray exists.
"""

class Solution:
    def smallestSubarray(self, nums: List[int], s: int):

        i = 0
        acc = 0
        small_subarray = float('inf')
        for j in range(len(nums)):
            acc += nums[i]

            if acc >= s:
                while acc >= s:
                    small_subarray = min(small_subarray, j - i + 1)
                    acc -= nums[i]
                    i += 1
        if small_subarray == float("inf"):
            return 0
        else:
            return small_subarray
