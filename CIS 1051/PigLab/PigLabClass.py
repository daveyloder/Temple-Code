# If roll = 1, the turn is over and equals 0 points
# If a roll = 2 - 6, the number is added to the player's turn and the turn continues

# Simulation of the computer rolling the dice
import random


def roll():
    return random.randint(1, 6)


def autoPig(holdValue=20):  # part 1
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

def holdAt20(trials):  # part 2
    outcomes = {}
    for _ in range(trials):
        turnTotal = autoPig(30)
        if turnTotal in outcomes:
            outcomes[turnTotal] += 1
        else:
            outcomes[turnTotal] = 1
    for score in outcomes:
        print(score, outcomes[turnTotal]/trials)


# holdAt20(100000)


def autoPigX(hold):  # part 3
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


def holdAtTargetOrGoal(score, holdValue=20):  # part 4
    total = 0
    done = False
    while total < holdValue and not done and total + score < 100:
        result = roll()
        print("Roll: " + str(result))
        if result == 1:
            total = 0
            done = True
        else:
            total += result
    print("Turn Total: " + str(total))
    print(score)
    return total


holdAtTargetOrGoal(90, 20)


# Part 7

# Part 8
