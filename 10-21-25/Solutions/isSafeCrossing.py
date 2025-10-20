# Image there is a road, where 'x' is a car
# and '_' is an empty road with no car
road_example = ['x','_','_','_','_']

# There is a chicken 'c' who would like to cross this road.
# The chicken always crosses at the last possible road space
# but may not always be 1 step away from the road, 
# each '|' character represents 1 step away from the road for the chicken
chicken_example = [
	'|',
	'c'
]

# In this example, you can picture the chicken and the raod
# as such:
#
# x _ _ _ _
#		  |
#		  c
#
# After 1 move of the car (the car will always move first, hint: add 1 to the car's distance to end of road)
# and 1 move from the chicken the board would look like this:
#
# _ x _ _ _
#		  c
#
# on this simulated move, you can see the chicken is safe to cross
# because the chicken and the car is not on the same index
#
# _ _ x _ c
#
# Another example
# 
# the road: x _
# the chicken: c
# and the representation
#
# x _
#   c
#
# if we step the board forward 1 turn:
#
# _ xc
#
# we see the car and the chicken would collide,
# so the crossing is not safe




# PUT YOUR CODE HERE
def isSafeCrossing(road, chicken):
	# the distance for the car to reach the end
	car_distance = len(road) - (road.index('x')+1)
	# the distance the chicken needs to go to be at the end
	chicken_distance = len(chicken) - (chicken.index('c'))
	# if the chicken and the car's distance are equal the chicken is not
	# safe to pass
	return car_distance != chicken_distance


# TESTS
def test(test_number, road, chicken, expected):
	 
	if (isSafeCrossing(road, chicken) == expected):
		passed = "Passed"
	else:
		passed = "Failed"

	print(f'\n = = = Test {test_number} {passed} = = = ')
	print("Got:      ", isSafeCrossing(road, chicken))
	print("Expected: ", expected)
	print(f' = = = = = = = = = = = = =\n')


road_1 = ['x','_','_','_','_']
chicken_1 = [
	'|',
	'c'
]
test(1, road_1, chicken_1, True)

road_2 = ['x','_']
chicken_2 = [
	'c'
]
test(2, road_2, chicken_2, False)

road_3 = ['_','_','x','_','_']
chicken_3 = [
	'|',
	'|',
	'c'
]
test(3, road_3, chicken_3, True)

road_4 = ['x']
chicken_4 = ['c']
test(4, road_4, chicken_4, True)
