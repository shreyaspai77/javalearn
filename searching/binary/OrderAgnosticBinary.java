import java.util.Arrays;
import java.util.Random;

public class OrderAgnosticBinary {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        Arrays.sort(arr);
        int Target = random.nextInt(10);
        System.out.println(Arrays.toString(arr));
        System.out.println("Target:" + Target);
        int index = orderagnostic(arr, Target);
        System.out.println("the index of the element is " + index);

    }

    static int orderagnostic(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        // check the way in which it is sorted;
        boolean isAsc;
        if (nums[low] < nums[high]) {
            isAsc = true;
        } else {
            isAsc = false;
        }

        while (low <= high) {
            int mid = (low + high) / 2; // sometimes might give error , so better use
            // low + (low-high)/2; since if the range of l+h exceeds that of int
            if (nums[mid] == target) {
                return mid;

            }
            if (isAsc) {
                if (nums[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
                mid = (low + high) / 2;
            } else {
                if (nums[mid] < target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
                mid = (low + high) / 2;
            }

        }
        return -1;
    }
}
