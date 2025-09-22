# Student Grades
# By Markus Gulla

# Welcome to the second programming challenge of the club!
# In today's challenge, you will be creating a function that receives two integers
# anywhere between 0 to 100 and calculates their grades accordingly.

# The grades need to be evaluated in this fashion:
#    90 and Above: A
#    80-89: B
#    70-79: C
#    60-69: D
#    Below 60: F


# Once you have done this, you will need to evaluate both grades to see which of
# the students has the highest grade and give them first and second place rankings.
# Once you have done this, print your statements in the following format...

# For example:

# Input:

# student_grades(Syrus, 88, Ashley, 95)

# Output:

# 1. Ashley: A
# 2. Syrus: B  


def student_grades(student_one, score_one, student_two, score_two):
    # WRITE YOUR CODE HERE

    return





print("Result---")
student_grades("Student 1", 55, "Student 2", 70)
print("\nExpected---\n1. Student 2: C\n2. Student 1: F\n")

print("Result---")
student_grades("Gabe", 90, "Sam", 89)
print("\nExpected---\n1. Gabe: A\n2. Sam: B\n")

print("Result---")
student_grades("Sev", 111, "Malik", -100)
print("\nExpected---\n1. Sev: A\n2. Malik: F\n")

print("Result---")
student_grades("Cece", 60, "Bryson", 69)
print("\nExpected---\n1. Bryson: D\n2. Cece: D\n")