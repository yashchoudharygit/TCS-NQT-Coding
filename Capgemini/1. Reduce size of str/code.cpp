#include<iostream>
#include<string>
using namespace std;
int main() {
    string str;
    getline(cin, str);
    string str1 = ""; 
    int count;
    for (int i = 0; i < str.length(); i++) {
        count = 0;
        for (int j = 0; j <= i; j++) {
            if (str[i] == str[j]) {
                count++;
            }}
        if (count == 1) {
            str1 += str[i];
        }}
    for (int i = 0; i < str1.length(); i++) {
        count = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str1[i] == str[j]) {
                count++;
            } }
        if (count == 1) {
            cout << str1[i];
        } else {
            cout << str1[i] << count;}}
    return 0;
}
