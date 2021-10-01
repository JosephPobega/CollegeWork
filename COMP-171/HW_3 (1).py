meal = float(input("Enter the total for your meal:"))
TipRate = 0.15
TaxRate = 0.070
Tip = (TipRate * meal)
Tax = (TaxRate * meal)
Total = (Tip + Tax + meal)
print("Your tip is:")
print(Tip)
print("your tax is:")
print(Tax)
print("Your total is:")
print(Total)
