# def mostCommonLetter(text):
#     sightings = [0]*26
#     for letter in text:
#         letter = letter.lower()
#         # converts letter from [97, 122] to the range [0, 25] inclusive*
#         targetIndex = ord(letter) - ord("a")
#         if 0 <= targetIndex <= 25:
#             sightings[targetIndex] += 1

#     mostSightings = max(sightings)
#     mostCommonLetter = sightings.index(mostSightings)
#     return chr(mostCommonLetter + ord("a"))

def mostCommonChar(text):
    charCounts = {}

    for char in text:
        if char not in charCounts:
            charCounts[char] = 1
        else:
            charCounts[char] = charCounts[char] + 1

    mostCommon = ["", -2341234123412341]
    for char, count in charCounts.items():
        if count > mostCommon[1]:
            mostCommon = [char, count]

    return mostCommon[0]


def findBiggest(stuff):
    biggest = 0
    for thing in stuff:
        if thing > biggest:
            biggest = thing
    return biggest


# with open('japanese.txt', 'r', encoding='utf8') as f:
#     lines = f.readlines()
#     lines = [line.replace(' ', '') for line in lines]
#     lines = [line.replace('\r', '') for line in lines]
#     lines = [line.replace('\n', '') for line in lines]
# with open('japanese.txt', 'w', encoding='utf8') as f:
#     f.writelines(lines)
# print(lines)
f = open('japanese.txt', 'r', encoding='utf8')
text = f.read()
print(mostCommonChar(text))
