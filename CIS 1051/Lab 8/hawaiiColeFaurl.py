consonants = ["p", "k", "h", "l", "m", "n", "w"]
vowels = {"a": "ah", "e": "eh", "i": "ee", "o": "oh", "u": "oo"}
doubleVowel = {
    'ai': 'eye',
    'ae': 'eye',
    'ao': 'ow',
    'au': 'ow',
    'ei': 'ay',
    'eu': 'eh-oo',
    'iu': 'ew',
    'oi': 'oyo',
    'ou': 'ow',
    'ui': 'ooey',
    'iw': 'v',
    'ew': 'v'
}


def validate(word):
    validCh = ["p", "k", "h", "l", "m", "n",
               "w", "a", "e", "i", "o", "u", " ' ", " "]
    for ch in word:
        if ch not in validCh:
            print("{} is not a valid hawaiian character".format(ch))
            return False
        else:
            return True


word = input("Enter a hawaiian word to pronounce:").lower()

while validate(word) == False:
    word = input("Enter a hawaiian word to pronounce:").lower()

validate(word)


def pronounce(word):
    word = word.lower()
    output = " "
    i = 0
    word_len = len(word)

    while i < word_len:
        ch = word[i].lower()

        if ch == "a":
            nextCh = word[i + 1]
            nextCh = nextCh.lower()

            if nextCh == "i":
                output += doubleVowel["ai"]
                i += 1
            elif nextCh == "e":
                output += doubleVowel["ae"]
                i += 1
            elif nextCh == "o":
                output += doubleVowel["ao"]
                i += 1
            elif nextCh == "u":
                output += doubleVowel["au"]
                i += 1
            else:
                output += vowels["a"]

        elif ch == "e":
            nextCh = word[i + 1]
            nextCh = nextCh.lower()

            if nextCh == "i":
                output += doubleVowel["ei"]
                i += 1
            elif nextCh == "u":
                output += doubleVowel["eu"]
                i += 1
            else:
                output += vowels["e"]

        elif ch == "i":
            nextCh = word[i + 1]
            nextCh = nextCh.lower()

            if nextCh == "u":
                output += doubleVowel["iu"]
                i += 1
            else:
                output += vowels["i"]

        elif ch == "o":
            nextCh = word[i + 1]
            nextCh = nextCh.lower()

            if nextCh == "i":
                output += doubleVowel["oi"]
                i += 1
            elif nextCh == "u":
                output += doubleVowel["ou"]
                i += 1
            else:
                output += vowels["o"]

        elif ch == "u":
            nextCh = word[i + 1]
            nextCh = nextCh.lower()

            if nextCh == "i":
                output += doubleVowel["ui"]
                i += 1
            else:
                output += vowels["u"]

        elif ch == "p":
            output += "p"
            i += 1

        elif ch == "k":
            output += "k"
            i += 1

        elif ch == "h":
            output += "h"
            i += 1

        elif ch == "l":
            output += "l"
            i += 1

        elif ch == "m":
            output += "m"
            i += 1

        elif ch == "n":
            output += "n"
            i += 1

        elif word[0] == "w":
            output += "w"
            i += 1

        elif ch == "a":
            nextCh = word[i+1]
            nextCh = nextCh.lower()

            if nextCh == "w":
                output += "w"
                i += 1

        elif ch == "i" or ch == "e":
            nextCh = word[i+1]
            nextCh = nextCh.lower()

            if nextCh == "w":
                output += "v"
                i += 1

        elif ch == "u" or ch == "o":
            nextCh = word[i+1]
            nextCh = nextCh.lower()

            if nextCh == "w":
                output += "w"
                i += 1

    print(output)


pronounce("aloha")
