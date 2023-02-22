import java.util.Scanner;

public class maxitem {
    public static void main(String[] args) {
        // find the maximum number
        int[] list = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list[i] = in.nextInt();
        }
        System.out.println(max(list));
    }

    static int max(int[] arr) {
        int maxitem = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxitem) {
                maxitem = arr[i];
            }
        }

        return maxitem;
    }
}
