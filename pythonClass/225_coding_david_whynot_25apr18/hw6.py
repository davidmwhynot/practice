# 4/12/18 David Whynot
# MTH 225 - GVSU
# HW 6 Coding Assignment

####### COMMENTED VERSION #######

# TEST DATA

n1 = 2
n2 = 8

set1 = [2]
set2 = [2,3,5,7]

bit1 = [1,0]
bit2 = [1,1,0,0,1,0,0,1]
bit3 = [1,0,1,0,0,1,0,1,1]

path1 = ['right','up']
path2 = ['up','up','right','right','up','right','right','up']



# FUNCTIONS

####### REQUIRED FUNCTIONS #######
# (commented)

# (1) Sets & Bit Strings
# a. setToBit

def setToBit(n, a):
	buffer = []
	for i in range(0, n): # create a list of length 'n'
		buffer.append(0) # set each element to '0'
	for j in a: # loop through the values in the given subset
		buffer[j-1] = 1 # set the values in the buffer at the given indexes (less 1 b/c lists start at 0) to '1'
	return buffer # return the results


# (2) Sets & Lattice Paths
# a. setToLattice

def setToLattice(n, a):
	buffer = []
	for i in range(0, n): # create a list of length 'n'
		buffer.append('right') # set each element to 'right'
	for j in a: # loop through the values in the given subset
		buffer[j-1] = 'up' # set the values in the buffer at the given indexes (less 1 b/c lists start at 0) to 'up'
	return buffer # return the results


# (3) Bit Strings & Lattice Paths
# a. bitToLattice

def bitToLattice(b):
	buffer = []
	for i in b: # loop through the values in the given bit string
		if i == 1: # check if the bit is equal to 1
			buffer.append('up') # if so, then this corresponds to 'up'. append to results
		else:
			buffer.append('right') # if not, then this corresponds to 'right'. append to results
	return buffer # return the results


####### OPTIONAL FUNCTIONS #######
# (not commented)

# (1) Sets & Bit Strings
# b. bitToSet

def bitToSet(b):
	buffer = []
	for i in range(0, len(b)):
		if b[i] == 1:
			buffer.append(i+1)
	return buffer


# (2) Sets & Lattice Paths
# b. latticeToSet

def latticeToSet(p):
	buffer = []
	for i in range(0, len(p)):
		if p[i] == 'up':
			buffer.append(i+1)
	return buffer


# (3) Bit Strings & Lattice Paths
# b. latticeToBit

def latticeToBit(p):
	buffer = []
	for i in p:
		if i == 'up':
			buffer.append(1)
		else:
			buffer.append(0)
	return buffer



# MAIN
# (test the functions)
print('TEST DATA:')
print('\nn1:')
print(n1)
print('\nn2:')
print(n2)
print('\nset1:')
print(set1)
print('\nset2:')
print(set2)
print('\nbit1:')
print(bit1)
print('\nbit2:')
print(bit2)
print('\nbit3:')
print(bit3)
print('\npath1:')
print(path1)
print('\npath2:')
print(path2)
print('\n\n\nTEST setToBit(n, a)')
print('\nsetToBit(n1, set1)')
print(setToBit(n1, set1))
print('\nsetToBit(n2, set2)')
print(setToBit(n2, set2))
print('\n\n\nTEST setToLattice(n, a)')
print('\nsetToLattice(n1, set1)')
print(setToLattice(n1, set1))
print('\nsetToLattice(n2, set2)')
print(setToLattice(n2, set2))
print('\n\n\nTEST bitToLattice(b)')
print('\nbitToLattice(bit1)')
print(bitToLattice(bit1))
print('\nbitToLattice(bit2)')
print(bitToLattice(bit2))
print('\nbitToLattice(bit3)')
print(bitToLattice(bit3))
print('\n\n\nTEST bitToSet(b)')
print('\nbitToSet(bit1)')
print(bitToSet(bit1))
print('\nbitToSet(bit2)')
print(bitToSet(bit2))
print('\nbitToSet(bit3)')
print(bitToSet(bit3))
print('\n\n\nTEST latticeToSet(p)')
print('\nlatticeToSet(path1)')
print(latticeToSet(path1))
print('\nlatticeToSet(path2)')
print(latticeToSet(path2))
print('\n\n\nTEST latticeToBit(p)')
print('\nlatticeToBit(path1)')
print(latticeToBit(path1))
print('\nlatticeToBit(path2)')
print(latticeToBit(path2))
