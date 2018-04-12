# 4/12/18 David Whynot
# MTH 225 - GVSU
# HW 7 Coding Assignment

####### COMMENTED VERSION #######

# TEST DATA

initial1 = 1
initial2 = 16
initial3 = 1.5
initial4 = -15

last_index1 = 1100
last_index2 = 45
last_index3 = 15
last_index4 = 5

difference1 = 1
difference2 = 2.5
difference3 = 10
difference4 = 113

ratio1 = 0.5
ratio2 = 2
ratio3 = 5
ratio4 = 23

# FUNCTIONS

# (1) arithmetic

def arithmetic(initial, difference, last_index):
	buffer = [initial] # set the buffer's first element to the inital value
	for i in range(1, last_index): # loop through (starting at second element) the integers up to the last_index
		buffer.append(buffer[i-1] + difference) # append the value of the next term, which is the value of the previous term plus the difference
	return buffer # return the results


# (2) geometric

def geometric(initial, ratio, last_index):
	buffer = [initial] # set the buffer's first element to the inital value
	for i in range(1, last_index): # loop through (starting at second element) the integers up to the last_index
		buffer.append(buffer[i-1] * ratio) # append the value of the next term, which is the value of the previous term times the ratio
	return buffer # return the results



# for fun

# arithmetic sum
def arithmeticSum(initial, difference, last_index):
	buffer = [initial]
	total = 0
	for i in range(1, last_index):
		buffer.append(buffer[i-1] + difference)
	for i in buffer:
		total += i
	return total


# geometric sum

def geometricSum(initial, ratio, last_index):
	buffer = [initial]
	total = 0
	for i in range(1, last_index):
		buffer.append(buffer[i-1] * ratio)
	for i in buffer:
		total += i
	return total




# MAIN
# (test the functions)
print('TEST DATA:')
print('\ninitial1:')
print(initial1)
print('\ninitial2:')
print(initial2)
print('\ninitial3:')
print(initial3)
print('\ninitial4:')
print(initial4)
print('\nlast_index1:')
print(last_index1)
print('\nlast_index2:')
print(last_index2)
print('\nlast_index3:')
print(last_index3)
print('\nlast_index4:')
print(last_index4)
print('\ndifference1:')
print(difference1)
print('\ndifference2:')
print(difference2)
print('\ndifference3:')
print(difference3)
print('\ndifference4:')
print(difference4)
print('\nratio1:')
print(ratio1)
print('\nratio2:')
print(ratio2)
print('\nratio3:')
print(ratio3)
print('\nratio4:')
print(ratio4)
print('\n\n\nTEST arithmetic(initial, difference, last_index)')
print('\narithmetic(initial1, difference1, last_index1)')
print(arithmetic(initial1, difference1, last_index1))
print('\narithmetic(initial2, difference2, last_index2)')
print(arithmetic(initial2, difference2, last_index2))
print('\narithmetic(initial3, difference3, last_index3)')
print(arithmetic(initial3, difference3, last_index3))
print('\narithmetic(initial4, difference4, last_index4)')
print(arithmetic(initial4, difference4, last_index4))
print('\n\n\nTEST geometric(initial, ratio, last_index)')
print('\ngeometric(initial1, ratio1, last_index1)')
print(geometric(initial1, ratio1, last_index1))
print('\ngeometric(initial2, ratio2, last_index2)')
print(geometric(initial2, ratio2, last_index2))
print('\ngeometric(initial3, ratio3, last_index3)')
print(geometric(initial3, ratio3, last_index3))
print('\ngeometric(initial4, ratio4, last_index4)')
print(geometric(initial4, ratio4, last_index4))
print('\n\n\nTEST arithmeticSum(initial, difference, last_index)')
print('\narithmeticSum(initial1, difference1, last_index1)')
print(arithmeticSum(initial1, difference1, last_index1))
print('\narithmeticSum(initial2, difference2, last_index2)')
print(arithmeticSum(initial2, difference2, last_index2))
print('\narithmeticSum(initial3, difference3, last_index3)')
print(arithmeticSum(initial3, difference3, last_index3))
print('\narithmeticSum(initial4, difference4, last_index4)')
print(arithmeticSum(initial4, difference4, last_index4))
print('\n\n\nTEST geometricSum(initial, ratio, last_index)')
print('\ngeometricSum(initial1, ratio1, last_index1)')
print(geometricSum(initial1, ratio1, last_index1))
print('\ngeometricSum(initial2, ratio2, last_index2)')
print(geometricSum(initial2, ratio2, last_index2))
print('\ngeometricSum(initial3, ratio3, last_index3)')
print(geometricSum(initial3, ratio3, last_index3))
print('\ngeometricSum(initial4, ratio4, last_index4)')
print(geometricSum(initial4, ratio4, last_index4))
