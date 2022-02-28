# 파이썬 2차원 배열 초기화 
# 예를 들어서 M x N 배열이라고 한다면 
# 초기화를 member = [[0]*N for _ in range(M)]
# 초기값으로 0층 1호부터 내가 입력받은 호수 까지 1,2,3,4....를 넣어준다. 14호까지 다 넣어줄 필요 없음. 어차피 계산은 내가 입력한 호수까지만 더해줄것이기 때문에
# 그리고 3중 포문을 쓰는데 1중은 층수만큼, 2중은 호수만큼, 3중은 2중에서 접근한 호수가 3이라면 3중에서 1부터 3까지 전 층의 호수들을 다 더해주는 작업.
# 이렇게 한다면 내가 입력한 층수의 호수까지 값이 다 채워진다.

import sys

T = int(sys.stdin.readline())
k = 0
n = 0
count = [0] * T
for i in range(T):
    k = int(sys.stdin.readline())
    n = int(sys.stdin.readline())
    member = [[0]*(n+1) for _ in range((k+1))]
    
    for q in range(1,n+1):
        member[0][q] = q
    for j in range(1,k+1):
        for z in range(1,n+1):
            for b in range(1,z+1):
                member[j][z] += member[j-1][b]
    count[i] = member[k][n]            

for w in range(T):
    print('{}'.format(count[w]))

