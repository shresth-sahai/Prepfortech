class Solution:
    def calPoints(self, ops: List[str]) -> int:
        ### https://leetcode.com/problems/baseball-game/
        stack = []

        for op in ops:
            if op == "+":
                num1 = stack.pop()
                new_num = num1 + stack[-1]
                stack.append(num1)
                stack.append(new_num)
            elif op == "C":
                stack.pop()
            elif op == "D":
                stack.append(2 * stack[-1])
            else:
                stack.append(int(op))

        return sum(stack)