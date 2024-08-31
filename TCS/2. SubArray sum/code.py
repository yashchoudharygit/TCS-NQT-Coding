def findAllSubarraysWithGivenSum(arr, k):
    n = len(arr)
    mpp = {}
    preSum = 0
    cnt = 0
    mpp[0] = 1
    for i in range(n):
        preSum += arr[i]
        remove = preSum - k
        if remove in mpp:
            cnt += mpp[remove]
        if preSum in mpp:
            mpp[preSum] += 1
        else:
            mpp[preSum] = 1
    return cnt

arr = [3, 1, 2, 4]
k = 6
print("The number of subarrays is:", findAllSubarraysWithGivenSum(arr, k))
