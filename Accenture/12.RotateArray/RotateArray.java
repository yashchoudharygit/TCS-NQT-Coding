import java.util.Scanner;
public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] tmp = new int[n];
        for (int i = 0; i < n; i++) {
            tmp[(i + k) % n] = nums[i];
        }
        System.arraycopy(tmp, 0, nums, 0, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotate(nums, k);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
