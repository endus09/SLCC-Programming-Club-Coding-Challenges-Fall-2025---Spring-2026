
# CHALLENGE CODE
# {"color":rgb_index}
color_pallete = { "red": 2, "orange": 3, "yellow": 5, "green": 7, "blue": 9, "indigo": 10, "violet": 12 }

# [ {r, g, b}, ...]
rgb_values = [
	[0,0,0],
	[90, 56, 28],
	[240, 25, 17], # Red
	[240, 147, 17], # Orange
	[100, 90, 50],
	[245, 255, 50], # Yellow
	[200, 200, 200],
	[72, 255, 50], # Green
	[60, 58, 40],
	[50, 64, 255], # Blue
	[109, 61, 255], # Indigo
	[0,0,200],
	[132, 9, 255], # Violet
	[100, 50, 20],
	[30, 190, 80]
]

# Given A Color's Name, If It Exists: Return It's RGB Index, And The Product Of Its R, G, And B Values: 
# [rgb_index, product of r, g, and b]
# If The Color Does Not Exist In The Pallete Return An Empty List
#
# WRITE YOUR CODE IN HERE
def getColorInfo(color_name):
	if color_name not in color_pallete:
		return []
	rgb =  rgb_values[color_pallete[color_name]]
	r = rgb[0]
	b = rgb[1]
	g = rgb[2]
	return [color_pallete[color_name], r * g * b]


# TESTS
def test(color_name, expected):
	print(f'\n = = = Test {color_name} = = = ')
	print("Got:      ", getColorInfo(color_name))
	print("Expected: ", expected)
	if (getColorInfo(color_name) == expected):
		print("Test Passed")
	else:
		print("Test Failed")
	print(f' = = = Test {color_name} = = = \n')


test("blue", [9, 816000])
test("red", [2, 102000])
test("purple", [])
test("yellow", [5, 3123750])
test("purple", [])
test("indigo", [10, 1695495])
test("lime", [])
test("green", [7, 918000])
test("white", [])
test("orange", [3, 599760])

