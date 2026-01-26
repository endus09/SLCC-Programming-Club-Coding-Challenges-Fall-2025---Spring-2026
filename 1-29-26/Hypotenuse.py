# AUTHOR: Jose

import math

"""
   This function finds the length of the hypotenuse of a right triangle.

   You are given the lengths of the two shorter sides of the triangle.
   Use the Pythagorean Theorem:

       hypotenuse = sqrt(a² + b²)

   Steps:
   
Square both input values.
Add the squared values together.
Take the square root of the result.
Return the final value.
"""

def find_hypothenus(a_sqr, b_sqr):
    # YOUR CODE HERE
    return

# TEST CASES
print(f"TEST CASE 1: {find_hypothenus(3, 4)} --EXPECTED: 5.0--")
print(f"TEST CASE 2: {find_hypothenus(5, 12)} --EXPECTED: 13.0--")
print(f"TEST CASE 3: {find_hypothenus(6, 8)} --EXPECTED: 10.0--")
print(f"TEST CASE 4: {find_hypothenus(8, 15)} --EXPECTED: 17.0--")
print(f"TEST CASE 5: {find_hypothenus(9, 12)} --EXPECTED: 15.0--")
