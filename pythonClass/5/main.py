# 3/5/18 David Whynot
# MTH 225 - GVSU
# HW 5 Coding Assignment

####### COMMENTED VERSION #######

# TEST DATA

list1 = ['a','b','c']
list2 = ['a','b','c','d']
list3 = ['a','b','c','d','e']
list4 = ['a','b','c','d','e','f']
list5 = ['a','b','c','d','e','f','g']
list6 = ['a','b','c','d','e','f','g','h']
list7 = ['a','b','c','d','e','f','g','h','i']



# FUNCTIONS
# 1. listPairs

def listPairs(a):
	buffer = []
	for i in a: # loop through all possible elements in the first index
		for j in a: # loop through all possible elements in the second index
			if not (i == j): # avoid duplicate elements
				temp = [i,j] # potential candidate for buffer insertion
				for k in buffer: # loop through the lists we have already added to the buffer
					if equal(k, temp): # compare the candidate to the existing lists
						break # if the candidate is equivalent to any list in the buffer, it should be skipped
				else: # the candidate was not equivalent to any list in the buffer...
					buffer.append(temp) # ... therefore it sould be added!
	buffer.sort() # make things look nice
	return buffer # return the results

def equal(a, b): # taken from coding assignment 2
	for i in a:
		for j in b:
			if i == j:
				break
		else:
			return False
	for i in b:
		for j in a:
			if i == j:
				break
		else:
			return False
	return True


# 2. listTriples

def listTriples(a):
	buffer = []
	for i in a: # loop through all possible elements in the first index
		for j in a: # loop through all possible elements in the second index
			for k in a: # loop through all possible elements in the third index
				if (not (i == j)) and (not (i == k)) and (not (j == k)): # avoid duplicate elements
					temp = [i,j,k] # potential candidate for buffer insertion
					for n in buffer: # loop through the lists we have already added to the buffer
						if equal(n, temp): # compare the candidate to the existing lists
							break # if the candidate is equivalent to any list in the buffer, it should be skipped
					else: # the candidate was not equivalent to any list in the buffer...
						buffer.append(temp) # ... therefore it sould be added!
	buffer.sort() # make things look nice
	return buffer # return the results



# MAIN
# (test the functions)
print('TEST DATA:')
print('\nlist1:')
print(list1)
print('\nlist2:')
print(list2)
print('\nlist3:')
print(list3)
print('\nlist4:')
print(list4)
print('\nlist5:')
print(list5)
print('\nlist6:')
print(list6)
print('\nlist7:')
print(list7)
print('\n\n\nTEST listPairs(a)')
print('\nlistPairs(list1)')
print(listPairs(list1))
print('\nlistPairs(list2)')
print(listPairs(list2))
print('\nlistPairs(list3)')
print(listPairs(list3))
print('\nlistPairs(list4)')
print(listPairs(list4))
print('\nlistPairs(list5)')
print(listPairs(list5))
print('\nlistPairs(list6)')
print(listPairs(list6))
print('\nlistPairs(list7)')
print(listPairs(list7))
print('\n\n\nTEST listTriples(a)')
print('\nlistTriples(list1)')
print(listTriples(list1))
print('\nlistTriples(list2)')
print(listTriples(list2))
print('\nlistTriples(list3)')
print(listTriples(list3))
print('\nlistTriples(list4)')
print(listTriples(list4))
print('\nlistTriples(list5)')
print(listTriples(list5))
print('\nlistTriples(list6)')
print(listTriples(list6))
print('\nlistTriples(list7)')
print(listTriples(list7))
