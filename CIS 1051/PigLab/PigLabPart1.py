import random


def pigGame():
    playerOne_score = 0
    playerTwo_score = 0


def diceRoll():
    rollNumber = random.randint(1, 6)
    return rollNumber


def playerOne_move(playerTwo_score, playerOne_score):
    playerOne_move_score = 0
    playerOne_roll = diceRoll()
    print("Player One rolled" + str(playerOne_roll)+".")
    if playerOne_roll == 1:
        print("Your current score is " +
              str(playerOne_score-playerOne_move_score) + ".")
        return 0
    else:
        while playerOne_roll != 1:
            playerOne_move_score += playerOne_roll


print(diceRoll())
