#include <iostream>
#include <string>
#include <sstream>
#include <vector>
using namespace std;
int latestVersion(vector<string> &S) {
    int latest = -1; 
    for (string file : S) {
        stringstream ss(file);
        string part1, part2;
        getline(ss, part1, '_');
        getline(ss, part2);
        if (part1 == "File") {
            try {
                int version = stoi(part2);
                latest = max(latest, version);
            } catch (invalid_argument& e) {
            }}}
    return latest;
}
int main() {
    int n;
    cout << "Enter number of files: ";
    cin >> n;
    cin.ignore(); 
    vector<string> S(n);
    for (int i = 0; i < n; i++) {
        cout << "Enter file name " << i + 1 << ": ";
        getline(cin, S[i]);
    }
    int latest = latestVersion(S);
    cout << "Latest version: " << latest << endl;
    return 0;
}
