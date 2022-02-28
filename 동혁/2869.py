# A , B , V = 입력.split()

# int 형변환

# for문 돌리면 시간 낭비
# 그냥 사칙연산 하면됨

# if V-A == 0 -> 무조건 하루만에 올라갈수 있다.A
# if V-A // A-B == 0 -> 전체 높이에서 A를 빼주고 계산했을때 몫이 0 이면 나머지가 있고 A만큼 하루를 더 올라가야 하니 2일이다.
# if (V-A) % (A - B)>0 -> 몫이 0이 아니면서 나머지가 0보다 크면 나머지만큼 하루를 올라가야 하고 A만큼 하루를 더 올라가야해서 2일을 더해줌.
# else -> 몫이 0이 아니면서 나머지가 0이면 A만큼 올라가는거 1일 더해주면됨.

# print(day+1)
	
import sys

A, B, V = sys.stdin.readline().split()
A = int(A)
B = int(B)
V = int(V)
if V-A == 0:
    print('1')
elif (V-A) // (A - B) == 0:
    print('2')
elif (V-A) % (A - B)>0:
    day = ((V-A) // (A - B)) + 2
    print(day)
   
else:
    day = (V-A) // (A - B) + 1
    print(day)
   

    

