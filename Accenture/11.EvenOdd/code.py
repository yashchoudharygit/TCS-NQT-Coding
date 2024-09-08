def label_even_odd(A, N):
    for i in range(N):
        if A[i] % 2 == 0:
            print("even", end=" ")
        else:
            print("odd", end=" ")

N = int(input())
A = list(map(int, input().split()))
label_even_odd(A, N)
