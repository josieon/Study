# H W N 입력

# if (N // H) == W:
# 	col = W(호수)
# else:
# 	col = (N // H) + 1 (호수)
	
# row = N % H (층) 
# if row == 0:
# 	row = H

import sys
T = int(sys.stdin.readline())
row = [0] * T
col = [0] * T
for i in range(T):
    H, W, N = sys.stdin.readline().split()
    H = int(H)
    W = int(W)
    N = int(N)
    if (N // H) == W:
        col[i] = W
    elif (N % H) == 0:
        col[i] = N//H
    else:
        col[i] = (N//H) + 1

    row[i] = N % H
    if row[i] == 0:
        row[i] = H

for j in range(T):
    print('{}'.format((row[j]*100)+(col[j])))