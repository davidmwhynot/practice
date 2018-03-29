# 3/29 David Whynot
# MTH 225 - GVSU
# HW 8 Coding Assignment

####### COMMENTED VERSION #######

# TEST DATA

list1 = [3, 3, 3, 3, 3, 3]
list2 = [1, 2, 3, 4, 5, 6]
list3 = [2, 4, 6, 8, 10, 12]
list4 = [1, 4, 9, 16, 25, 36]

list5 = [2, 5, 3, 7, -1, 2]

list6 = [1, 6, 13, 22, 33, 46, 61, 78] # should give True
list7 = [1, 2, 4, 8, 16, 32, 64] # should give False



# FUNCTIONS
# (a) deltas
def deltas(a):
	buffer = [] # placeholder for computed deltas
	for i in range(1, len(a)): # loop through the input list, starting at the second element because we want to avoid index out of bound errors
		buffer.append(a[i] - a[i-1]) # subtract the previous element in the list from the current element
	return buffer; # return the results

# (b) is_second_degree (a.k.a. is_annihilated_by_D^3)
def is_second_degree(a):
	for i in deltas(deltas(deltas(a))): # loop through the third (numerical) derivative of the input list
		if i != 0: # if the differences of the differences of the differences is not 0, then the differences of the differences was not constant! ...
			return False # ... therefore we return false
	for i in deltas(a): # a special case would be if we were given a constant function. the reasons for checking are the same as below but with one less derivative
		if i != 0:
			break # reaching this statement implies that the input was not constant (and therefore still a viable candidate for being Delta^2 constant)
	else:
		return False # reaching this statement means that the first derivative of the input was 0 and therefore the input was itself a constant function (definitely not Delta^2 constant)
	for i in deltas(deltas(a)): # there is a special case we have to be concerned with though... the case where it only took TWO derivates to annihilate the "function", meaning that it was Delta^1 constant (not Delta^2)
		if i != 0: # if the differences of the differences is not 0, then we know that it is ok to assume that this function was not annihilated by D^2 ...
			break # ... so we break out of the for loop (skipping the else statement below)
	else:
		return False # reaching this else block means that all of the differences in the second derivative were 0! this is not good because this means the sequence was not Delta^2 constant, rather it was Delta^1 constant (or just constant to begin with)
	return True # we completed the for loop and every element was == 0 so we can say that the 2nd derivative had to be constant


# comment stripped versions of the functions (for clarity)
def stripped_deltas(a):
	buffer = []
	for i in range(1, len(a)):
		buffer.append(a[i] - a[i-1])
	return buffer;


def stripped_is_second_degree(a):
	for i in deltas(deltas(deltas(a))):
		if i != 0:
			return False
	for i in deltas(a):
		if i != 0:
			break
	else:
		return False
	for i in deltas(deltas(a)):
		if i != 0:
			break
	else:
		return False
	return True



# MAIN
# (test the functions)
print('\nTEST DATA:')
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

print('\n\n\nTEST deltas(a)')
print('\ndeltas(list1)')
print(deltas(list1))
print('\ndeltas(list2)')
print(deltas(list2))
print('\ndeltas(list3)')
print(deltas(list3))
print('\ndeltas(list4)')
print(deltas(list4))
print('\ndeltas(list5)')
print(deltas(list5))
print('\ndeltas(list6)')
print(deltas(list6))
print('\ndeltas(list7)')
print(deltas(list7))

print('\n\n\nTEST is_second_degree(a)')
print('\nis_second_degree(list1)')
print(is_second_degree(list1))
print('\nis_second_degree(list2)')
print(is_second_degree(list2))
print('\nis_second_degree(list3)')
print(is_second_degree(list3))
print('\nis_second_degree(list4)')
print(is_second_degree(list4))
print('\nis_second_degree(list5)')
print(is_second_degree(list5))
print('\nis_second_degree(list6)')
print(is_second_degree(list6))
print('\nis_second_degree(list7)')
print(is_second_degree(list7))
