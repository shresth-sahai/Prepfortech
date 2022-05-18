from collections import defaultdict

class Solution:
    def totalFruit(self, fruits: List[int]) -> int:
        ## https://leetcode.com/problems/fruit-into-baskets/submissions/
        k = 2
        if len(fruits) <= k:
            return len(fruits)

        basket = defaultdict(int)
        i = 0
        max_fruit = float('-inf')
        for j in range(len(fruits)):
            basket[fruits[j]] += 1

            while len(basket) > k:
                basket[fruits[i]] -= 1
                if basket[fruits[i]] == 0:
                    basket.pop(fruits[i])
                i += 1
            max_fruit = max(max_fruit, j - i + 1)
        return max_fruit


