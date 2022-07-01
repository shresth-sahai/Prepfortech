class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        ### https://leetcode.com/problems/power-of-three/
        if n == 1:
            return True

        if n < 1 or n % 3 != 0:
            return False

        return self.isPowerOfThree(n / 3)