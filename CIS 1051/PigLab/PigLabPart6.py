import random


def diceRoll():
    '''Return a random number from 1 to 6 inclusive'''
    return random.randint(1, 6)


def pigHoldAt20OrGoal():
    score = 0
    turnCount = 0
    while score < 100:
        total = 0
        result = 0
        done = False
        while total < 20 and not done:
            result = diceRoll()
            if result == 1:
                total = 0
                done = True
                turnCount += 1
            else:
                total += result
                turnCount += 1
        score += total
    print("Total Score: ", score)
    print('Total turns: ', turnCount)
    return turnCount


def averagePigGame():
    games = int(input("Games? "))
    gameTurnCount = 0
    for _ in range(games):
        gameTurnCount += pigHoldAt20OrGoal()
    print("Average turns: " + str(gameTurnCount/games))


averagePigGame()
