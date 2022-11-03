import random

# Rules of the game

# Two players roll dice
# First player to reach 100 points wins


def diceRoll():
    '''Return a random number from 1 to 6 inclusive'''
    return random.randint(1, 6)


def autoPigScore(score):
    pigplayerscore = score
    total = 0
    result = 0
    done = False
    while total < 20 and not done or total + result >= score:
        result = diceRoll()
        print("Roll: " + str(result))
        if result == 1:
            total = 0
            done = True
        else:
            total += result
    print("Turn Total: " + str(total))
    print("New score: " + str(pigplayerscore + total))
    return total


autoPigScore(int(input("Score? ")))
