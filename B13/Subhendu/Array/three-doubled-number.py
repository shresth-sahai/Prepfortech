class Solution:
    def solve(self, nums):
        ### https://binarysearch.com/problems/Three-Doubled-Numbers
        l = Counter()
        r = Counter(nums)
        ans = 0

        for i in nums:
            r[i] -= 1

            print(l, r, i)
            ans += l[i / 2] * r[i * 2]
            l[i] += 1
        return ans