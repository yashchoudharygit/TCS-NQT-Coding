def checkPrime(n):
    if n <= 1:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True
def print_primes_in_range(a, b):
    if a > 0 and b > 0 and a < b: 
        for num in range(a, b + 1):
            if checkPrime(num):
                print(num, end=' ')
a = int(input())
b = int(input())
print_primes_in_range(a, b)
