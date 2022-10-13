# Luhn's Algorithm check sum function
def luhn_checksum(cardNumber):
    # Another function to take the input and seperate each digit into a list
    def digitsOf(n):
        return [int(d) for d in str(n)]
    # Calling the function to the input and assigning it a variable
    digits = digitsOf(cardNumber)
    # Seperating the odd amount of steps in the list with the even steps
    oddDigits = digits[-1::-2]
    evenDigits = digits[-2::-2]
    checksum = 0
    checksum += sum(oddDigits)
    for d in evenDigits:
        checksum += sum(digitsOf(d*2))
    return checksum % 10

# A function to confirm that the card is a valid check sum


def isLuhnValid(cardNumber):
    return luhn_checksum(cardNumber) == 0

# A function to find what brand of card the input is and to prompt the user if invalid or unknown


def cardType(cardNumber):
    def digitsOf(n):
        return [int(d) for d in str(n)]
    digits = digitsOf(cardNumber)
    firstTwo = digits[0:2:1]
    firstTwoConcat = int("".join(map(str, firstTwo)))
    if isLuhnValid(cardNumber) == False:
        print("INVALID, CARD SUMCHECK FAILED")
    elif firstTwo[0] == 4:
        print("VISA")
    elif firstTwoConcat == 34 or firstTwoConcat == 37:
        print("AMERICAN EXPRESS")
    elif firstTwoConcat >= 51 and firstTwoConcat <= 56:
        print("MASTERCARD")
    elif firstTwo[0] == 2:
        print("MASTERCARD")
    elif firstTwo[0] == 6:
        print("DISCOVER")
    else:
        print("UNKNOWN")


# Use try while loop to check if input is actually a number to a typed string.
userInput = 0

while userInput == 0:
    try:
        userInput = int(input("Please enter your card number: "))
        if userInput < 0:
            userInput = 0
            print("Please enter a valid card number, the numbers cannot be negative.")
            continue
    except ValueError:
        userInput = 0
        print("Please enter a valid card number, if you are using hyphens please remove them from the number.")
        continue

    else:
        result = isLuhnValid(userInput)
        print("Number: " + str(userInput))
        cardType(userInput)
        break
