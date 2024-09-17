#include <iostream>
#include <cmath>
using namespace std;
bool checkPrime(int n) {
    if (n <= 1)
        return false;
    for (int i = 2; i <= sqrt(n); i++) {
        if (n % i == 0)
            return false;}
    return true;}
void printPrimesInRange(int a, int b) {
    if (a > 0 && b > 0 && a < b) {
        for (int num = a; num <= b; num++) {
            if (checkPrime(num)) {
                cout << num << " ";
            }}
    } else {
        cout << "Invalid input range" << endl;
    }}
int main() {
    int a, b;
    cin >> a >> b;
    printPrimesInRange(a, b);
    return 0;}
