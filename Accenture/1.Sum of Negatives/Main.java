public class Main {
    public static void sumOfNegatives(int a, int b, int c, int d) {
        int[] numbers = {a, b, c, d};
        int negativeSum = 0;
        for (int num : numbers) {
            if (num < 0) {
                negativeSum += num;
            }
        }
        System.out.println(negativeSum);
    }

    public static void main(String[] args) {
        int a = -3, b = 7, c = -1, d = 4;
        sumOfNegatives(a, b, c, d);
    }
}
