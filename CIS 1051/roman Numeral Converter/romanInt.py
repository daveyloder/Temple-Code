def romanInt(s: str):
    alphabet = {
        'I': 1,
        'V': 5,
        'X': 10,
        'L': 50,
        'C': 100,
        'D': 500,
        'M': 1000,
    }
    dec_num = 0
    last_num = 0

    for ch in s[::-1]:
        if last_num > alphabet[ch]:
            dec_num -= alphabet[ch]
        else:
            dec_num += alphabet[ch]
        last_num = alphabet[ch]

    print(dec_num)
    return dec_num


romanInt(input("Please enter a roman numeral: ").upper())
