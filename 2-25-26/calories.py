"""
In this challenge, you will build a Python function that checks whether a nutrition
label’s listed calories are accurate based on its macronutrients.

On nutrition labels:
 - Fat has 9 calories per gram
 - Carbohydrates have 4 calories per gram
 - Protein has 4 calories per gram

Because of rounding, calculated calories may not exactly match the listed calories.

Your task is to determine whether the calculated calories are within 5% of the
listed calories.

Return:
 - True if the calculated calories are within 5%
 - False otherwise

 EXAMPLE FROM A PROTEIN SHAKE:
  - 2g of Fat = 18 calories
  - 4g of Carbohydrates = 16 calories
  - 30g of Protein = 120 calories
  Added up it's 154 calories, the nutrition label says 150 calories
  The listed is within 5% of the calculated, making it accurate ✅
  
"""


# YOUR CODE HERE
def calorie_check(fat_g: int, carb_g: int, protein_g: int, listed_calories: int):
    return False


# TEST CASES DO NOT MODIFY
test_cases = [
    ((10, 20, 5, 190), True),
    ((8, 30, 10, 240), True),
    ((10, 10, 10, 100), False),
    ((10, 15, 10, 200), True),
    ((12, 40, 8, 300), True),
    ((20, 10, 5, 150), False),
    ((10, 20, 10, 200), True),
    ((11, 18, 10, 200), False)
]

# USER INTERFACE DO NOT MODIFY
print(f"{'INPUT':>20} | {'EXPECTED':>8} | {'GOT':>6}")
print("-" * 50)

for inputs, expected in test_cases:
    result = calorie_check(*inputs)
    print(f"{str(inputs):>20} | {str(expected):>8} | {str(result):>6}")

results = [
    calorie_check(*inputs) == expected
    for inputs, expected in test_cases
]

if all(results):
    print("\nALL TESTS PASS ✅")
else:
    print("\n1 OR MORE TESTS HAVE FAILED ❌")
