class Solution:
    def solve(self, s):
        ### https://binarysearch.com/problems/Minimum-Bracket-Addition

        stack = []

        for i in s:
            if i == ")" and stack and stack[-1] == "(":
                stack.pop()
            else:
                stack.append(i)
        return len(stack)
