import random


def rolld6():
    return random.randint(1, 6)


outcomes = {}
for _ in range(1000):
    roll = rolld6() + rolld6()
    if roll in outcomes:
        outcomes[roll] += 1
    else:
        outcomes[roll] = 1
for v in sorted(outcomes):
    print(v, outcomes[v])
