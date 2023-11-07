# Vending Machine Variables


choice = {1: ["Coca-cola", 2.50],
          2: ["Dasani Water", 1.00],
          3: ["Tropical Orange Juice", 2.25],
          4: ["Dr Pepper", 2.50]
          }
customerchoice = ""
cost = 0
change = 0
customerpayment = 0
# List all choices to the customer
for key, value in choice.items():
    print(str(key) + ": " + str(value[0]))
    print("Price: $" + str('{:.2f}'.format(value[1])) + "\n")
# Customer makes a choice
customerinput = int(input(
    "What would you like?\nEnter the number for your choice. "))
# Match input with choice
for key, value in choice.items():
    if key == customerinput:
        print("\nYou chose " + value[0])
        customerchoice = value[0]
        print("Your total is $" + str('{:.2f}'.format(value[1])) + "\n")
        cost = value[1]
# Takes payment from customer and gives change
print("How would you like to pay?")
customerpayment = input("Please type payment including change. $")
# Takes difference in payment and cost
change = float(customerpayment) - cost
change = '{:.2f}'.format(change)
# Prints response with change
print("\n")
print("Ker-clank!")
print("Your change is $" + change)
print("Enjoy your " + customerchoice + "!")
