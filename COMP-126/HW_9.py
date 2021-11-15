# Joseph Pobega
#COMP 126


scores = []

for i in range(5):
    question = float(input("Enter a score:"))
    scores.append(question)

def student1():
    if scores[0] < 60:
        lettergrade = ("F")
        print("student1 got a ", lettergrade)
    elif scores[0] < 70:
        lettergrade = ("D")
        print("student1 got a ", lettergrade)
    elif scores[0] < 80:
        lettergrade = ("C")
        print("student1 got a ", lettergrade)
    elif scores[0] < 90:
        lettergrade = ("B")
        print("student1 got a ", lettergrade)
    else:
        lettergrade = ("A")
        print("student1 got a ", lettergrade)

def student2():
    if scores[1] < 60:
        lettergrade = ("F")
        print("student2 got a ", lettergrade)
    elif scores[1] < 70:
        lettergrade = ("D")
        print("student2 got a ", lettergrade)
    elif scores[1] < 80:
        lettergrade = ("C")
        print("student2 got a ", lettergrade)
    elif scores[1] < 90:
        lettergrade = ("B")
        print("student2 got a ", lettergrade)
    else:
        lettergrade = ("A")
        print("student2 got a ", lettergrade)

def student3():
    if scores[2] < 60:
        lettergrade = ("F")
        print("student3 got a ", lettergrade)
    elif scores[2] < 70:
        lettergrade = ("D")
        print("student3 got a ", lettergrade)
    elif scores[2] < 80:
        lettergrade = ("C")
        print("student3 got a ", lettergrade)
    elif scores[2] < 90:
        lettergrade = ("B")
        print("student3 got a ", lettergrade)
    else:
        lettergrade = ("A")
        print("student3 got a ", lettergrade)


def student4():
    if scores[3] < 60:
        lettergrade = ("F")
        print("student4 got a ", lettergrade)
    elif scores[3] < 70:
        lettergrade = ("D")
        print("student4 got a ", lettergrade)
    elif scores[3] < 80:
        lettergrade = ("C")
        print("student4 got a ", lettergrade)
    elif scores[3] < 90:
        lettergrade = ("B")
        print("student4 got a ", lettergrade)
    else:
        lettergrade = ("A")
        print("student4 got a ", lettergrade)


def student5():
    if scores[4] < 60:
        lettergrade = ("F")
        print("student5 got a ", lettergrade)
    elif scores[4] < 70:
        lettergrade = ("D")
        print("student5 got a ", lettergrade)
    elif scores[4] < 80:
        lettergrade = ("C")
        print("student5 got a ", lettergrade)
    elif scores[4] < 90:
        lettergrade = ("B")
        print("student5 got a ", lettergrade)
    else:
        lettergrade = ("A")
        print("student5 got a ", lettergrade)


def output():
    average = ((scores[0] + scores[1] + scores[2] + scores[3] + scores[4]) / 5)
    if average < 60:
        lettergrade = ("F")
        print("class letter average is", lettergrade)
    elif average < 70:
        lettergrade = ("D")
        print("class letter average is", lettergrade)
    elif average < 80:
        lettergrade = ("C")
        print("class letter average is", lettergrade)
    elif average < 90:
        lettergrade = ("B")
        print("class letter average is", lettergrade)
    else:
        lettergrade = ("A")
        print("class letter average is", lettergrade)
    print("The class number average is ", average)


student1()
student2()
student3()
student4()
student5()
output()


# Design a program that asks the user to enter five test scores. 
# The program shall display a letter grade for each of the five 
# test scores and a letter grade for the average test score. 
# Include the following functions in this program: