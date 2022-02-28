# 1/1
# 1/2 2/1
# 3/1 2/2 1/3
# 1/4 2/3 3/2 4/1
# 5/1 4/2 3/3 2/4 1/5
# n 입력
# sum = 0
# i = 1
# 행 = 0
# 열 = 0
# while True:
# 	sum += i
# 	if sum >= n:
# 		행 = i
# 		열 = n - (sum - i) 
# 		break
# 	i += 1
# if 행 == 짝수:
#     print('{}/{}'.format(열,행-(열-1)))
# else:
#     print('{}/{}'.format(행-(열-1),열))

import sys
n = int(sys.stdin.readline())

sum = 0
i = 1
row = 0
col = 0
while True:
    sum += i
    if sum >= n:
        row = i
        col = n - (sum - i)
        break
    i += 1

if row % 2 == 0:
    print('{}/{}'.format(col,row-(col-1)))
else:  
    print('{}/{}'.format(row-(col-1),col))