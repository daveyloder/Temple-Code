# Question 2

def readfile(filename):
    data = open(filename, 'r')
    data = data.readlines()
    for i in data:
        i.strip()
    print(data)


readfile('race.csv')
