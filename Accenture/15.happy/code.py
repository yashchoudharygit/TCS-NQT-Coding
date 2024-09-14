def is_happy(n):
    def sum_of_squares(x):
        total = 0
        while x > 0:
            digit = x % 10
            total += digit * digit
            x //= 10
        return total
    seen = set()
    while n != 1 and n not in seen:
        seen.add(n)
        n = sum_of_squares(n)
    return n == 1
n = int(input())
print(is_happy(n))
