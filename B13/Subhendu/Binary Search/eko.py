## https://www.spoj.com/problems/EKO/

i1 = input()
i2 = input()


def totalwood(m, arr, t):
    wood = 0
    for i in arr:
        if i > m:
            wood += i - m
    return wood >= t


def solve(arr, t):
    l = 1
    r = max(arr)
    ans = -1
    while l <= r:
        m = (l + r) // 2
        wood = totalwood(m, arr, t)
        print(l, m, r, wood)
        if wood:
            ans = m
            l = m + 1
        else:
            r = m - 1
    return ans


i1 = i1.split(" ")
k = int(i1[1])
arr = [int(i) for i in i2.split(" ")]
print(arr)
print(solve(arr, k))