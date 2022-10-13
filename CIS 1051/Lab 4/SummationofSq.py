from operator import index


# Create variable to hold superset values
superscript = str.maketrans("0123456789", "⁰¹²³⁴⁵⁶⁷⁸⁹")


def Summation(n):
    # Set value of Sum of squares to 0
    sumOfSquares = 0
    # For loop to add expoents to each loop number
    for i in range(1, n+1):
        sumOfSquares += i ** 2
        # Format the output to add each loop, if i is greater than on, add addition operator in between each exponent.
        if i > 1:
            print('+ ', end="")
        # Concatnate iteration with superscript exponent
        print(str(i) + "2".translate(superscript), end="")
    # Print the equal sign and the output result.
    print("= " + str(sumOfSquares))


number = int(input("Please enter a number: "))
Summation(number)
