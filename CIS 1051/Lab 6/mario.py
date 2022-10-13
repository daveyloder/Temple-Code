# Variables
height = 0

# User Input, validates number has to be between 1 and 8

while height < 1 or height > 8:
    height = int(input("Height: "))
    if height <= 0:
        print("Your input needs to be equal to one or eight, please try again.")
    elif height >= 9:
        print("Your input needs to be equal to one or eight, please try again.")


def pyramid(height):
    # Establishes the rows of the blocks. range(1, height+1) needs to have numbers that are not equal to 0 or there will be a blank row.
    for row in range(1, height+1):
        # The spacing to start the block column
        for col in range(height-row):
            print(" ", end="")
        # Printing first block(s) based on row
        for col in range(row):
            print("#", end="")
        # Printing the double space in the middle
        print("  ", end="")
        # Printing the second block(s) based on row
        for col in range(row):
            print("#", end="")
        # Print the whole row for loop
        print()


pyramid(height)
