def isPalindrome(x: int):
    # Your solution here

    return

# Test Cases
print(f"Palindrome 121: {isPalindrome(121)} -- Expected: True")
print(f"Palindrome -121: {isPalindrome(-121)} -- Expected False")
print("\n")



def merge_sorted_lists(list_a, list_b):
  return []
#
#list1 = [1,2,4]
#list2 = [1,3,4]
#print(f"{list1} and {list2} = [1,1,2,3,4,4] got {merge_sorted_lists(list1,list2)}")

#list3 = [0]
#list4 = []
#print(f"{list3} and {list4} = [0] got {merge_sorted_lists(list3,list4)}")

#list5 = []
#list6 = []
#print(f"{list5} and {list6} = [] got {merge_sorted_lists(list5,list6)}")




  
# Level 1 ERASE SOLUTION PLZ AFTER 
# Pascal could be a 2-step problem, one to make the lists, and the other to print the triangle 
def generate_pascals_triangle(n):
    triangle = []

    for i in range(n):
        # Start each row with 1
        row = [1] * (i + 1)

        # Calculate the middle values
        for j in range(1, i):
            row[j] = triangle[i - 1][j - 1] + triangle[i - 1][j]

        triangle.append(row)

    return triangle

# Level 2 ERASE SOLUTION PLZ AFTER
def print_triangle(triangle):
    n = len(triangle)
    for i, row in enumerate(triangle):
        # Create centering padding
        print(" " * (n - i), end="")
        print(*row)


# Usage to see potential solutions
#rows = 5
#my_triangle = generate_pascals_triangle(rows)
#print(my_triangle)
#print_triangle(my_triangle)
