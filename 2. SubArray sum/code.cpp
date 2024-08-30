#include <iostream>
#include <unordered_map>
using namespace std;

int findAllSubarraysWithGivenSum(int arr[], int n, int k) {
    unordered_map<int, int> mpp;
    int preSum = 0, cnt = 0;
    mpp[0] = 1;
    for (int i = 0; i < n; i++) {
        preSum += arr[i];
        int remove = preSum - k;
        if (mpp.find(remove) != mpp.end()) cnt += mpp[remove];
        mpp[preSum]++;
    }
    return cnt;
}

int main() {
    int arr[] = {3, 1, 2, 4};
    int n = sizeof(arr) / sizeof(arr[0]);
    int k = 6;
    cout << "The number of subarrays is: " << findAllSubarraysWithGivenSum(arr, n, k) << endl;
    return 0;
}
