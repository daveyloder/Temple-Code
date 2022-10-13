d = {}

for i in range(97, 123):
    d[i] = chr(i)


for key in d.keys():
    print(key)

for v in d.values():
    print(v)

for k, v in d.items():
    print(k, v)

# delete object in dictionary
del d[121]
