def sum_of_negatives(a, b, c, d):
    numbers = [a, b, c, d]
    negative_sum = 0
    for num in numbers:
        if num < 0:
            negative_sum += num
    print(negative_sum)

a = -3
b = 7
c = -1
d = 4
sum_of_negatives(a, b, c, d)
