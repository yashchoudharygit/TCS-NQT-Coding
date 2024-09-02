public class Main {
    public static int maxCandies(int[] A, int M) {
        int count = 0;
        for (int price : A) {
            if (price % 5 == 0) {
                count++;
            } else if (price <= M) {
                count++;
                M -= price;
            } else {
                break;
            }}
        return count;
    }
    public static void main(String[] args) {
        int[] A = {5, 10, 12, 15, 7, 6};
        int M = 20;
        System.out.println(maxCandies(A, M));  // Output: 4
    }}
