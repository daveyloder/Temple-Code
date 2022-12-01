# 1. Username

def makeUserName(name, n):
    username = ""
    name = name.lower()
    char = name.split()
    for c in char:
        firstletter = c[0]
        username += firstletter
    username += str(n)
    return username


print(makeUserName("David Loder", 92))

# 2. XOR


def XOR(a, b):
    if (a == True and b == True) or (a == False and b == False):
        return False
    else:
        return True


print(XOR(True, True))


# 3. Sum of Threes


def sumOfThrees(arr):
    total = 0
    for i in range(len(arr)):
        for j in range(len(arr[i])):
            if arr[i][j] % 3 == 0:
                total += arr[i][j]
    return total


print(sumOfThrees([[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]]))
print(sumOfThrees([[10, 20], [5], [20, 15, 1, 1, 1]]))
print(sumOfThrees([[10, 20, 51], [10, 20, 30]]))

# 4. All Digits Multiplication


def allDigitsProduct(nums):
    product = 1
    nums = list(nums)
    for i in nums:
        i = abs(i)
        while i > 0:
            lastDigit = i % 10
            i = i // 10
            product *= lastDigit
    return product


print(allDigitsProduct([1, 2, 3, 4, 5]))
print(allDigitsProduct([10, 20, 5]))
print(allDigitsProduct([44, 12, 3112]))

# 5. Has 231 pattern


def has231(arr):
    for index, x in enumerate(arr[:-2]):
        y = arr[index+1]
        z = arr[index+2]
        if x + 1 == y and x - 1 == z:
            return True
    return False
