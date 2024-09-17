import java.util.Scanner;
public class ReversePyramidPattern {
    public static void reversePyramid(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (rows - i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("");
        int rows = sc.nextInt();
        reversePyramid(rows);
        sc.close();
    }
}
