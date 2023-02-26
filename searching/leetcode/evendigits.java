public class evendigits {
    public static void main(String[] args) {
        int[] nums = { 1, 45, 678, 9087 };
        System.out.println(FindNumbers(nums));

    }

    static int FindNumbers(int[] num) {
        int count = 0;

        // find number of elements that have even number of digits
        // traverse
        for (int each : num) {

            if (evencheck(digitcounter(each))) {
                count++;
            }
        }

        return count;
    }

    static int digitcounter(int num) {
        int digitcount = 0;

        if (num == 0) {
            return 1;
        }
        if (num < 0) {
            num = num * -1;
        }
        while (num > 0) {
            digitcount++;
            num = num / 10;
        }
        return digitcount;
    }

    static boolean evencheck(int digitcount) {
        return digitcount % 2 == 0;
        // can even include if statements
    }
}