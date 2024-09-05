import java.util.Scanner;
public class CharacterCount {
    public static int countOccurrences(String S, char C) {
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String S = sc.nextLine();
        System.out.println("Enter the length of the string: ");
        int N = sc.nextInt();
        System.out.println("Enter the character to count: ");
        char C = sc.next().charAt(0);
        System.out.println(countOccurrences(S, C));
    }
}
