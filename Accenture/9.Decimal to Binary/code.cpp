#include <iostream>
using namespace std;

int covBinary_sum(int n) {
    int sum = 0;
    while (n > 0) {
        int binary = n % 2;
        sum += binary;      
        n /= 2;              
    }
    return sum;
}
int main() {
    int n;
    cin >> n;
    
    int sumOfDigit = covBinary_sum(n);
    cout << sumOfDigit << endl;
    return 0;
}
