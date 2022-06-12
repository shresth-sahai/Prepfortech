class Solution:
    def trap(self, height: List[int]) -> int:
        n = len(height)
        lmax = [0] * n
        rmax = [0] * n

        lmax[0] = height[0]
        rmax[n - 1] = height[n - 1]

        for i in range(1, n):
            lmax[i] = max(height[i], lmax[i - 1])

        for i in range(n - 2, -1, -1):
            rmax[i] = max(height[i], rmax[i + 1])

        ans = 0
        for i in range(n):
            min_tower = min(rmax[i], lmax[i])
            ans += min_tower - height[i]
        return ans