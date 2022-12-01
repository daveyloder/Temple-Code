# ssn.txt example
import re

data = open("ssn.txt", "r")
text = data.read()

outputtext = re.sub("\d{3}-\d{2}-\d{4}", "[DERP]", text)
outputtext = re.sub("David Loder", "[THAT ASSHOLE]", outputtext)
outputFile = open("ssnRedacted.txt", "w")
outputFile.write(outputtext)
outputFile.close()

# tuemail example
emaildata = open("tuemail.txt", "r")
emailtext = emaildata.read()

regex = "tu[a-zA-Z]\d{5}@temple\.edu"
outputemailtext = re.sub(regex, "[DENIED]", emailtext)
outputEmailFile = open("emailRedacted.txt", "w")
outputEmailFile.write(outputemailtext)
outputEmailFile.close()
