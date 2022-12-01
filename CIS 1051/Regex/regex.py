# Practice Exam 3

def makeUserName(name, n):
    username = ""
    name = name.lower()
    parts = name.split()
    for p in parts:
        firstletter = p[0]
        username += firstletter
    username = username + str(n)
    return username


print(makeUserName("David Loder", 92))


def XOR(a, b):

    if (a == True and b == True) or (a == False and b == False):
        return False
    else:
        return True

    # if a == True and b == True:
    #     return False
    # if a == True and b == False:
    #     return True
    # if a == False and b == True:
    #     return True
    # if a == False and b == False:
    #     return False


def sumOfTHrees(numbers):
    total = 0
    for list in numbers:
        for num in list:
            if num % 3 == 0:
                total += num


def allDigitsProduct(listOfNums):
    product = 1
    for number in listOfNums:
        number = abs(number)
        while number > 0:
            lastDigit = number % 10
            number = number // 10
            product *= lastDigit
    return product


def has231(arr):
    for index, x in enumerate(arr[:-2]):
        y = arr[index+1]
        z = arr[index+2]
        if x + 1 == y and x - 1 == z:
            return True
    return False


print(has231([1, 2, 3, 1, 5]))
