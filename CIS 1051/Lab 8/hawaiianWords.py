# Variables
vowels = {
    'a': 'ah',
    'e': 'eh',
    'i': 'ee',
    'o': 'oh',
    'u': 'oo'
}

vowelPairs = {
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

constants = {
    'p': 'p',
    'k': 'k',
    'h': 'h',
    'l': 'l',
    'm': 'm',
    'n': 'n'
}


def check(word):
    valid = ['p', 'k', 'h', 'l', 'm', 'n', 'w',
             'a', 'e', 'i', 'o', 'u', ' ', '\'']
    for c in word:
        c = c.lower()
        if valid.count(c) == 0:
            print(c, ' is not a valid character.')
            return False
    return True


def pronounce(word):

    word1 = word.lower()

    index = 0
    output = []

    while index < len(word1):
        letters = word1[index]

        if index < len(word1) - 1:
            doubleV = letters + word1[index + 1]
            pr = vowelPairs.get(doubleV)

            if pr is None:
                pr = vowels.get(letters)
            else:
                index += 1
        else:
            pr = vowels.get(word)

        if pr is not None and index < len(word1) - 1:
            pr += "-"
        output.append(pr or letters)
        index += 1
    print("".join(output))
    return ("".join(output))

# def soundout(part):
#     lower_part = part.lower()
#     result = ''
#     part_len = len(lower_part)

#     if part_len < 2:
#         result = vowels.get(lower_part)
#     else:
#         for i, char in enumerate(lower_part):
#             if constants.get(char):
#                 if (i-1) < 0:
#                     result += char
#                 elif vowels.get(lower_part[i-1]):
#                     result += "-" + char
#             else:
#                 if i < part_len-1:
#                     pair = char + lower_part[i+1]
#                     if vowelPairs.get(pair):
#                         result += vowelPairs.get(pair)
#                     elif vowels.get(char):
#                         result += vowels.get(char)
#                 elif vowels.get(char):
#                     if ((i-1) > -1) and vowels.get(lower_part[i-1]):
#                         pass
#                     else:
#                         result += vowels.get(char)

#     return result


# def pronounce(word):
#     wordResult = []
#     parts = word.split(' ')
#     for part in parts:
#         wordResult.append(soundout(part))
#     print(' '.join(wordResult).capitalize())
#     return(' '.join(wordResult).capitalize())


userInput = ''
while userInput == '':
    userInput = str(input('Please enter a hawaiian word to pronouce: '))

    if check(userInput):
        pronounce(userInput)
    repeat = str(
        input("Would you like to enter another word? \n Y/YES/N/NO: "))
    repeat = repeat.upper()
    if repeat == 'N' or repeat == 'NO':
        print('Thank you! Goodbye!')
        break
    else:
        userInput = ''
