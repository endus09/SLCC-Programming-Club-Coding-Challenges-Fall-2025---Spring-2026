"""
In this challenge, you will build a Python function that classifies a color
based on its RGB values.

RGB colors are represented by three numbers:
 - Red (R)
 - Green (G)
 - Blue (B)

Each value ranges from 0 to 255.

Your task is to determine which color is dominant.

Return:
 - "Red" if red is the largest value
 - "Green" if green is the largest value
 - "Blue" if blue is the largest value
 - "Gray" if all three values are equal
 - "Tie" if two or more values are equal and are the largest
"""

# YOUR CODE HERE
def classify_color(r: int, g: int, b: int):
    return ""


# TEST CASES DO NOT MODIFY
test_cases = [
    ((255, 0, 0), "Red"),
    ((0, 255, 0), "Green"),
    ((0, 0, 255), "Blue"),
    ((100, 100, 100), "Gray"),
    ((200, 200, 100), "Tie"),
    ((50, 100, 100), "Tie"),
    ((10, 20, 30), "Blue"),
    ((90, 40, 90), "Tie")
]

# USER INTERFACE DO NOT MODIFY
print(f"{'INPUT':>18} | {'EXPECTED':>8} | {'GOT':>8}")
print("-" * 45)

for inputs, expected in test_cases:
    result = classify_color(*inputs)
    print(f"{str(inputs):>18} | {str(expected):>8} | {str(result):>8}")

results = [
    classify_color(*inputs) == expected
    for inputs, expected in test_cases
]

if all(results):
    print("\nALL TESTS PASS ✅")
else:
    print("\n1 OR MORE TESTS HAVE FAILED ❌")
