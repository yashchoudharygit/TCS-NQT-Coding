import java.util.Scanner;

public class Main {
    
    public static int secondSmallest(int[] arr, int n) {
        if (n < 2) {
            return -1; 
        }

        int small = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < small) {
                secondSmallest = small;
                small = num;
            } else if (num < secondSmallest && num != small) {
                secondSmallest = num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            return -1; 
        }

        return secondSmallest;
    }

    public static int secondLargest(int[] arr, int n) {
        if (n < 2) {
            return -1; 
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        // Example array for testing
        int[] arr = {1, 2, 4, 7, 7, 5};
        int n = arr.length;

        int sS = secondSmallest(arr, n);
        int sL = secondLargest(arr, n);
        System.out.println("Second smallest is " + sS);
        System.out.println("Second largest is " + sL);
        
    }
}
