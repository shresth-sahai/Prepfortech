class Solution:
    def minOperations(self, logs: List[str]) -> int:
        ### https://leetcode.com/problems/crawler-log-folder/

        stack = []

        for op in logs:
            if op == "../":
                if stack:
                    stack.pop()
            elif op == "./":
                pass
            else:
                stack.append(op)
        return len(stack)