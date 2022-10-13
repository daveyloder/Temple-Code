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
    chars = word.lower()
    print(len(chars))
    i = 0
    result = []

    while i < len(chars):
        char = chars[i]
        # print(char)
        if i < len(chars) - 1:
            print(char + chars[i + 1])
            pair = char + chars[i + 1]
            tr = vowelPairs.get(pair)

            if tr is None:
                tr = vowels.get(char)

            else:
                i = i + 1

        else:
            tr = vowels.get(char)
        if tr is not None and i < len(chars) - 1:
            tr = tr + '-'

        result.append(tr or char)
        i = i + 1

        wordResult = ''.join(result)

    print(wordResult)
    return wordResult


check('E komo mai')
pronounce('E komo mai')
# userInput = ''
# while userInput == '':
#     userInput = str(input('Please enter a hawaiian word to pronouce: '))

#     if check(userInput):
#         pronounce(userInput)
#     repeat = str(
#         input("Would you like to enter another word? \n Y/YES/N/NO: "))
#     repeat = repeat.upper()
#     if repeat == 'N' or repeat == 'NO':
#         print('Thank you! Goodbye!')
#         break
#     else:
#         userInput = ''
