import java.util.*;
public class Main {
    public static int latestVersion(List<String> S) {
        int latest = -1;
        for (String file : S) {
            String[] parts = file.split("_");
            if (parts.length == 2 && parts[0].equals("File") && parts[1].matches("\\d+")) {
                int version = Integer.parseInt(parts[1]);  
                latest = Math.max(latest, version);
            }
        }
        return latest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        sc.nextLine(); 
        List<String> S = Arrays.asList(sc.nextLine().split(" "));
        System.out.println("Latest version: " + latestVersion(S));  
    }
}
