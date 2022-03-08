import sys
x = []
y = []
four_x = 0
four_y = 0 
for i in range(3):
    a, b = sys.stdin.readline().split()
    x.append(a)
    y.append(b)
for j in range(3):
    if x.count(x[j]) != 2:
        four_x = x[j]
    if y.count(y[j]) != 2:
        four_y = y[j]

print('{} {}'.format(four_x,four_y))
