public class FindMin {
    public static void main(String[] args) {
        int[] arr = {48,75,86,45,36};
        System.out.println(min(arr));
    }
    static int min(int[] array)
    {
        int minimum=array[0];
        for(int i=1;i<array.length;i++)
        {
            if (array[i]<minimum) {
                minimum=array[i];
            }
        }
        return minimum;
    }
}
