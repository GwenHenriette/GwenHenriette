import random
import os
import re

def status():
    available_answers = ["Let's go", "Nope"]
    while True:
        try:
            available_answers = input("You want to try again? (Let's go or Nope): ")
            if available_answers.upper() not in available_answers:
                raise ValueError("Let's go or Nope only")

            if available_answers.upper() == "Let's go":
                return True
            else:
                os.system("cls" if os.name == "nt" else "clear")
                print("Good game!")
                exit()

        except ValueError as err:
            print(err)

def play_choices():
    play = True
    while play:
        os.system("cls" if os.name == "nt" else "clear")
        print(" ")
        print("Rock, Paper, Scissors - Shoot!")

        user_play_choice = input("What will you throw? [R]ock], [P]aper, or [S]cissors: ")

        if not re.match("[SsRrPp]", user_play_choice):
            print("Please choose a letter: ")
            print(" [R]ock, [P]aper, or [S]cissors")
            continue

        print(f"You go ahead and choose: {user_play_choice}")

        options = ['R', "P", "S"]
        opposition_choice = random.choice(options)

        print(f"I decided to throw: {opposition_choice}")

        if opposition_choice == user_play_choice.upper():
            print("Tie!")
            play = status()
        elif opposition_choice == "R" and user_play_choice.upper() == "S":
            print("Rock beats scissors, I win")
            play = status()
        elif opposition_choice == "P" and user_play_choice.upper() == "R":
            print("Paper beats rock, I win")
            play = status()
        else:
            print("You win!\n")
            play = status()

if __name__ == "__main__":
    play_choices()


