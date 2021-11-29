even_numbers = [2,4,6,8,10]
names = ['Andrew','Joe','Brandon']
even_numbers[1] = 12
names[2] = 'liam'

numbers = [ [1,2,3], [10,20,30] ]
rows = 2
cols = 3
row = 0

while row < rows:
    col = 0
    while col < cols:
        print(numbers[row][col])
        col=col+1
    row = row + 1

size = len(names)
size2 = len(even_numbers)

index = 0

while index < size2:
    print(even_numbers[index])
    index = index+1

for name in names:
    print(name)

def set_to_zero(numbers):
    index = 0
    while index < len(numbers):
        numbers[index] = 0
        index = index+1
        set_to_zero(even_numbers(index))
        index+1