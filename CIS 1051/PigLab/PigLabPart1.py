import random

# Rules of the game

# Two players roll dice
# First player to reach 100 points wins


def diceRoll():
    '''Return a random number from 1 to 6 inclusive'''
    roll_number = random.randint(1, 6)
    return roll_number


def pigGame():
    roll = 0
    humanScore = 0
    while roll != 1:
        roll = diceRoll()
        humanScore += roll
        print("Roll: " + str(roll))
        if humanScore >= 20:
            print("Turn total: " + str(humanScore))
            break
    if roll == 1:
        print("Turn total: " + str(0))


pigGame()
