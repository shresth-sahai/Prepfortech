from datetime import datetime
# fact 

def fact(n):
    if n<= 1:
        return 1
    return n * fact(n-1)

  #fact with memoization
def fact_memo(n,memo={}):
    if n in memo:
        return memo[n]
    if n <=1:
        return 1
    memo[n] = n*fact_memo(n-1,memo)
    return memo[n]

start = datetime.now()
print("fact 100: ",fact(10))
end = datetime.now()
tot = end-start
print(tot,"tot")
start_1 = datetime.now()
print("fact 100: ",fact_memo(10))
end_1 = datetime.now()
tot_1 =  end_1 - start_1
print(tot_1,"tot 1")
print("with memoization faster by ",tot / tot_1,"times")

"""
fact 100:  3628800
0:00:00.000064 tot
fact 100:  3628800
0:00:00.000012 tot 1
tot_1 faster by  5.333333333333333"""
