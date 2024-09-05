import java.util.Scanner;
public class LatestVersion {
    public static int latestVersion(String[] S) {
        int latest = -1;  
        for (String file : S) {
            String[] parts = file.split("_");
            if (parts.length == 2 && parts[0].equals("File")) {
                try {
                    int version = Integer.parseInt(parts[1]);
                    latest = Math.max(latest, version); 
                } catch (NumberFormatException e) {
                }}}
        return latest;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of files: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        String[] S = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter file name " + (i+1) + ": ");
            S[i] = scanner.nextLine();
        }
        int latest = latestVersion(S);
        System.out.println("Latest version: " + latest);
    }
}
