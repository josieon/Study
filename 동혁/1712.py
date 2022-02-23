import sys

n = list(sys.stdin.readline().split())
x = 1
n0 = int(n[0])
n1 = int(n[1])
n2 = int(n[2])

if n1-n2 >= 0:
    print('-1')
   
else:
    a = -n0//(n1-n2)
    print('{}'.format(a+1))
    

