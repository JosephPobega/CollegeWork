def space_count_itr(text):
    count = 0
    for c in text:
        if c == ' ':
            count += 1
    return count


def space_count_rec(text):
    if len(text) == 0:
        return 0
    elif text[0] == ' ':
        return 1 + space_count_rec(text[1:])
    else:
        return space_count_rec(text[1:])


def main():
    text = ''
    while text != 'quit':
        text = input("Please enter some text: ")
        print(text, space_count_itr(text))
        print(text, space_count_rec(text))

main()
