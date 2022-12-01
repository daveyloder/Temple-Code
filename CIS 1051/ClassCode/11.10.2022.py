import random


def createshuffleddeck():
    deck = ["2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"]*4
    random.shuffle(deck)
    return deck


def game():
    deck = createshuffleddeck()
    royals = ["J", "Q", "K"]
    pile1 = []
    pile2 = []
    pile3 = []

    numtodivide = random.randint(1, 50)
    for _ in range(numtodivide):
        pile1.append(deck.pop())
    numtodivide = random.randint(1, len(deck) - 1)
    for _ in range(numtodivide):
        pile2.append(deck.pop())
    pile3 = deck
    if pile1[0] in royals or pile2[0] in royals or pile3 in royals:
        return False
    else:
        return True


TRIALS = 100000
wins = 0
for _ in range(TRIALS):
    if game():
        wins += 1
print(wins/TRIALS)
