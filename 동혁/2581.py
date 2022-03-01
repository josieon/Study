
# 1978번의 연장선 문제이다. 1978번에서 소수인지 아닌지 판별해주는 함수를 구현해놨으니 그대로 가져다 쓰되, 파라미터를 바꾸어준다. 
# M~N 까지의 수들을 판별하는 것이니 range(M,N+1)을 해주면 되고 sum과 min함수를 이용하기 위해서 list를 선언해주고 M과 N 사이의 소수들을 list안에 넣어준다.
# M과 N이 같은 경우와 M과 N이 같으면서 둘다 1일때 예외처리를 해주어야한다.




import sys


def func_sosu(max_num):
    n = int(max_num ** 0.5) 
    
    det_sosu = [True] * (n+1)
    det_nsosu = list()
    for i in range(2, n+1):
        if det_sosu[i] == True:
            for j in range(i+i, n+1, i):
                det_sosu[j] = False
    i = 0
    for k in range(2, n+1):
        if det_sosu[k] == True:
            det_nsosu.append(k)
            i += 1 
    
    return det_nsosu



M = int(sys.stdin.readline())
N = int(sys.stdin.readline())



sosu = list()

real_count = 0
n_sosu = func_sosu(N)
real_real_count = 0
for i in range(M,N+1):
    real_count = 0
    for j in range(len(n_sosu)):
        if i > n_sosu[j]:
            if i % n_sosu[j] != 0:
                real_count += 1
                
        elif i == n_sosu[j]:
            sosu.append(i)
            break
    if real_count == len(n_sosu) and i != 1:
        real_real_count += 1
        sosu.append(i)

if sum(sosu) == 0:
    print('-1')
else:
    print(sum(sosu))
    print(min(sosu))


