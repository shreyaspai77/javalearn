
import java.util.Arrays;
import java.util.Random;

//find the ceiling of a number in a given array;
public class CeilingNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        Arrays.sort(arr);
        int Target = random.nextInt(20);
        System.out.println(Arrays.toString(arr));
        System.out.println("Target:" + Target);
        int index = CeilingNumber(arr, Target);
        System.out.println("the ceiling of the element is "+ arr[index]);
    }

    static int CeilingNumber(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2; // sometimes might give error , so better use
            // low + (low-high)/2; since if the range of l+h exceeds that of int
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {

                low = mid + 1;

            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2; //SINCE AFTER EXITING THE LOOP THE START BECOMES GREATER THAN THE END,
//             START shows THE NEXT ELEMENT Greater than
            //or equal to the answer
        }

        return low;
    }
}
