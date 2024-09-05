def count_occurrences(S, N, C):
    return S.count(C)
S = input("Enter the string: ")
N = int(input("Enter the length of the string: "))
C = input("Enter the character to count: ")
print(count_occurrences(S, N, C))
