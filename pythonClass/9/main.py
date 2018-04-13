import random
# 4/12 David Whynot
# MTH 225 - GVSU
# HW 9 Coding Assignment

####### COMMENTED VERSION #######

# TEST DATA

c0_0 = random.randint(0,15)
c0_1 = random.randint(0,15)
c0_2 = random.randint(0,15)
c0_3 = random.randint(0,15)
c0_4 = random.randint(0,15)

c1_0 = random.randint(0,15)
c1_1 = random.randint(0,15)
c1_2 = random.randint(0,15)
c1_3 = random.randint(0,15)
c1_4 = random.randint(0,15)

a0_0 = random.randint(0,15)
a0_1 = random.randint(0,15)
a0_2 = random.randint(0,15)
a0_3 = random.randint(0,15)
a0_4 = random.randint(0,15)

a1_0 = random.randint(0,15)
a1_1 = random.randint(0,15)
a1_2 = random.randint(0,15)
a1_3 = random.randint(0,15)
a1_4 = random.randint(0,15)



# FUNCTIONS

def recursiveSequence(c0, c1, a0, a1):
	buffer = [a0, a1] # start the sequence out in the buffer with the first two terms
	for i in range(2, 15): # loop the integers 2 - 14 to calculate respective terms
		buffer.append(c0*buffer[i-1] + c1*buffer[i-2]) # calculate each term and append it to the buffer
	return buffer # return the results



# MAIN
# (test the functions)
print('\nTEST DATA:')
print('\nc0_0:')
print(c0_0)
print('c0_1:')
print(c0_1)
print('c0_2:')
print(c0_2)
print('c0_3:')
print(c0_3)
print('c0_4:')
print(c0_4)
print('\nc1_0:')
print(c1_0)
print('c1_1:')
print(c1_1)
print('c1_2:')
print(c1_2)
print('c1_3:')
print(c1_3)
print('c1_4:')
print(c1_4)
print('\na0_0:')
print(a0_0)
print('a0_1:')
print(a0_1)
print('a0_2:')
print(a0_2)
print('a0_3:')
print(a0_3)
print('a0_4:')
print(a0_4)
print('\na1_0:')
print(a1_0)
print('a1_1:')
print(a1_1)
print('a1_2:')
print(a1_2)
print('a1_3:')
print(a1_3)
print('a1_4:')
print(a1_4)
print('\n\n\nTEST recursiveSequence(c0, c1, a0, a1)')
print('\nrecursiveSequence(' + str(c0_0) + ', ' + str(c1_0) + ', ' + str(a0_0) + ', ' + str(a1_0) + ')')
print(recursiveSequence(c0_0, c1_0, a0_0, a1_0))
print('\nrecursiveSequence(' + str(c0_1) + ', ' + str(c1_1) + ', ' + str(a0_1) + ', ' + str(a1_1) + ')')
print(recursiveSequence(c0_1, c1_1, a0_1, a1_1))
print('\nrecursiveSequence(' + str(c0_2) + ', ' + str(c1_2) + ', ' + str(a0_2) + ', ' + str(a1_2) + ')')
print(recursiveSequence(c0_2, c1_2, a0_2, a1_2))
print('\nrecursiveSequence(' + str(c0_3) + ', ' + str(c1_3) + ', ' + str(a0_3) + ', ' + str(a1_3) + ')')
print(recursiveSequence(c0_3, c1_3, a0_3, a1_3))
print('\nrecursiveSequence(' + str(c0_4) + ', ' + str(c1_4) + ', ' + str(a0_4) + ', ' + str(a1_4) + ')')
print(recursiveSequence(c0_4, c1_4, a0_4, a1_4))
