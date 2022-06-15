class Solution:
    def removeVowels(self, s: str) -> str:
        ### https://leetcode.com/problems/remove-vowels-from-a-string/
        ans = []

        def remove(ans, l):
            if l >= len(s):
                return

            while s[l] in "aeiou":
                l += 1
            ans.append(s[l])
            remove(ans, l + 1)

        remove(ans, 0)
        return ''.join(ans)