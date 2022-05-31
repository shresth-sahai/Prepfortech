import bisect


class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        # return [bisect.bisect_left(nums, target), bisect.bisect_right(nums, target) - 1]
        if len(nums) == 0:
            return [-1, -1]

        def lower_bound():
            l = 0
            r = len(nums) - 1

            l_bound = -1
            while l <= r:
                m = (l + r) // 2
                if nums[m] == target:
                    l_bound = m
                    r = m - 1
                elif nums[m] > target:
                    r = m - 1
                else:
                    l = m + 1

            return l_bound

        def upper_bound():
            l = 0
            r = len(nums) - 1
            u_bound = -1
            while l <= r:
                m = (l + r) // 2
                if nums[m] == target:
                    u_bound = m
                    l = m + 1
                elif nums[m] > target:
                    r = m - 1
                else:
                    l = m + 1
            return u_bound

        return [lower_bound(), upper_bound()]
