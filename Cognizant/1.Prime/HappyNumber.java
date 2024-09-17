import java.util.Scanner;
public class PrimeNumbers {
    public static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;}
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;}}
        return true;}
    public static void printPrimesInRange(int a, int b) {
        if (a > 0 && b > 0 && a < b) {
            for (int num = a; num <= b; num++) {
                if (checkPrime(num)) {
                    System.out.print(num + " ");
                }}
        } else {
            System.out.println("Invalid input range");}}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printPrimesInRange(a, b);
        sc.close();}}
