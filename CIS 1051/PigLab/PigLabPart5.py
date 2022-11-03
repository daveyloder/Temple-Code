import random

pigplayerscore = 0


def diceRoll():
    '''Return a random number from 1 to 6 inclusive'''
    return random.randint(1, 6)


def autoPigScore(score):
    while score < 100:
        total = 0
        result = 0
        done = False
        while total < 20 and not done:
            result = diceRoll()
            print("Roll: " + str(result))
            if result == 1:
                total = 0
                done = True
            else:
                total += result
        print("Turn Total: " + str(total))
        score = score + total
        print("New score: " + str(score))
    return score


autoPigScore(0)
