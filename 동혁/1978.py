# 입력받을 갯수 소환
# 갯수만큼 입력 받기
# 입력받은 숫자 중에 max값 구하기
# 10밑에까지는 소수가 2 3 5 7 이다.
# 에라토스테네스의 체를 이용한다.
# 에라토스테네스의 체는 만약 120까지 구한다고 친다면 120은 11^2보다 낮으므로 11보다 낮은 소수들의 배수를 지워가면 120까지의 모든 소수를 구할 수 있다. 
# 그래서 우리가 입력받은 숫자의 max값을 구한 후 그거의 sqrt(max)는 (int(max ** 0.5)를 해주는 것과 같다.) **는 제곱의 의미. 를 해주고 그 밑의 소수들의 배수들을 제거 해준 
# 후 구해주면 된다.
# 여기서 알아야 될 문법. for문을 배수만큼 건너 뛰고 싶다면? 예를들어 for i in range(n)이 있는데 i만큼 건너 뛰고 싶다면 
# for j in range(i+i, n, i) 이 뜻은 i+i부터 i씩 건너뛰면서 n까지 간다는 얘기이다.

import sys


def func_sosu(max_num,num):
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



T = int(sys.stdin.readline())

num = [0] * T
input_string = sys.stdin.readline()
num = input_string.split()

max = 0
for i in range(len(num)):
    if int(num[i]) > max:
        max = int(num[i])

real_count = 0
n_sosu = func_sosu(max,num)
real_real_count = 0
for i in range(len(num)):
    real_count = 0
    for j in range(len(n_sosu)):
        if int(num[i]) > n_sosu[j]:
            if int(num[i]) % n_sosu[j] != 0:
                real_count += 1
        elif int(num[i]) == n_sosu[j]:
            real_real_count += 1
            break
    if real_count == len(n_sosu):
        real_real_count += 1

print(real_real_count)

