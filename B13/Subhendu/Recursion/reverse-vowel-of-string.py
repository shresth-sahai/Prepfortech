class Solution:
    def reverseVowels(self, s: str) -> str:
        def reverse(ans, l, r):
            ### https://leetcode.com/problems/reverse-vowels-of-a-string/
            if l >= r:
                return s
            while l < r and ans[l] not in "aeiouAEIOU":
                l += 1
            while r > l and ans[r] not in "aeiouAEIOU":
                r -= 1
            print(l,r)
            ans[l], ans[r] = ans[r], ans[l]
            l += 1
            r -= 1
            reverse(ans, l,r)
        rev = list(s)
        reverse(rev, 0, len(s)-1)
        return "".join(rev)