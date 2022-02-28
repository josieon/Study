import sys

# 1. N을 입력 받는다.
# 2. N을 5로 나눠준 몫과 나머지를 구해준다. 
#     2-1. 만약 나머지가 0이면 답은 그냥 몫이 답이다.
#     2-2. 나머지가 0이 아니라면 그 나머지를 3으로 다시 나누어준다.
#         2-2-1. 3으로 나눈 나머지가 0이면 count에 3으로 나눈 몫만큼 더해준다.
#         2-2-2. 3으로 나눈 나머지가 0이 아니면 입력 받은 N을 3으로 나누어본다.
#             2-2-2-1. N을 3으로 나눈 나머지가 0이면 count = 3으로 나눈 몫이다.
#             2-2-2-2. 나머지가 0이 아니면 5를 한번 빼주고 나머지를 다시 3으로 나눠서 비교해본다.(for문 돌림 범위는 N을 5로 나눈 몫만큼) 그런데 N - 5가 0보다 작으면 count = -1
#                 2-2-2-2-1. 예를들어 11이면 11에서 for문을 2번을 돌리는데 처음 케이스는 11-5 = 6을 3으로 나누어봐서 나머지가 있는지 체크
#                     2-2-2-2-1-1. 나머지가 0이면 count는 i + 3으로 나눈 몫
#                 2-2-2-2-2. 다 돌렸는데 나머지가 0인 부분이 없으면 5와 3으로 나누어지지 않는 것이기 때문에 count = -1
# +++ 파이썬 반복문 범위 반대로 하려면 range(10,0,-1) 이런식으로 해야함                     
# +++ 위에서 예외처리 순서가 바뀜. 위에서 5로 나누었을때 나머지가 나오면 바로 3으로 나누어버리는데 그것보다 2-2-2-2를 먼저 검사해줘야 갯수를 최소로 줄일수 있다.

N = int(sys.stdin.readline())

quotient5 = N // 5
remainder5 = N % 5
count = 0
remainder = 0
if remainder5 != 0:
    quotient3 = remainder5 // 3
    remainder3 = remainder5 % 3
    if remainder3 == 0:
        count += quotient3 + quotient5
    elif N-5 < 0:
        if N == 3:
            count = 1
        elif N == 4:
            count = -1
    else:
        for i in range(quotient5,0,-1):
            remainder = N - 5 * i
            if remainder % 3 == 0:
                count += i + (remainder // 3)
                break
        if count == 0:
            quotient3 = N // 3
            remainder3 = N % 3
            if remainder3 == 0:
                count += quotient3
            else:
                count = -1       
else:
    count = quotient5

print('{}'.format(count))

