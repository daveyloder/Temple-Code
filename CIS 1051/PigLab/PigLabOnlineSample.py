import random


def pigGame():
    playerOne_score = 0
    playerTwo_score = 0
    while True:
        playerOne_score += playerOne_move(playerOne_score, playerTwo_score)
        playerTwo_score += playerTwo_move(playerOne_score, playerTwo_score)
        if isGameOver(playerOne_score, playerTwo_score):
            break


def diceRoll():
    '''Function to return a random number in the range 1 to 6, including 6'''
    rollNumber = random.randint(1, 6)
    return rollNumber


def playerOne_move(playerOne_score, playerTwo_score):
    playerOne_move_score = 0
    playerOne_roll = diceRoll()
    print("Player One rolled" + str(playerOne_roll)+".")
    if playerOne_roll == 1:
        print("Your current score is " +
              str(playerOne_score-playerOne_move_score) + ".")
        return 0
    else:
        while playerOne_roll != 1:
            playerOne_move_score += playerOne_roll
            playerOne_score += playerOne_roll
            print(("Roll: "+str(playerOne_score) + "\n"))
        print(("Roll: "+str(playerOne_score) + "\n"))
        return 0


def playerTwo_move(playerOne_score, playerTwo_score):
    '''Player Two rolls number of times, displays the result of each roll.'''
    playerTwo_move_score = 0
    playerTwo_roll = diceRoll()
    print("")


def isGameOver(playerOne_score, playerTwo_score):
    if(playerOne_score >= 100 or playerTwo_score >= 100) and playerOne_score != playerTwo_score:
        return True
    else:
        return False


pigGame()
