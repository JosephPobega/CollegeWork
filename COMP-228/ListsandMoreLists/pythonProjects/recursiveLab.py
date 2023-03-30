#Joseph Pobega
#3/30/23
#COMP228

import random



def fact_iterative(n):
    result = 1
    for factor in range(1, n+1):
        result = result + factor
    return result

def fact_recursive():
    return 777

def main():
    n = int(input("Enter a number between 1 and 30: "))
    n_bang = fact_iterative(n)
    print('Iterative: ' + str(n) + '! = ' + str(n_bang))
    n_bang = fact_recursive(n)
    print("Recursive: " + str(n) + '! = ' + str(n_bang))
                  
main()
