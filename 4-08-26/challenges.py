# Welcome to the code challenges this week
# We are trying a new format: multiple mini-challenges, each challenge is worth 1 point,
# see how many points you can get!
#
# Note that many of the challenges are not going to be tested since the result should be printed to the console
# i.e. on a test like fizzbuzz, simply ensure that the logic is correct, and compare against a few cases
# which will be given above the function



# loop from 0 to n
# if loop number is divisible by 3 print Fizz
# if loop number is divisible by 5 print Buzz
# if loop number is divisible by both print FizzBuzz
# Cases:
#
# 2 == ""
# 5 == "Buzz"
# 45 == "FizzBuzz"
def fizzbuzz(n: int):
    # return nothing, simply print the results
    return


# UNCOMMENT WHEN YOU ARE READY FOR TESTING
# fizzbuzz(100)


# given a list of words, return the average word length
def average_word_length(words: list):
    return 0


# UNCOMMENT WHEN YOU ARE READY FOR TESTING
#wordlist1 = ["Hello", "World"]
#print(f'Average World Length Of {wordlist1} == {average_word_length(wordlist1)}, should be 5')
#wordlist2 = ["aaaaaaaaaa", ""]
#print(f'Average World Length Of {wordlist2} == {average_word_length(wordlist2)}, should be 5')
#wordlist3 = ["Once", "upon", "a", "time"]
#print(f'Average World Length Of {wordlist3} == {average_word_length(wordlist3)}, should be 3.25')

# return the multiples of the parameter "multiples_of" until "until"+1 has been reached
def multiples(multiples_of: int, until: int):
    return [0]


# UNCOMMENT WHEN YOU ARE READY FOR TESTING
#print(f'{multiples(5, 25)}, should be [5, 10, 15, 20, 25]')
#print(f'{multiples(3, 9)}, should be [3, 6, 9]')
#print(f'{multiples(13, 100)}, should be [13, 26, 39, 52, 65, 78, 91]')

# print this file's contents
def read_this_file():
    # return nothing, simply print the results
    return


# UNCOMMENT WHEN YOU ARE READY FOR TESTING
# read_this_file()

# return the nth fibonacci number
def fibonacci(n: int):
    return 0


# UNCOMMENT WHEN YOU ARE READY FOR TESTING
#print(f'{fibonacci(9)}, should be 34')
#print(f'{fibonacci(1)}, should be 1')
#print(f'{fibonacci(0)}, should be 0')
#print(f'{fibonacci(3)}, should be 2')
#print(f'{fibonacci(14)}, should be 377')

# Problem From: #19 https://adriann.github.io/programming_problems.html
# given a list of words, print each word from the list in a frame
#
# (keep in mind this may not be 100% accurate depending on console font
# just ensure that the frame has the same inner size in that case)
def print_string_in_frame(words: list):
    # return nothing, simply print result in console
    return

# UNCOMMENT WHEN YOU ARE READY FOR TESTING
# print_string_in_frame(["Hello", "world", "in", "frame"])



# given a sentence string, separate the words into a list and return
def store_words_from_sentence(sentence: str):
    # Return List
    return

# UNCOMMENT WHEN YOU ARE READY FOR TESTING
#list_sentence_one = "The duck flew far away into the sunset, why? because he duck"
#list_sentence_two = "Where did all my crayons go steven? Stop eating them"
#list_sentence_three = "lee looo laaa liii luuu ,,,,,, elemeo uuuuu"

#print(f'Sentence: \"{list_sentence_one}\" \n'
#      f'Product: {store_words_from_sentence(list_sentence_one)}\n')
#print(f'Sentence: \"{list_sentence_two}\" \n'
#      f'Product: {store_words_from_sentence(list_sentence_two)}\n')
#print(f'Sentence: \"{list_sentence_three}\" \n'
#      f'Product: {store_words_from_sentence(list_sentence_three)}\n')



# given a sentence string, find how many periods there are and return the amount
def find_periods_in_sentence(sentence: str):
    # Return how many periods there is in each sentence
    return 0

# UNCOMMENT WHEN YOU ARE READY FOR TESTING
#periods_sentence_one = "www.google.com"
#periods_sentence_two = "no way, there isn't any? "
#periods_sentence_three = "... . . ... .. .. .. .... is that enough? maybe..."

#print(f'Sentence: \"{periods_sentence_one}\" \n'
#      f'Should return 2 -- Returns: {find_periods_in_sentence(periods_sentence_one)}\n')
#print(f'Sentence: \"{periods_sentence_two}\" \n'
#      f'Should return 0 -- Returns: {find_periods_in_sentence(periods_sentence_two)}\n')
#print(f'Sentence: \"{periods_sentence_three}\" \n'
#      f'Should return 21 -- Returns: {find_periods_in_sentence(periods_sentence_three)}\n')



# given a sentence string, return every five-letter word however you see fit
def print_every_five_letter_word(sentence: str):
    # Return every five-letter word
    return

# UNCOMMENT WHEN YOU ARE READY FOR TESTING
#five_letter_word_sentence_one = "water plus melon is watermelon, maybe we arent doomed after all"
#five_letter_word_sentence_two = "after all this hard work, all that i have to show is my draft"
#five_letter_word_sentence_three = "no pickles in the pickle jar? what the"

#print(f'Sentence: \"{five_letter_word_sentence_one}\" \n'
#      f'Should Return "water melon maybe arent after" -- Returns: {print_every_five_letter_word(five_letter_word_sentence_one)}\n')
#print(f'Sentence: \"{five_letter_word_sentence_two}\" \n'
#      f'Should Return "after draft" -- Returns: {print_every_five_letter_word(five_letter_word_sentence_two)}\n')
#print(f'Sentence: \"{five_letter_word_sentence_three}\" \n'
#      f'Should Return "" -- Returns: {print_every_five_letter_word(five_letter_word_sentence_three)}\n')
