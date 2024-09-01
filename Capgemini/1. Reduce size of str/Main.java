import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Character, Integer> mp = new HashMap<>();

        for(char c : s.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        StringBuilder res = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : mp.entrySet()) {
            res.append(entry.getKey()).append(entry.getValue());
        }

        System.out.println(res.toString());
    }
}
