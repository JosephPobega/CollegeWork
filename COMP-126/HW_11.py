# Joseph Pobega
#COMP 126


UserMPH = int(input("What was the speed limit?: "))
UserSpeed = int(input("Enter drivers speed: "))

while UserMPH > UserSpeed:
    print("enter data again")
    UserMPH = int(input("What was the speed limit?: "))
    UserSpeed = int(input("Enter drivers speed: "))

else:
    calc = UserMPH - UserSpeed
    print("The driver was going ", calc, " MPH Over the limit.")


