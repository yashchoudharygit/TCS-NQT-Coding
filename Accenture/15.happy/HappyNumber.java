import java.util.HashSet;
import java.util.Scanner;
public class HappyNumber {
    public static int sumOfSquares(int x) {
        int total = 0;
        while (x > 0) {
            int digit = x % 10;
            total += digit * digit;
            x /= 10;}
        return total;}
    public static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = sumOfSquares(n);
        }
        return n == 1;}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isHappy(n));
        scanner.close();
    }}
