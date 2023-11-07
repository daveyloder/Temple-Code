total = 0.0
change = 0.0




def isFloat(change):
    while True:
        try:
            change = float(input("Change owed: "))
        except ValueError:
            print("Invalid Input")
            continue
        else:
            break


change = float(input("Change owed: "))
cents = round(int(change * 100))


while cents > 0:
    if cents >= 25:
        cents = cents - 25
        count = count + 1
    elif cents >= 10:
        cents = cents - 10
        count = count + 1
    elif cents >= 5:
        cents = cents - 5
        count = count + 1
    elif cents >= 1:
        cents = cents - 1
        count = count + 1

print(count)
