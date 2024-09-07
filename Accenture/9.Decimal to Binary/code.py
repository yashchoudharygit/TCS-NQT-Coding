def covBinary_sum(n):
    sum = 0
    while n > 0:
        binary = n % 2
        sum += binary
        n //= 2
    return sum

n = int(input())
sumOfDigit = covBinary_sum(n)
print(sumOfDigit)



