# 1.

import random


def evenWords(wordList):
    evencount = 0
    for i in range(len(wordList)):
        if len(wordList[i]) % 2 == 0:
            evencount += 1
    return evencount


print(evenWords(["cool", "hot", "warm"]))
print(evenWords(["Batman", "Spider-Man", "All Might"]))
print(evenWords(["zero", "one", "two", "three"]))

# 2.


def readList(file):
    total = 0
    letters = []
    newword = ''
    newnumber = ''
    with open(file, 'r') as openFile:
        lines = [line.strip() for line in openFile.readlines()]
        lines = [line.split(',') for line in lines]
    for i in range(len(lines)):
        if lines[i][0] == "Food":
            for j in lines[i][-1]:
                if j == "$":
                    j += 1
                    newnumber += j

            # Cannot add line with '$' in from of 13.21
            total += float(lines[i][-1])
    return total


print(readList("rando.csv"))

# 3.


def coinFlip():
    return random.randint(1, 2)


def coinGame():
    headcount = 0
    tailcount = 0
    for _ in range(10):
        flip = coinFlip()
        if flip == 1:
            headcount += 1
        else:
            tailcount += 1
    if headcount == 5 and tailcount == 5:
        return True
    else:
        return False


def winOdds(TRIALS):
    wincount = 0
    for _ in range(TRIALS):
        game = coinGame()
        if game:
            wincount += 1
        else:
            continue
    return (wincount/TRIALS)


print(winOdds(10000))
