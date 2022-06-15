class Solution:
    def calculateTax(self, brackets: List[List[int]], income: int) -> float:
        ### https://leetcode.com/problems/calculate-amount-paid-in-taxes/
        tx = 0
        prev = 0
        for idx, node in enumerate(brackets):
            up = node[0]
            txp = node[1]
            print(income)
            if up - prev < income:
                cut = up -  prev
                income -= cut
                t = cut * txp/100
                tx += t
            else:
                tx += income * txp/100
                break
            prev = up
        return tx