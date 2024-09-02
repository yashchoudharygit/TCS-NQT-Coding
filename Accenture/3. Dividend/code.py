def find_dividend_index(A, D, Q, R):
    dividend = D * Q + R
    if dividend in A:
        return A.index(dividend) 
    else:
        return -1 

# Test case
A = [15, 10, 30, 25, 50]
D = 5
Q = 2
R = 5
print(find_dividend_index(A, D, Q, R))  # Output: 0
