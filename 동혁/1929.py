# 2581번 문제랑 완전 똑같다고 생각하면 된다.ㅋ




import sys


def func_sosu(max_num):
    n = int(max_num ** 0.5)   
    det_sosu = [True] * (max_num + 1)
    for i in range(2, n+1):
        if det_sosu[i] == True:
            for j in range(i+i, max_num+1, i):
                det_sosu[j] = False
    
    
    return det_sosu



M, N =map(int, sys.stdin.readline().split())




n_sosu = func_sosu(N)


for i in range(M, N+1):
    if (n_sosu[i] == True) and i != 0 and i!= 1:
        print('{}'.format(i))
