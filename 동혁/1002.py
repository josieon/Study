import sys

n = int(sys.stdin.readline())
test = [0] * n
for i in range(n):
    x1, y1, r1, x2, y2, r2 = map(int,sys.stdin.readline().split())
    distance = ((x1-x2)**2+(y1-y2)**2)**0.5
    r_distance = r1 + r2
    if x1 == x2 and y1 == y2 and r1 == r2:
        test[i] = -1
    elif distance + r2 < r1 or distance + r1 < r2:
        test[i] = 0
    elif distance + r2 == r1 or distance + r1 == r2:
        test[i] = 1
    elif x1 == x2 and y1 == y2 and r1 != r2 or distance > r_distance:
        test[i] = 0
    elif distance == r_distance:
        test[i] = 1
    elif distance < r_distance:
        test[i] = 2
    
    
for j in range(n):
    print(test[j])

