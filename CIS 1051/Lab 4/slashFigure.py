
def slashFigure(n):
    for i in range(n, 0, -1):
        equation = int(n * 2 + (n*2-2))
        if i == n:
            for j in range(0, equation):
                print("!", end="")
        else:
            for j in range(n-i):
                print("\\\\", end="")
            for j in range(1, 2*i):
                print("!", end="")
            for j in range(1, 2*i):
                print("!", end="")
            for j in range(n-i):
                print("//", end="")
        print()
    # print(len(range(0, equation)))


slashFigure(4)
