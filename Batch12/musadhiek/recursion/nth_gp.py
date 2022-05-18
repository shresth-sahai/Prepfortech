def nthTermOfGP(n, a, r):
	m = pow(10,9)+7
	#Write your code here
	temp = helper(n-1,r)
	return (a * temp) % m
def helper(n,r):
	if n==0:
		return 1
	power = helper(n//2,r)
	if n % 2 == 0:
		return power * power
	else:
		return power * power * r
    
print(nthTermOfGP(783,11,23))
