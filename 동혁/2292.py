# 1 (1)
# 2 3 4 5 6 7 (6)
# 8 9 10 11 12 13 14 15 16 17 18 19 (12)
# 20         37 (18)
# 38         61(24)

# 6개씩 차이남

# 6으로 나누었을때 몫이 0이면서 나머지가 1이면 1
# elif 몫이 0이거나 몫이 1이면서 나머지가 0,1까지는 2
# elif 몫이 1,2이거나 몫이 3이면서 나머지가 0,1까지는 3
# elif 몫이 3,4,5이거나 몫이 6이면서 나머지가 0,1까지는 4 
# ....
# 일단 n 입력 받음
# a = n//6을 구함
# b = n&6도 구함
# sum = 0
# max_check = 0
# i = 1
# max = 1
# while True:
# 	sum += i
# 	if sum > a:
# 		max = i+1 (최대거리)
# 	elif sum == a:
# 		max_check = i+1
# 	i += 1
# max	

# if max_check != 0 and (b == 0 or b == 1):
# 	print('{}'.format(max_check))

# else:
# 	print('{}'.format(max)) 



import sys

n = int(sys.stdin.readline())
a = n // 6
b = n % 6

sum = 0
max_check = 0
i = 1
max = 1

while True:
    sum += i
    if sum > a:
        max = i+1
        break
    elif sum == a and (b == 0 or b == 1):
        max_check = i+1
        break
    i += 1

if a == 0 and b == 1:
    print('1')

elif max_check != 0 :
	print('{}'.format(max_check))

else:
	print('{}'.format(max)) 
