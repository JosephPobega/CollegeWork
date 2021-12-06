#Joseph Pobega
#COMP 126


sales = []
question = int(input("How many days? "))
print("Enter sales")

for i in range(question):
    numbers = int(input())
    sales.append(numbers)

print("Average daily sales are: ")
print( sum(sales) / question)
print("Your total sales are:")
print(sum(sales))

    

