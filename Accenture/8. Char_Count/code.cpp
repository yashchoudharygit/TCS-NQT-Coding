#include <iostream>
#include <string>
using namespace std;
int countOccurrences(const string& S, char C) {
    int count = 0;
    for (char ch : S) {
        if (ch == C) {
            count++;
        }
    }
    return count;
}
int main() {
    string S;
    int N;
    char C;
    cout << "Enter the string: ";
    cin >> S;
    cout << "Enter the length of the string: ";
    cin >> N;
    cout << "Enter the character to count: ";
    cin >> C;
    cout << countOccurrences(S, C) << endl;
    return 0;
}
