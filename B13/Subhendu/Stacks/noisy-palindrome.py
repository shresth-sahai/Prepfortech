def solve(self, s):
    stack = []

    for i in s:
        if 97 <= ord(i) <= 122:
            stack.append(i)

    idx = 0
    while stack:
        curr = stack.pop()
        while idx < len(s) and not (97 <= ord(s[idx]) <= 122):
            idx += 1
        if s[idx] != curr:
            return False
        idx += 1
    return True