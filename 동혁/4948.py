import sys

def min_sosu(n):
    count_sosu = 0
    min_n = int((2*n) ** 0.5)
    
    if min_n == 1:
        count_sosu = 1
    else:
        min_sosu = [True] * (min_n+1)
        min_sosu[0] = False
        min_sosu[1] = False
        for i in range(2,min_n):
            for j in range(i+i, min_n, i):
                min_sosu[j] = False
        real_sosu = list([True] * ((2*n)+1))
        for k in range(2, min_n+1):
            if min_sosu[k] == True:
                for z in range(k+k, (2*n)+1, k):
                    real_sosu[z] = False
        for q in range(n+1):
            real_sosu[q] = False

        return real_sosu.count(True)
                    




    return min_n

while_count = 0
string_n = ''
while True:
    n = sys.stdin.readline()
    
    if int(n) == 0:
        break
    else:
        string_n += n
        
n = string_n.split('\n')

for i in range(len(n)-1):
    print('{}'.format(min_sosu(int(n[i]))))


