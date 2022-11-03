import random

# Rules of the game

# Two players roll dice
# First player to reach 100 points wins


def diceRoll():
    '''Return a random number from 1 to 6 inclusive'''
    return random.randint(1, 6)


def pigGame():
    humanScore = 0
    roll = 0
    gameOver = False
    while humanScore < 20 and not gameOver:
        roll = diceRoll()
        if roll == 1:
            humanScore = 0
            gameOver = True
        else:
            humanScore += roll
    return humanScore


def holdAtOutcomes(trials):
    outcomes = {}
    for _ in range(trials):
        turnTotal = pigGame()
        if turnTotal in outcomes:
            outcomes[turnTotal] += 1
        else:
            outcomes[turnTotal] = 1
    print("Score", "    Estimated Probability")
    for turnTotal in sorted(outcomes):
        print(turnTotal, "       ", outcomes[turnTotal]/trials)


holdAtOutcomes(1000)
