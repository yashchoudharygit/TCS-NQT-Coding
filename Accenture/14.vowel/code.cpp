#include <iostream>
#include <string>
bool is_vowel(char c) {
    std::string vowels = "aeiouAEIOU";
    return vowels.find(c) != std::string::npos;}
std::string remove_inner_vowels(const std::string &s) {
    std::string modified_str = "";
    
    for (size_t i = 0; i < s.length(); i++) {
        if (is_vowel(s[i])) {
            if (i > 0 && i < s.length() - 1 && !is_vowel(s[i - 1]) && !is_vowel(s[i + 1])) {
                continue;  // Skip vowel surrounded by consonants
            }}
        modified_str += s[i];}
    return modified_str;}
int main() {
    std::string input_str;
    std::getline(std::cin, input_str);
    
    std::string output_str = remove_inner_vowels(input_str);
    std::cout << output_str << std::endl;
    return 0;
}
