"""
In this challenge, you will build a Python function that determines whether a customer’s order exists on a restaurant’s menu.

The menu is stored as a dictionary where:
 - The keys are menu numbers (integers)
 - The values are item names (strings)

Your task is to create a function that accepts an order (either a number or a string) and returns:
 - True if the order exists in the menu
 - False if it does not

"""

# MENU OF ITEMS
menu = {
    1: "burger",
    2: "cheeseburger",
    3: "fries",
    4: "milkshake",
    5: "soda"
}

# YOUR CODE HERE
def is_on_menu(order, menu):
    """
        Returns True if the order exists in the menu.
        Order can be an integer (menu number) or string (item name).
    """
    return False

# TEST CASES DO NOT MODIFY
test_cases = [
    (1, True),
    (5, True),
    (10, False),
    ("burger", True),
    ("SODA", True),
    ("hotdog", False),
    (None, False),
    ("", False)
]

# USER INTERFACE DO NOT MODIFY
print(f"{'ORDER':>8} | {'EXPECTED':>8} | {'GOT':>8}")
print("-" * 30)

for order, expected in test_cases:
    result = is_on_menu(order, menu)
    print(f"{str(order):>8} | {str(expected):>8} | {str(result):>8}")

results = [
    is_on_menu(order, menu) == expected
    for order, expected in test_cases
]

if all(results):
    print("\nALL TESTS PASS ✅")
else:
    print("\n1 OR MORE TESTS HAVE FAILED ❌")
