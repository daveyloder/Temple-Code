# Question 2
def readFile(filename):
    dates = []
    highs = []
    lows = []
    date = open(filename, "r", "utf8")

    return dates, highs, lows


def higestHigh(dates, highs):
    highestDay = ""
    highestTemp = ""
    for index, date in enumerate(dates):
        dailyTemp = highs[index]
        if dailyTemp > highestTemp:
            highestTemp = dailyTemp
            highestDay = date
    return highestDay


def avgHighs(highs):
    # return sum(highs / len(highs))
    numHighs = 0
    sumHighs = 0
    for temp in highs:
        numHighs += 1
        sum


# Question 8

def readFileAndSum(filename):
    data = open(filename, "r")
    total = 0
    for line in data:
        fields = line.split(",")
        for n in fields:
            n = int(n)
            if n % 2 == 0:
                total += n

    return total

# Question 9 (Method Writing)


def unOrUn(word):
    if word[0:2] == "un":
        # if word[0] == "u" and word[1] == "n":
        return word[2:]
    else:
        return "un" + word

# Question 10


def maxMinDiff(numbers):
    biggest = numbers[0]
    smallest = numbers[0]
    for num in numbers:
        if num > biggest:
            biggest = num
        if num < smallest:
            smallest = num

    return biggest - smallest
    # return max(numbers) - min(numbers) ---- single line approach

# Question 11


def swapEnds(numbers):
    first = numbers[0]
    last = numbers[-1]
    numbers[-1] = first
    numbers[0] = last

    # numbers[0] = numbers[-1]#[len(numbers) - 1]

# Question 12


def hasWildcat(word):
    for index in range(len(word)-2):
        if word[index] == "c" and word[index+2] == "t":
            return True
    return False


print(hasWildcat("taco"))

# Question 14


def sumDigits(num):
    total = 0
    num = +num
    while num != 0:
        total += num % 10
        num = num // 10
    # String way of doing it
    # num = str(num)
    # if num[0] == "-":
    #     num = num[1:]
    # for digit in num:
    #     total += int(digit)
    return total
