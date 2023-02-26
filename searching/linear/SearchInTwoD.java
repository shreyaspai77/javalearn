import java.util.Arrays;
public class SearchInTwoD {
    public static void main(String[] args) {
        int[][] arr={{1,4,6,9},
            {1,5,9},
            {2,4,8,25,78},
            {1,6}};
        int[] ans = search(arr,6);

        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
    static int[] search(int[][] array,int key)
    {
        for(int row=0; row<array.length; row++)
        {
            for(int col = 0;col < array[row].length ; col++)
            {
                if (array[row][col]==key) {
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }
    //returning max in 2d array
    static int max(int[][] array)
    {
        int max=Integer.MIN_VALUE;
        for(int[] subarray : array)
        {
            for(int element: subarray)
            {
                if(element>max)
                {
                    max=element;
                }
            }
        }
        return max;
    }
}


