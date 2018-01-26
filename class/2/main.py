x = [2,3,4,5]
y = [1,2,4,5,6,7]

u = [1,3,5]
v = [1,3,5]


def intersect(a, b):
	buffer = []
	for i in a:
		for j in b:
			if i == j:
				buffer.append(i)
	buffer.sort()
	return buffer

print(intersect(x,y))


def union(a, b):
	buffer = []
	for i in a:
		for k in buffer:
			if i == k:
				break
		else:
			buffer.append(i)
	for i in b:
		for k in buffer:
			if i == k:
				break
		else:
			buffer.append(i)
	buffer.sort()
	return buffer

print(union(x,y))


def equal(a, b):
	for i in a:
		for j in b:
			if i == j:
				break
		else:
			return False
	return True

print(equal(x,y))
print(equal(u,v))
