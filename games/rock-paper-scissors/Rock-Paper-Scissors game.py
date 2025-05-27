import random

while True:
    choices = ["rock", "paper", "scissors"]
    computer = random.choice(choices)
    player = None

    while player not in choices:
        player = input("rock, paper or scissors: ").lower()

        if player == computer:
            print("Computer: ", computer)
            print("Player: ", player)
            print("TIE!")

        elif player == "rock":
            if computer == "paper":
                print("Computer: ", computer)
                print("Player: ", player)
                print("YOU LOSE!")

            elif computer == "scissors":
                print("Computer: ", computer)
                print("Player: ", player)
                print("YOU WIN!")

        elif player == "paper":
            if computer == "scissors":
                print("Computer: ", computer)
                print("Player: ", player)
                print("YOU LOSE!")

            elif computer == "rock":
                print("Computer: ", computer)
                print("Player: ", player)
                print("YOU WIN!")

        elif player == "scissors":
            if computer == "rock":
                print("Computer: ", computer)
                print("Player: ", player)
                print("YOU LOSE!")

            elif computer == "paper":
                print("Computer: ", computer)
                print("Player: ", player)
                print("YOU WIN!")

    play_again = input("Do you want to play again(yes/no): ").lower()
    if play_again != "yes":
        break


print("THANK YOU!")
print("See you soon!")
