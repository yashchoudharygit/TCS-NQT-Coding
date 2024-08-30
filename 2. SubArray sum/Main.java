import java.util.HashMap;

public class Main {
    public static int findAllSubarraysWithGivenSum(int[] arr, int k) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int preSum = 0, cnt = 0;
        mpp.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            int remove = preSum - k;
            if (mpp.containsKey(remove)) cnt += mpp.get(remove);
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int k = 6;
        System.out.println("The number of subarrays is: " + findAllSubarraysWithGivenSum(arr, k));
    }
}
