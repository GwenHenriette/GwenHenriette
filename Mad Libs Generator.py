# The Mad Libs Genrator gathers and manipulates
# user input data as an adjective, a pronoun,
# and a verb. The program takes this data
# and arranges it to build a story

#Questions for the user
noun = input("Type in a noun: ")

plural_noun = input("Type in a plural noun: ")

second_noun = input("Type in a second noun")

place = input("Type in a place: ")

adjective = input("Type in an adjective: ")

third_noun = input("Type in a third noun")

# Here is a story with your input
print("--------------------------------------")
print("The plural of ", noun, "is: ", plural_noun)
print("The ", second_noun, "is very common")
print("The ", plural_noun, " in", place, "are amazing")
print("The evenings are always ", adjective)
print("It make you feel like you are in ", third_noun)
print("--------------------------------------")