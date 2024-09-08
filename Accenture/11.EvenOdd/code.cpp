#include <bits/stdc++.h>
using namespace std;
void label_even_odd(int A[], int N) {
    for (int i = 0; i < N; i++) {
        if (A[i] % 2 == 0) {
            cout << "even ";
        } else {
            cout << "odd ";
        }
    }
}
int main() {
    int N;
    cin >> N;
    int A[N];
    for (int i = 0; i < N; i++) {
        cin >> A[i];
    }
    label_even_odd(A, N);
}
