import java.util.Scanner;
public class RemoveInnerVowels {
    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    public static String removeInnerVowels(String s) {
        StringBuilder modifiedStr = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (isVowel(currentChar)) {
                if (i > 0 && i < s.length() - 1 && !isVowel(s.charAt(i - 1)) && !isVowel(s.charAt(i + 1))) {
                    continue;  // Skip vowel surrounded by consonants
                }}
            modifiedStr.append(currentChar);
        }
        return modifiedStr.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        String outputStr = removeInnerVowels(inputStr);
        System.out.println(outputStr);
        scanner.close();}}
