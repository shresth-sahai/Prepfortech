class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        ### https://leetcode.com/problems/next-greater-element-i/
        mstack = []

        mp = {}
        for i in nums2:
            while mstack and mstack[-1] < i:
                mp[mstack.pop()] = i

            mstack.append(i)

        ans = []

        for i in nums1:
            num = mp.get(i)
            if num is not None:
                ans.append(num)
            else:
                ans.append(-1)

        return ans
