class Solution:
    def solve(self, s):
        ### https://binarysearch.com/problems/Noisy-Palindrome
        l = 0
        r = len(s) - 1
        chars = "abcdefghijklmnopqrstuvwxyz"
        while l < r:
            while l < r and s[l] not in chars:
                l += 1

            while l < r and s[r] not in chars:
                r -= 1

            if s[l] != s[r]:
                return False
            l += 1
            r -= 1
        return True