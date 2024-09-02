import java.util.Arrays;
public class Main {
    public static int findDividendIndex(int[] A, int D, int Q, int R) {
        int dividend = D * Q + R;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == dividend) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] A = {15, 10, 30, 25, 50};
        int D = 5, Q = 2, R = 5;
        int result = findDividendIndex(A, D, Q, R);
        System.out.println(result); // Output: 0
    }
}
