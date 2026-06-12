from random import randint

V = [randint(3, 10) for _ in range(5)]
n = len(V)
print(f"Lista original: {V}")

big = 0
for num in V:
    if num >= big:
        big = num + 1
count = [0 for x in range(big)]

for i, _ in enumerate(count):
    c = 0
    for value in V:
        if i == value:
            c += 1
    count[i] = c

print(f"Count: {count}\n")
V_sorted = [0 for x in range(n)]

for num in range(n-1):
    for i, value in enumerate(count):
        c = num
        if value > 0:
            print(f"valor: {value}\níndice: {i}")
            for _ in range(value):
                V_sorted[c] = i
                print(V_sorted[c])
                c += 1
        print(V_sorted)

print(f"Lista ordenada: {V_sorted}")
