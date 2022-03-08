import sys
x = []
y = []
z = []

while True:
    a, b, c = sys.stdin.readline().split()
    
    if int(a) == 0 :
        break

    x.append(int(a))
    y.append(int(b))
    z.append(int(c))


for i in range(len(x)):
    sort_xyz = []
    sort_xyz.append(x[i])
    sort_xyz.append(y[i])
    sort_xyz.append(z[i])
    sort_xyz.sort()
    if (sort_xyz[0] ** 2) + (sort_xyz[1] ** 2) == (sort_xyz[2] ** 2):
        print('right')
    else:
        print('wrong')