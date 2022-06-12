class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        ### https://leetcode.com/problems/daily-temperatures/
        mstack = []
        res = []
        answer = [0] * len(temperatures)

        for idx, i in enumerate(temperatures):
            while mstack and temperatures[mstack[-1]] < i:
                prev = mstack.pop()
                answer[prev] = idx - prev
            mstack.append(idx)
        return answer
