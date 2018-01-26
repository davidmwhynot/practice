# test data
x = [2,3,4,5]
y = [1,2,4,5,6,7]

u = [1,3,5]
v = [1,3,5,6]

# define function intersect
def intersect(a, b):
	# create a buffer list for storing the result list
	buffer = []
	# start checking values...
	for i in a:
		# need to compare each element of 'a' to each element of 'b'. check values...
		for j in b:
			# the only requirement for an element of 'a' to 'make it' into the buffer is that it is equal to some element in 'b'
			if i == j:
				# congratulations! this element made it into the buffer. Put 'i' into buffer...
				buffer.append(i)
	# sort the results
	buffer.sort()
	# return the results
	return buffer

#test our function
print(intersect(x,y))


# define function union
def union(a, b):
	# create a buffer for storing the results
	buffer = []
	# start checking values...
	for i in a:
		# for a union, we know that if an element is in 'a' it should be in 'buffer'. Not going to check for duplicates yet (we will for 'b') because 1) i'll assume no duplicates in the input list and 2) we haven't added anything from 'b' yet so no need to worry about duplicating their common elements. Add this element of 'a' to the buffer...
		buffer.append(i)
	# check values for 'b'
	for i in b:
		# check the values that we have already stored in 'buffer' (in other words, the elements of 'a')
		for k in buffer:
			# since we are doing a union, we sould be putting each element of 'a' and 'b' in 'buffer', but we dont want any duplicates. this is why we are looping through 'buffer'. if the element of 'b' is already present in the buffer (because it was also in 'a'), we don't need to add that element so we can just move on to the next element.
			if i == k:
				# this element ('i') of 'b' is in 'buffer' already, so we can just break out of this for loop and check the next element of 'b'
				break
		else:
			# we checked every element in 'buffer' and didn't encounter this element ('i') of 'b' ...
			# ... so we should add this element of 'b' to 'buffer'
			buffer.append(i)
	# sort the results
	buffer.sort()
	# return the results
	return buffer

# test our function
print(union(x,y))


# define function equal
def equal(a, b):
	# so we need to loop through every element of 'a' and compare it to every element of 'b'. Start checking values for 'a'...
	for i in a:
		# start checking values for 'b'...
		for j in b:
			# compare this element of 'a' ('i') to this element of 'b' ('j')
			if i == j:
				# this element of 'a' is in 'b', so our sets are equal (so far). break out of this part of the loop to start checking the next element of 'a'
				break
		else:
			# sadly, we did not find any element in 'b' that was equal to this value in 'a' because we made it through all of 'b' without our conditional being true (and breaking us out of the loop). so we know immediately that the two sets are NOT equal to each other (because some element in 'a' was not in 'b').
			# we can return false now, no need to check anything else
			return False
	# we made it through all of 'a' without the 'else' statement above being executed, so that means that every element of 'a' is in 'b'
	# now we need to check that each element of 'b' is in 'a'...
	# the process will be exact same as checking that each element of 'a' is in 'b' except we swap the positions of the 'a' and 'b' in the for loops. not going to recomment the loops because the logic is the same
	for i in b:
		for j in a:
			if i == j:
				break
		else:
			return False
	# we made it through both sets and didnt encounter any elements in either set that were not also in the other set. this means that the sets are equal and we can return true
	return True

print(equal(x,y)) # returns false
print(equal(u,u)) # returns true


# commenting my code took longer than it did to actually write them for the above functions. I also wrote functions for some of the other items on the list for fun since it wasn't too dificult. not going to comment them though, just print out some test data


def subset(a,b):
	for i in a:
		for j in b:
			if i == j:
				break
		else:
			return False
	return True

print(subset(x,y)) # returns false
print(subset(u,v)) # returns true


def element(a, x):
	for i in a:
		if i == x:
			return True
	return False

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

print(difference(x,y))
print(difference(y,u))
print(difference(u,v))
print(difference(u,u))


def cartesianProduct(a, b):
	buffer = []
	for i in a:
		for j in b:
			buffer.append([i,j])
	buffer.sort()
	return buffer

print(cartesianProduct(x,y))
print(cartesianProduct(u,v))
print(cartesianProduct(u,u))
print(cartesianProduct([1,2],[1,2,3]))
