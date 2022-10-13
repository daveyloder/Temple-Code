import math

limit = 10
sign = 1
total = 0


for denominator in range(1, limit, 2):
    print(str(sign) + "/"+str(denominator))
    total = total + sign/denominator
    sign = sign * - 1


print("\nThe total is: ")
print(total * 4)
print(math.pi)
