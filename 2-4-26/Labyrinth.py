"""
Escape the Labyrinth!


In this program, you are trying to escape a labyrinth by choosing the correct doors.

Each door has a two-digit number.

To decide if a door is part of the correct path, you must find the product of the 2 numbers on the door.

A door is considered correct if the product is odd and does not end in the number 3.

You will write code that checks each door and determines whether the path continues or fails.

If all stages pass, you successfully escape the labyrinth.

--MAP-- ( I tried my best )

Visit: _ For visualization of map

__

[52], [53], [11], [97], [99], and [13] are the door numbers that will be tested

"""




def is_path(door_num):
    # YOUR CODE HERE
    return False


# TEST CASES
# STAGE 1
door_1 = True if is_path(53) == True else False
door_2 = True if is_path(52) == False else False

# STAGE 2
door_3 = True if is_path(97) == False else False
door_4 = True if is_path(11) == True else False

# STAGE 3
door_5 = True if is_path(13) == False else False
door_6 = True if is_path(99) == True else False


if door_1 and door_2:
    print("--- STAGE 1 PASSED ---")
    if door_3 and door_4:
        print("--- STAGE 2 PASSED ---")
        if door_5 and door_6:
            print("--- STAGE 3 PASSED ---")
            print("ESCAPED SUCCESSFULLY ✅")
        else:
            print("--- STAGE 3 FAILED ---")
            print("SO CLOSE!")
    else:
        print("--- STAGE 2 FAILED ---")
else:
    print("--- STAGE 1 FAILED ---")
the map didin't keep the indentation unfortunately
