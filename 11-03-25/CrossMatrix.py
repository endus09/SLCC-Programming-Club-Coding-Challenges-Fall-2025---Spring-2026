# Welcome To Coding Challenges This Week!
#
# This week you will determine whether an array is also a matrix with a cross
# For An Array To Be A Cross Matrix, It Must Be 16 Elements Long Exactly, And Have
# Numbers Greater Than 0 Along All Diagonals.
# 
# For example, you will be given an array
#
# array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
#  
# Firstly: For this array to be a matrix, it must be exactly 16 elements in length
# This array is 16 long, so we can continue
#
# Next we can imagine this array is a matrix, all the data is the same,
# but you can picture the array as a matrix:
# [
# 	1,  2,  3,  4
# 	5,  6,  7,  8,
#	9,  10, 11, 12,
#	13, 14, 15, 16
# ]
#
# Next Get The Elements Along The Diagonals, Hence The "Cross" Part Of The Problem,
# The '_' In This Demonstration Is An Element We Can Ignore
# [
# 	1,  _,  _,  4,
# 	_,  6,  7,  _,
#	_,  10, 11, _,
#	13, _,  _,  16
# ]
# 
# The Elements We Have Left Along The Diagonals Are [1, 4, 6, 7, 10, 11, 13, 16]
# Since They Are All Greater Than 0, This Array Is Also A Cross Matrix!
#


# WRITE TEST CODE HERE
def is_cross_matrix(matrixArray):
	return False

# TEST
def test(test_number, matrixArray, expected):
	got = is_cross_matrix(matrixArray)
	print(f'\n = = = Test {test_number} = = = ')
	print("Got:      ", got)
	print("Expected: ", expected)
	if (got == expected):
		print("Test Passed")
	else:
		print("Test Failed")
	print(f' = = = Test {test_number} = = = \n')


matrixArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
test(1, matrixArray, True)

matrixArray2 = [1, 2, 3, 4, 5, 0, 0, 8, 9, 0, 0, 12, 13, 14, 15, 16]
test(2, matrixArray2, False)

matrixArray3 = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
test(3, matrixArray3, False)

matrixArray4 = [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
test(4, matrixArray4, False)

matrixArray5 = [1, 0, 0, 4, 0, 6, 7, 0, 0, 10, 11, 0, 13, 0, 0, 16]
test(5, matrixArray5, True)
