import sys
n = int(sys.stdin.readline())
input_string = [0] * n
count_lst = list()
group_word_count = 0
check = 0
for i in range(n):
    input_string = sys.stdin.readline()
    test = list(input_string)
    unique_test = list(set(input_string))
    
    for j in unique_test:
        if len(unique_test) == len(test):
            group_word_count += 1
            break
        elif test.count(j) != 1 and test.count(j) != 0:
            debug = test[test.index(j):(test.index(j)+test.count(j))]
            debug_count = 0
            for k in range(1,len(debug)):
                if debug[0] == debug[k]:
                    debug_count += 1
                else:
                    break
            if debug_count == (len(debug)-1):
                check = 2
                continue
            else:
                check = 1
                break
            debug_count = 0
    if check == 1:
        continue
    elif check == 2:
        group_word_count += 1
    check = 0
    
        
print('{}'.format(group_word_count))
        
        
        
