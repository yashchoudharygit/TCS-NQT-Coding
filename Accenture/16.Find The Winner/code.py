class Solution:
    def findTheWinner(self, n: int, k: int) -> int:
        arr = [i for i in range(1, n + 1)]
        i = 0 
        while len(arr) > 1:
            idx = (i + k - 1) % len(arr)
            arr.pop(idx)
            i = idx
        return arr[0]
