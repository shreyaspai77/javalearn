import java.util.Arrays;
import java.util.Scanner;
public class swap {
    //create a function that swaps the indices passed through it in an array
    public static void main(String[] args) {
        int[] list = new int[5];
        Scanner in = new Scanner(System.in);
    for(int i=0;i<5;i++)
    {   
        list[i]=in.nextInt();
        
    }
    System.out.println(Arrays.toString(list));
    swap(list,0,4);
    System.out.println(Arrays.toString(list));
    }
    public static void swap(int[] arr, int index1, int index2)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
