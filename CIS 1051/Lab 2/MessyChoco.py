# Variables
weight = int(input("What is your current weight? "))
height_f = int(input("What is your height in feet? "))
height_in = int(input("What is your height in inches? "))
height = (height_f * 12) + height_in
age = int(input("What is your current age? "))
gender = input("What is your biological gender? ")
lowerCaseGender = gender.lower()
candyBarCalories = 214

# If statement to check gender and run specific BMR equation based on gender
if lowerCaseGender == "female":
    BMR = 655.1 + (weight * 4.35)+(4.7*height)-(4.7*age)
    print("Your BMR is " + str(BMR))
    # Takes difference of BMR and one candy bar calorie
    calorieDiff = BMR - candyBarCalories
    # Divides calorie difference with one candy bar calorie count and rounds it to get how many candy bars can be eaten.
    candyBarCount = round(calorieDiff / candyBarCalories)
    print("You can eat %d candy bars!" % candyBarCount)
else:
    BMR = 66 + (6.2*weight) + (12.7 * height)-(6.76 * age)
    print("Your BMR is " + str(BMR))
    calorieDiff = BMR - candyBarCalories
    candyBarCount = round(calorieDiff / candyBarCalories)
    print("You can eat %d candy bars!" % candyBarCount)
