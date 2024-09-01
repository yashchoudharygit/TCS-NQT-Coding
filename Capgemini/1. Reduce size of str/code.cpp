#include <iostream>
#include <unordered_map>
using namespace std;

int main() {
    string s;
    cin >> s;
    unordered_map<char, int> mp;
    for(char c : s) {
        mp[c]++;
    }
    string res = "";
    for(auto &kv : mp) {
        res += kv.first + to_string(kv.second);
    }
    cout << res << endl;
    return 0;
}
