#include <iostream>
#include <unordered_set>
int sum_of_squares(int x) {
    int total = 0;
    while (x > 0) {
        int digit = x % 10;
        total += digit * digit;
        x /= 10;
    }
    return total;
}
bool is_happy(int n) {
    std::unordered_set<int> seen;
    while (n != 1 && seen.find(n) == seen.end()) {
        seen.insert(n);
        n = sum_of_squares(n);
    }
    return n == 1;
}
int main() {
    int n;
    std::cin >> n;
    std::cout << (is_happy(n) ? "true" : "false") << std::endl;
    return 0;
}
