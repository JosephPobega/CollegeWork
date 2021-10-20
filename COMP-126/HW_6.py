packages = float(input("Enter the number of packages purchased: "))
price = 99
if (packages <= 19) and (packages >= 10):
    print("Your discount is 20%. You will save:")
    print(price * packages * 0.20)
    print("Your discounted rate is:")
    print((price * packages) - (price * packages * 0.20))

elif (packages >= 20) and (packages <= 49):
    print("Your discount is 30%. You will save:")
    print(price * packages * 0.30)
    print("Your discounted rate is:")
    print((price * packages) - (price * packages * 0.30))
    
elif (packages >= 50) and (packages <= 99):
    print("Your discounted rate is 40%. You will save:")
    print(price * packages * 0.40)
    print("Your discounted rate is:")
    print((price * packages) - (price * packages * 0.40))

elif packages >= 100:
    print("Your discount is 50%. You will save:")
    print(price * packages * 0.50)
    print("Your discounted rate is:")
    print((price * packages) - (price * packages * 0.50))