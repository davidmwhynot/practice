# 2/1/18 David Whynot
# MTH 225 - GVSU
# HW 3 Coding Assignment

####### COMMENTED VERSION #######

# TEST DATA

dict1 = {
	'a': 1,
	'b': 1,
	'c': 2,
	'd': 3
}

dict2 = {
	'a': 1,
	'b': 2,
	'c': 3,
	'd': 4,
	'e': None,
	'f': None
}

dict3 = {
	'a': 1,
	'b': 2,
	'c': 2,
	'd': 3,
	'e': 4
}

dict4 = {
	'a': 1,
	'b': 2,
	'c': 3
}

codomain = [1,2,3,4]

orderPairs1 = [
	[0,1],
	[1,2],
	[2,3],
	[3,4]
]

orderPairs2 = [
	[0,1],
	[1,1],
	[2,2],
	[2,4]
]



# FUNCTIONS

####### REQUIRED FUNCTIONS #######
# (commented)

# (a) Function Computation
# i.

def inverseImage(f, a):	# define my function
	buffer = [] # declare an empty list to store the results in
	for i in f: # loop through the given function
		if f[i] == a: # check the output of the function to see if it is equal to the element we are trying to find the inverse image of
			buffer.append(i) # add 'i' (the input that is associated with the requested image) to the results list
	return buffer # return the results


# (b) Injective/Surjective
# i.

def injective(f):
	for i in f: # loop through the given function
		for x in f: # for each input in the given function check all other values of the function by looping through the function AGAIN
			if (f[i] != None) and (f[i] == f[x]): # if any output of the function is equal to any other output of the function, then we can say that the function is not injective, UNLESS the two inputs were 'None' meaning that this input has no associated output, which still falls within the realm of injective functions
				if i != x: # ... also, if the two inputs were the same we should expect the same output, and this function could still be injective
					return False # every condition is satisfied, the function is NOT injective
	return True # in order to reach this statement, we would have to loop through the entire function and never encounter two equal outputs with different inputs, therefore we can say our function is injective and return true


####### OPTIONAL FUNCTIONS #######
# (not commented)

# (a)
# ii.

def checkFunction(f):
	for i in f:
		for x in f:
			if i[1] != x[1]:
				if i[0] == x[0]:
					return False
	return True


# (b)
# ii.

def surjective(f, c):
	for i in c:
		for x in f:
			if i == f[x]:
				break
		else:
			return False
	return True



# MAIN
# (test the functions)

print('TEST DATA:')
print('dict1')
print(dict1)
print('\ndict2')
print(dict2)
print('\ndict3')
print(dict3)
print('\ndict4')
print(dict4)
print('\ncodomain')
print(codomain)
print('\norderPairs1')
print(orderPairs1)
print('\norderPairs2')
print(orderPairs2)


print('\n\nTEST inverseImage(dict1, 1)')
print(inverseImage(dict1, 1))
print('\nTEST inverseImage(dict2, 1)')
print(inverseImage(dict2, 1))


print('\n\nTEST injective(dict1)')
print(injective(dict1))
print('\nTEST injective(dict2)')
print(injective(dict2))


print('\n\nTEST checkFunction(orderPairs1)')
print(checkFunction(orderPairs1))
print('\nTEST checkFunction(orderPairs2)')
print(checkFunction(orderPairs2))


print('\n\nTEST surjective(dict3, codomain)')
print(surjective(dict3, codomain))
print('\nTEST surjective(dict4, codomain)')
print(surjective(dict4, codomain))
