# 3/5/18 David Whynot
# MTH 225 - GVSU
# HW 5 Coding Assignment

####### COMMENTED VERSION #######

# TEST DATA

list1 = ['a','b','c','d']



# FUNCTIONS

####### REQUIRED FUNCTIONS #######
# (commented)

# 1. listPairs

def listPairs(a):
	buffer = []
	done = []
	for i in a:
		done.append(i)
		for j in (difference(a,done)):
			buffer.append([i,j])
	return buffer

def difference(a, b):
	buffer = []
	for i in a:
		for j in b:
			if i == j:
				break
		else:
			buffer.append(i)
	buffer.sort()
	return buffer


# 2.



# MAIN
# (test the functions)
print('TEST DATA:')
print('\nlist1:')
print(list1)
print('\n\n\nTEST listPairs(a)')
print('\nlistPairs(list1)')
print(listPairs(list1))
