import random


def piggame():
    playeronescore = 0
    playertwoscore = 0
    print("Player 1 score: " + str(playeronescore))
    print("Player 2 score: " + str(playertwoscore))
    while True:
        print("It is player 1's turn")
        playeronescore += holdAtTargetOrGoal(playeronescore,)
        print("New score: " + str(playeronescore))
        print("Player 1 score: " + str(playeronescore))
        print("Player 2 score: " + str(playertwoscore))
        print("It is player 2's turn")
        playertwoscore += holdAtTargetOrGoal2(playertwoscore,)
        print("New score: " + str(playertwoscore))
        print("Player 1 score: " + str(playeronescore))
        print("Player 2 score: " + str(playertwoscore))

        if gameOver(playeronescore, playertwoscore):
            break


def diceRoll():
    return random.randint(1, 6)


def holdAtTargetOrGoal(score, holdValue=20):  # part 4
    total = 0
    done = False
    while total < holdValue and not done and total + score < 100:
        result = diceRoll()
        print("Roll: " + str(result))
        if result == 1:
            total = 0
            done = True
        else:
            total += result
    print("Turn Total: " + str(total))
    return total


def holdAtTargetOrGoal2(score, holdValue=20):  # part 4
    total = 0
    done = False
    while total < holdValue and not done and total + score < 100:
        result = diceRoll()
        print("Roll: " + str(result))
        if total <= 0:
            print("Turn Total: " + str(result))
        elif result == 1:
            print("Turn Total: " + str(0))
        else:
            print("Turn Total: " + str(total + result))
        rollagain = askYorN(
            'Do you want to roll again? Please type "Y" for yes or "N" for no.')
        if result == 1:
            total = 0
            done = True
        else:
            total += result

        if rollagain:
            pass
        elif rollagain == True and result == 1:
            done = True
        else:
            done = True

    print("Turn Total: " + str(total))
    return total


def gameOver(playeronescore, playertwoscore):
    if (playeronescore >= 100 or playertwoscore >= 100) and playeronescore != playertwoscore:
        return True
    else:
        return False


def askYorN(prompt):
    answer = input(prompt)
    if answer != "" and (answer[0].lower() == "y"):
        return True
    elif answer != "" and (answer[0].lower() == "n"):
        return False
    else:
        return askYorN(prompt)


piggame()
