import java.util.Scanner;
public class Main {
    public static void labelEvenOdd(int[] A, int N) {
        for (int i = 0; i < N; i++) {
            if (A[i] % 2 == 0) {
                System.out.print("even ");
            } else {
                System.out.print("odd ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        labelEvenOdd(A, N);
    }
}
