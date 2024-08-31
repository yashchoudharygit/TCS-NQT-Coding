
def sum_of_cubes(n, m):
    total_sum = 0
    for i in range(n, m + 1):
        total_sum += i ** 3
    return total_sum