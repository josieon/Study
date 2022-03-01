# 이 문제도 1978번의 연장선 문제이다. 소인수 분해하기 위해서 첫번째로 소수인지 아닌지 파악을 해야한다.
# 소수가 아니라면 최대 범위를 sqrt(N)만큼 잡아주고 for문을 돌려서 나눴을때 나머지가 0인 경우 출력을 해주면서 전체 값을 그 값으로 나눈 값으로 업데이트 해준다.
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

N = int(sys.stdin.readline())

a = list()
N_sosu = False
a = func_sosu(N)
sosu_count = 0
for i in range(len(a)):
    sosu_count = 0
    if N > a[i]:
        if N % a[i] != 0:
            sosu_count += 1
       
    elif N == a[i]:
        N_sosu = True
        break
if sosu_count == len(a):
    N_sosu = True

        
if N_sosu == True and N != 1:
    print(N)

elif N == 1:
    pass

else:
    i = 0
    while True:
        if N % a[i] == 0:
            print(a[i])
            N = N // a[i]
            if N % a[i] != 0 and i+1 != len(a):
                i += 1
            
        elif N % a[i] != 0 and i+1 != len(a):
            i += 1
        
        elif i+1 == len(a) and N != 1:
            print('{}'.format(N))
            break
        
        elif N == 1:
            break




