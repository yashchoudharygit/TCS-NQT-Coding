#include <iostream>
#include <sstream>
#include <vector>
using namespace std;
string shorten_word(const string& word) {
    if (word.length() > 10) {
        return word[0] + to_string(word.length() - 2) + word.back();
    }
    return word;}
int main() {
    string sentence, word;
    getline(cin, sentence);

    stringstream ss(sentence);
    vector<string> words;
    while (ss >> word) {
        words.push_back(shorten_word(word));
    }
    for (size_t i = 0; i < words.size(); i++) {
        cout << words[i];
        if (i != words.size() - 1) {
            cout << " ";
        }}
    cout << endl;
    return 0;}
