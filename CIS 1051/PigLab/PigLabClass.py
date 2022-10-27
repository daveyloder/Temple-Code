# If roll = 1, the turn is over and equals 0 points
# If a roll = 2 - 6, the number is added to the player's turn and the turn continues

# Simulation of the computer rolling the dice
import random


def roll():
    return random.randint(1, 6)


def autoPig():
    total = 0
    result = 0
    done = False
    while total < 20 and not done:
        result = roll()
        # print("Roll: " + str(result))
        if result == 1:
            total = 0
            done = True
        else:
            total += result
    # print("Turn Total: " + str(total))
    return total


# autoPig()

def holdAt20(trials):
    outcomes = {}
    for _ in range(trials):
        turnTotal = autoPig()
        if turnTotal in outcomes:
            outcomes[turnTotal] += 1
        else:
            outcomes[turnTotal] = 1
    for score in outcomes:
        print(score, outcomes[turnTotal/trials])


# holdAt20(100000)
# Part 3
def autoPigX(hold):
    total = 0
    result = 0
    done = False
    while total < hold and not done:
        result = roll()
        # print("Roll: " + str(result))
        if result == 1:
            total = 0
            done = True
        else:
            total += result
    # print("Turn Total: " + str(total))
    return total
