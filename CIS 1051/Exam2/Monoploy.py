# Monopoly Game rand 100000 times. Doubles sends the player to jail if rolled three times in a row

import random


def diceRoll():
    return random.randint(1, 6)


def turn():
    dice1 = diceRoll()
    dice2 = diceRoll()
    if dice1 == dice2:
        dice1 = diceRoll()
        dice2 = diceRoll()
        if dice1 == dice2:
            dice1 = diceRoll()
            dice2 = diceRoll()
            if dice1 == dice2:
                return 3
            else:
                return 2
        else:
            return 1

    else:
        return 0


TRIALS = 100
outcomes = {0: 0, 1: 0, 2: 0, 3: 0}
for _ in range(TRIALS):
    result = turn()
    outcomes[result] += 1

for numDoubles in outcomes:
    print(numDoubles, outcomes[numDoubles] / TRIALS)
