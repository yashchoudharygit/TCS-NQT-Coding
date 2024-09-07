import java.util.Scanner;

public class Main {
    public static int covBinary_sum(int n) {
        int sum = 0;
        
        while (n > 0) {
            int binary = n % 2;
            sum += binary; 
            n /= 2;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sumOfDigit = covBinary_sum(n);
        System.out.println("Sum of Binary Digits: " + sumOfDigit);
        
        scanner.close();
    }
}
