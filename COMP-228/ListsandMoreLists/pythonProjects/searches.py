data = [2,3,5,7,11,13,17,19,23,29,31,37]

found = False
location = -1

def seq_search(target):
    global data, found, location
    found = False
    for i in range(len(data)):
        if target == data[i]:
            found = True
            location = i
            break

def bin_search(target):
    global data, found, location
    found = False
    low = 0
    high = len(data) - 1
    while high >= low:
        mid = low + high // 2
        if target == data[mid]:
            found = True
            location = mid
            break
        if target > data[mid]:
            low = mid + 1
        else:
            high = mid - 1


def main():
    user_num = int(input('Please... I will tell you prime: '))
    while user_num > 0:
        bin_search(user_num)
        if found:
            print(' (bin)PRIME index = ', location)
        else:
            print('(bin) not prime')
        seq_search(user_num)
        if found:
            print('(seq)PRIME index = ', location)
        else:
            print('(seq) not prime')
        user_num = int(input('Please... I will tell you prime: '))


main()
    
