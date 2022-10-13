def multiTable(n):

    # Loop to create rows
    for row in range(1, n+1):
        # Loop to create columns
        for col in range(1, n+1):

            # Multiplies the value of colums and rows, then multiplies them to create the table
            print(row*col, end="\t")
        print()


number = int(input("Please put in a number: "))
multiTable(number)
