#include <iostream>
#include <vector>
using namespace std;
int maxCandies(vector<int>& A, int M) {
    int count = 0;
    for (int price : A) {
        if (price % 5 == 0) {
            count++;
        } else if (price <= M) {
            count++;
            M -= price;
        } else {
            break;
        } }
    return count;
}
int main() {
    vector<int> A = {5, 10, 12, 15, 7, 6};
    int M = 20;
    cout << maxCandies(A, M) << endl;  // Output: 4
    return 0;
}
