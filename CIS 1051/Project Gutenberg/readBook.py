data = open("./data/dracula.txt", "r", encoding="utf-8")
text = data.read()

lines = text.split("\n")

for line in lines:
    print(line)
