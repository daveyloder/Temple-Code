# User seconds input
secondsToCalc = int(input("Please input amount of time in seconds: "))
# Modulus calculations
modulusHours = (secondsToCalc % 3600)
modulusMinutes = (modulusHours % 60)
modulusSeconds = (modulusMinutes)
# Returned equations with subtracting difference of remainders and dividing the differenece
returnedHours = round((secondsToCalc - (modulusHours)) / 3600)
returnedMinutes = round((modulusHours - (modulusMinutes)) / 60)
returnedSeconds = round(modulusSeconds)

# Grammar if statement for if hours is plural based if hour is equal to 1
if returnedHours == 1:
    print(str(secondsToCalc) + " seconds equals " + str(returnedHours) + " hour, " +
          str(returnedMinutes) + " minutes, and " + str(returnedSeconds) + " seconds.")
else:
    print(str(secondsToCalc) + " seconds equals " + str(returnedHours) + " hours, " +
          str(returnedMinutes) + " minutes, and " + str(returnedSeconds) + " seconds.")
