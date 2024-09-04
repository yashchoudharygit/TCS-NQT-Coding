#include <iostream>
#include <cmath>
using namespace std;
bool checkPrime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i <= sqrt(n); ++i) {
        if (n % i == 0) return false;
    }
    return true;
}
int main() {
    int n;
    cout << "Enter a number: ";
    cin >> n;
    if (checkPrime(n)) {
        cout << "1" << endl;
    } else {
        cout << "0" << endl;
    }
    return 0;}
