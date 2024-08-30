public class code {
    public static int sumOfCubes(int n, int m) {
        int totalSum = 0;
        for (int i = n; i <= m; i++) {
            totalSum += i * i * i;
        }
        return totalSum;
    }

    public static void main(String[] args) {
        int n = 2, m = 4;
        System.out.println(sumOfCubes(n, m)); // Output should be 99
    }
}