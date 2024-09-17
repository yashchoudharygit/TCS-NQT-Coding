#include <iostream>
using namespace std;
void reversePyramid(int rows) {
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < i; j++)
            cout << " ";
        for (int k = 0; k < 2 * (rows - i) - 1; k++)
            cout << "*";
        cout << endl;
    }
}
int main() {
    int rows;
    cout << "";
    cin >> rows;
    reversePyramid(rows);
    return 0;
}
