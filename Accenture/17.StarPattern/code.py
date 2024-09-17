def reverse_pyramid(rows):
    for i in range(rows):
        spaces = ' ' * i
        stars = '*' * (2 * (rows - i) - 1)
        print(spaces + stars)

rows = int(input())
reverse_pyramid(rows)
