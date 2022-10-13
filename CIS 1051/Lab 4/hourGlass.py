def hourGlass(row):
    # Top of hour glass
    # HourGlass Rows
    for i in range(row, 0, -1):
        # If row is top of hour glass
        if i == row:
            print("|", end="")
            for j in range(1, 2*i):
                print('"', end="")
            print("|", end="")
        # draws the rest of the hour glass down
        elif i == 1:
            for j in range(row-i):
                print(" ", end="")
            print("| |", end="")
        else:
            for j in range(row-i):
                print(" ", end="")
            print("\\", end="")
            for j in range(1, 2*i):
                print(":", end="")
            print("/", end="")
        print()

    # Bottom of hour glass
    # HourGlass Rows reversed order
    for i in range(2, row+1, +1):
        # If row is bottom of hour glass
        if i == row:
            print("|", end="")
            for j in range(1, 2*i):
                print('"', end="")
            print("|", end="")
        else:
            for j in range(row-i):
                print(" ", end="")
            print("/", end="")
            for j in range(1, 2*i):
                print(":", end="")
            print("\\", end="")
        print()


hourGlass(6)
