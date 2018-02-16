# 2/15/18 David Whynot
# MTH 225 - GVSU
# HW 4 Coding Assignment

####### COMMENTED VERSION #######

# 1. factorial

def factorial(n):
	if(n == 1): # terminate the recursion because we have reached n-n+1
		return 1 # terminate by returning 1
	else:
		return (n * factorial(n - 1)) # multiply n by n - 1, this will recur until n is == 1. just a recursive definition. input was n, call the function again on (n-1) = m, call the function again on (m-1) = (n - 2) = p ...


# 2

def permutations(n, k):
	if(k < n): # validate input (so we dont divide by zero or try to call factorial on a negative number)
		return factorial(n) / factorial(n-k) # use the definition of a permutation (P(n,k) = n! / (n-k)!) and our factorial function to compute the answer
	return "invalid input"

# 3

def combinations(n, k):
	if(k < n): # validate input (so we dont divide by zero or try to call factorial on a negative number)
		return factorial(n) / (factorial(k) * factorial(n-k)) # use the definition of a combination (C(n,k) = n! / (k!(n-k)!)) and our factorial function to compute the answer
	return "invalid input"

# MAIN
# (test the functions)

print("TEST factorial(6)")
print(factorial(6))

print("TEST factorial(16)")
print(factorial(16))

print("\nTEST permutations(6, 3)")
print(permutations(6, 3))

print("TEST permutations(5, 4)")
print(permutations(5, 4))

print("TEST permutations(15, 9)")
print(permutations(15, 9))

print("\nTEST combinations(6, 3)")
print(combinations(6, 3))

print("TEST combinations(5, 4)")
print(combinations(5, 4))

print("TEST combinations(15, 9)")
print(combinations(15, 9))
