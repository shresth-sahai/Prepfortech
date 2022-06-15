def fib(self, n):
    ### https://leetcode.com/problems/fibonacci-number/
    if n <= 1:
        return n

    return self.fib(n - 1) + self.fib(n - 2)