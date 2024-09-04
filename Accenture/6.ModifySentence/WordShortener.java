import java.util.Scanner;
public class WordShortener {
    public static String shortenWord(String word) {
        if (word.length() > 10) {
            return word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1);
        }
        return word;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            result.append(shortenWord(words[i]));
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        System.out.println(result.toString());
    }}
