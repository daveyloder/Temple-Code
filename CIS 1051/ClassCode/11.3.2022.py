# Monticarlo approxamations
import random


def game():
    cards = ["R", "R", "B", "B", "B", "B", "B", ]  # Card selection
    random.shuffle(cards)  # suffles items in the list
    selection = random.sample(cards, 3)  # samples 3 random list items
    if "R" not in selection:
        return True
    else:
        return False


TRIALS = 10000
wins = 0

for _ in range(TRIALS):
    if game():
        wins += 1
print(wins/TRIALS)


# Monte Carlo Practice Exam Question 4
