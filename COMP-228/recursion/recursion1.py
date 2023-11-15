def space_count_itr(text):
    count = 0
    for c in text:
        if c == ' ':
            count += 1
    return count


def space_count_rec(text):
    return -999


def main():
    text = ''
    while text != 'quit':
        text = input("Please enter some text: ")
        print(text, space_count_itr(text))
        print(text, space_count_rec(text))

main()
