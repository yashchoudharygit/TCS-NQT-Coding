#include <iostream>

void sum_of_negatives(int a, int b, int c, int d) {
    int numbers[] = {a, b, c, d};
    int negative_sum = 0;
    for (int i = 0; i < 4; i++) {
        if (numbers[i] < 0) {
            negative_sum += numbers[i];
        }
    }
    std::cout << negative_sum << std::endl;
}

int main() {
    int a = -3, b = 7, c = -1, d = 4;
    sum_of_negatives(a, b, c, d);
    return 0;
}
