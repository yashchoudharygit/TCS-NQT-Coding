def max_candies(A, M):
    A.sort()
    count = 0
    for price in A:
        if price % 5 == 0:
            count += 1
        elif price <= M:
            count += 1
            M -= price
    return count
# Test case
A = [5, 10, 12, 15, 7, 6]
M = 20
print(max_candies(A, M))  # Output: 5
