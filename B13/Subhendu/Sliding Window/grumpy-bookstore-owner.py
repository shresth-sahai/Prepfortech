class Solution:
    def maxSatisfied(self, customers: List[int], grumpy: List[int], minutes: int) -> int:
        ## https://leetcode.com/problems/grumpy-bookstore-owner/
        if len(grumpy) <= minutes:
            return sum(customers)
        sat = 0
        i = 0
        m_add = float('-inf')
        add = 0
        for j in range(len(grumpy)):
            sat += int(not grumpy[j]) * customers[j]
            add += grumpy[j] * customers[j]

            if j - i + 1 == minutes:
                m_add = max(m_add, add)
                add -= grumpy[i] * customers[i]
                i += 1
        return sat + m_add
