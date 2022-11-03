import random

# Rules of the game

# Two players roll dice
# First player to reach 100 points wins


def diceRoll():
    '''Return a random number from 1 to 6 inclusive'''
    return random.randint(1, 6)


def autoPigX(hold):
    total = 0
    result = 0
    done = False
    while total < hold and not done:
        result = diceRoll()
        print("Roll: " + str(result))
        if result == 1:
            total = 0
            done = True
        else:
            total += result
    print("Turn Total: " + str(total))
    return total


autoPigX(50)
