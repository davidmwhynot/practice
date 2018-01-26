# Neural Networks Demystified
# Part 1: Data + Architecture
#
# Supporting code for short YouTube series on artificial neural networks.
#
# Stephen Welch
# @stephencwelch

import numpy as np

# X = (hours sleeping, hours studying), y = Score on test
X = np.array(([3,5], [5,1], [10,2]), dtype=float)
y = np.array(([75], [82], [93]), dtype=float)

# Normalize
X = X/np.amax(X, axis=0)
y = y/100 #Max test score is 100




## part 2 (by david whynot)

class Neural_Network(object):
	def __init__(self):
		#Define HyperParameters
		self.inputLayerSize = 2
		self.outputLayerSize = 1
		self.hiddenLayerSize = 3
		#Weights (parameters)
		self.W1 = np.random.randn(self.inputLayerSize, self.hiddenLayerSize)
		self.W2 = np.random.randn(self.hiddenLayerSize, self.outputLayerSize)
	def forward(self, X):
		#propogate inputs through network
		self.z2 = np.dot(X, self.W1)
		self.a2 = self.sigmoid(self.z2)
		self.z3 = np.dot(self.a2, self.W2)
		yHat = self.sigmoid(self.z3)
		return yHat
	def sigmoid(self, z):
		#Apply sigmoid activation function to scalar, vector, or ...
		return 1/(1+np.exp(-z))

NN = Neural_Network()
yHat = NN.forward(X)
print(yHat)
print(y)



## part 3 (by david whynot)

import time

weightsToTry = np.linspace(-10,10,1000)
costs = np.zeros(1000)

startTime = time.clock()
for i in range(1000):
	NN.W1[0,0] = weightsToTry[i]
	yHat = NN.forward(X)
	costs[i] = .5*sum((y-yHat)**2)
endTime = time.clock()

timeElapsed = endTime-startTime
print(timeElapsed)
