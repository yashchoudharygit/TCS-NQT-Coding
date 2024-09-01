#include <iostream>
#include <vector>
#include <algorithm>

void find_mid_element(std::vector<int> arr) {
    std::vector<int> filtered_arr;
    for (int num : arr) {
        if (num >= 0) {
            filtered_arr.push_back(num);
        }
    }
    int mid_index = (filtered_arr.size() - 1) / 2;
    std::cout << filtered_arr[mid_index] << std::endl;
}

int main() {
    std::vector<int> arr = {7, -3, 8, 2, -5, 10, 12};
    find_mid_element(arr);
    return 0;
}
