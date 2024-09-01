def find_mid_element(arr):
    filtered_arr = [num for num in arr if num >= 0]
    mid_index = (len(filtered_arr) - 1) // 2
    print(filtered_arr[mid_index])

arr = [7, -3, 8, 2, -5, 10, 12]
find_mid_element(arr)
