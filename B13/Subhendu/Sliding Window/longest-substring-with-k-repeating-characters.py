from collections import Counter

class Solution:
    def longestSubstring(self, s: str, k: int) -> int:
        ## https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/
        if s and k > len(s):
            return 0

        counter = Counter(s)
        idx = 0
        while idx < len(s) and counter[s[idx]] >= k:
            idx += 1
        if idx == len(s):
            return len(s)

        left = self.longestSubstring(s[:idx], k)
        right = self.longestSubstring(s[idx + 1:], k)

        return max(left, right)






