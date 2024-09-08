def rotate_array(nums, k):
    n = len(nums)
    tmp = [0] * n
    for i in range(n):
        tmp[(i + k) % n] = nums[i]
    return tmp
size = int(input())
nums = list(map(int, input().split()))
k = int(input())
rotated_array = rotate_array(nums, k)
print(*rotated_array)
