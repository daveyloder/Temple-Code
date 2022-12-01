# Coin toss based off sequence.

import random


def cointoss():
    sides = ["H", "T"]
    return random.choice(sides)


def game(seq1, seq2):
    outcomes = ""
    while True:
        outcomes += cointoss()
        if outcomes[-3:] == seq1:
            return 1
        if outcomes[-3:] == seq2:
            return 2


TRIALS = 100000
playeronewins = 0

for _ in range(TRIALS):
    winner = game("HHT", "THH")
    if winner == 1:
        playeronewins += 1

print(playeronewins/TRIALS, (TRIALS - playeronewins)/TRIALS)
