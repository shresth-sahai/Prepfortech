class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        ### https://leetcode.com/problems/evaluate-reverse-polish-notation/
        stack = []

        for token in tokens:
            if token in "+-*/":
                num1 = stack.pop()
                num2 = stack.pop()
                ans = 0
                if token == "+":
                    ans = num2 + num1
                elif token == "-":
                    ans = num2 - num1
                elif token == "*":
                    ans = num2 * num1
                elif token == "/":
                    ans = int(num2 / num1)
                stack.append(ans)
            else:
                stack.append(int(token))

        return stack[0]

