data = open("./data/dracula.txt", "r", encoding="utf-8")
count = {}
lines = data.readlines()
# print(lines)
for line in lines:
    words = line.split()
    # print(words)
    for word in words:
        word = word.strip()
        word = word.lower()
        if word[-1] in ".',?!--_":
            word = word[:-1]

        if word not in count:
            count[word] = 1
            # print("new word!")
            # print(count)
            # print("----------")
        else:
            count[word] += 1
for word in sorted(count, key=count.get, reverse=True)[:20]:
    print(word, count[word])
