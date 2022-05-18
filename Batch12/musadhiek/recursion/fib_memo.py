"""fib with and without memoization and time comparison"""
from datetime import datetime
# fib 

def fib(n):
    if n<= 2:
        return 1
    return fib(n-1)+fib(n-2)

def fib_memo(n,memo={}):
    if n in memo:
        return memo[n]
    if n <=2:
        return 1
    memo[n] = fib_memo(n-1,memo)+fib_memo(n-2,memo)
    return memo[n]
start = datetime.now()
fib(40)
end = datetime.now()
tot = end-start
print(tot,"tot")
start_1 = datetime.now()
fib_memo(40)
end_1 = datetime.now()
tot_1 =  end_1 - start_1
print(tot_1,"tot 1")
print("tot_1 faster by ",tot - tot_1)

"""
0:00:17.792098 tot
0:00:00.000023 tot 1
tot_1 faster by  0:00:17.792075"""
