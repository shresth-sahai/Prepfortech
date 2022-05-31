from collections import defaultdict

def two_sum_with_duplicate(arr, x):
    count = defaultdict(int)
    ans = 0
    for i in arr:
        if x - i in arr:
            ans += count[x-i]
        count[i] += 1
    return ans

arr = [5,4,5,5]
x = 10
print(two_sum_with_duplicate(arr, x))  ### 3
arr = [1,5,7,-1,5]
x = 6
print(two_sum_with_duplicate(arr, x))  ### 3