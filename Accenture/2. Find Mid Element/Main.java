import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void findMidElement(int[] arr) {
        List<Integer> filteredArr = new ArrayList<>();
        for (int num : arr) {
            if (num >= 0) {
                filteredArr.add(num);
            }
        }
        int midIndex = (filteredArr.size() - 1) / 2;
        System.out.println(filteredArr.get(midIndex));
    }

    public static void main(String[] args) {
        int[] arr = {7, -3, 8, 2, -5, 10, 12};
        findMidElement(arr);
    }
}
