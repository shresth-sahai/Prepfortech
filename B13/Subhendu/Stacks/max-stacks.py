class MaxStack:
    ### https://leetcode.com/problems/max-stack/
    def __init__(self):
        self.stack = []

    def push(self, x: int) -> None:
        if self.stack:
            self.stack.append((x, max(self.stack[-1][1], x)))
        else:
            self.stack.append((x, x))

    def pop(self) -> int:
        tup = self.stack.pop()
        return tup[0]

    def top(self) -> int:
        return self.stack[-1][0]

    def peekMax(self) -> int:
        return self.stack[-1][1]

    def popMax(self) -> int:
        m = self.stack[-1][1]
        b = []
        while self.stack[-1][0] != m:
            b.append(self.stack.pop())
        self.stack.pop()
        while b:
            tup = b.pop()
            self.push(tup[0])
        return m

# Your MaxStack object will be instantiated and called as such:
# obj = MaxStack()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.top()
# param_4 = obj.peekMax()
# param_5 = obj.popMax()