import java.util.Scanner;
public class PrimeCheck {
    public static boolean checkPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        if (checkPrime(n)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        scanner.close();
    }
}
