#include <bits/stdc++.h>
using namespace std;
bool isNumber(string& s) {
    for (char c : s) {
        if (!isdigit(c)) return false;}
    return true;}
int latestVersion(vector<string>& S) {
    int latest = -1;
    for (auto& file : S) {
        int underscorePos = file.find('_');
        if (underscorePos != string::npos) { 
            string part1 = file.substr(0, underscorePos);
            string part2 = file.substr(underscorePos + 1);

            if (part1 == "File" && isNumber(part2)) { 
                int version = stoi(part2); 
                latest = max(latest, version); }}}
    return latest;}
int main() {
    int n;
    cin >> n;
    vector<string> S(n);
    for (int i = 0; i < n; i++) {
        cin >> S[i];}
    int latest = latestVersion(S);
    cout << "Latest version: " << latest << endl;
    return 0;}
