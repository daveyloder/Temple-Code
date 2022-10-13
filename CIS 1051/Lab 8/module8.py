
def mostCommonLetter(text):
    sightings = [0]*26
    for letter in text:
        letter = letter.lower()
        # converts letter from [97, 122] to the range [0, 25] inclusive*
        targetIndex = ord(letter) - ord("a")
        if 0 <= targetIndex <= 25:
            sightings[targetIndex] += 1

    mostSightings = max(sightings)
    mostCommonLetter = sightings.index(mostSightings)
    return chr(mostCommonLetter + ord("a"))


def findBiggest(stuff):
    biggest = 0
    for thing in stuff:
        if thing > biggest:
            biggest = thing
    return biggest


test = "Hello, my name is David"
print(mostCommonLetter(test))
