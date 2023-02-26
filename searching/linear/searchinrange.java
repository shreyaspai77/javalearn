public class searchinrange {
    public static void main(String[] args) {
        int[]  arr= {1,5,3,43,6,42};
        System.out.println(search(arr, 1, 4, 43));        
    }
    static int search(int[] arr, int start,int end,int key) {
        // if array is null
        if (arr.length == 0) {
            return -1;
        }
        // traversing the array
        for (int i = start; i <= end; i++) {
            if (arr[i] == key) {
                return i;
            }

        }
        // if the element doesnt exist

        return -1;

    }
    
}
