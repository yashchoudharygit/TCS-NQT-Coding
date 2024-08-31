#include <iostream>
using namespace std;

int sumOfCubes(int n, int m) {
    int total_sum = 0;
    for (int i = n; i <= m; ++i) {
        total_sum += i * i * i;
    }
    return total_sum;
}

int main() {
    int n = 2, m = 4;
    cout << sumOfCubes(n, m) << endl; // Output should be 99
    return 0;
}