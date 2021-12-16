#Joseph Pobega
#COMP 126


class Personal:
  def __init__(self, name, adress, age, phoneNumber):
      self.name = name
      self.adress = adress
      self.age = age
      self.phoneNumber = phoneNumber


for i in range(3):
    name = input("Name?")
    adress = input("Adress?")
    age = input("Age?")
    phoneNumber = input("Phone number?")

person = Personal(name, adress, age, phoneNumber)





#Design a class that holds the following personal information: 
# name, address, age, and phone number. Write appropriate accessor and mutator methods.
#Also design a program that creates three instances of the class. 
