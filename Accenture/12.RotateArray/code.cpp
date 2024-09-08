#include <iostream>
#include <vector>
using namespace std;
void rotate(vector<int>& nums, int k) {
    int n = nums.size();
    vector<int> tmp(n);
    for(int i = 0; i < n; i++)
        tmp[(i + k) % n] = nums[i];
    nums = tmp;
}
int main() {
    int size, k;
    cin >> size;
    vector<int> nums(size);
    for(int i = 0; i < size; i++) {
        cin >> nums[i];
    }
    cin >> k;
    rotate(nums, k);
    for(int i = 0; i < size; i++) {
        cout << nums[i] << " ";
    }
}
