import sys
n = int(sys.stdin.readline())
input_string = [0] * n

for i in range(n):
    input_string[i] = sys.stdin.readline()
    test = list(str(input_string))
    print('{}'.format(test))
    for j in range(len(test)):
        test_test = set(test)
        print('{}'.format(test_test))