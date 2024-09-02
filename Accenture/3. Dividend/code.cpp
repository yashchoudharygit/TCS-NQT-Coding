#include <iostream>
#include <vector>
using namespace std;
int findDividendIndex(vector<int>& A, int D, int Q, int R) {
    int dividend = D * Q + R;
    for (int i = 0; i < A.size(); i++) {
        if (A[i] == dividend) {
            return i;
        } }
    return -1;
}
int main() {
    vector<int> A = {15, 10, 30, 25, 50};
    int D = 5, Q = 2, R = 5;
    int result = findDividendIndex(A, D, Q, R);
    cout << result << endl; // Output: 0
    return 0;
}
