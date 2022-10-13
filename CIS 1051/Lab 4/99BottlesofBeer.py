def bottlesOfBeer(n):
    for i in range(n):
        if i > 1:
            print(str(n) + " bottles of beer on the wall, " + str(n) + " bottle of beer!\r")
            print("You take one down, pass it around!\n")
        else:
            print(str(n) + " bottle of beer on the wall, " + str(n) + " bottle of beer!\r")
        n-=1
        if n == 1:
            print("You take one down, pass it around!, " + str(n) + " bottle of beer on the wall!\n")
            
        else:
            print("You take one down, pass it around!, " + str(n) + " bottles of beer on the wall!\n")
        
        
bottles = int(input("How many beers? "))
bottlesOfBeer(bottles)