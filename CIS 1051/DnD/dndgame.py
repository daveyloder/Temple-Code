import random


def d6():
    return random.randint(1, 6)


def d20():
    return random.randint(1, 20)


def attackRoll():
    roll = d20() + 5
    target = 15
    if roll > target:
        return True
    else:
        return False


def damageRoll():
    roll = d6() + d6() + 3
    target = 7
    if roll >= target:
        return True
    else:
        return False


TRIALS = 100000
wins = 0
for _ in range(TRIALS):
    isHit = attackRoll()
    if isHit:
        isOHKO = damageRoll()
        if isOHKO:
            wins += 1
print(wins/TRIALS)
