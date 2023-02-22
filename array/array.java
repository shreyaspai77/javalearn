import java.util.*;
public class array {
    public static void main(String[] args) {
        //creating an array
        Scanner in = new Scanner(System.in);
        int[] rollnum = new int[5];
        System.out.println("enter the rollnumbers");
        for(int i=0;i<rollnum.length;i++)
        {
            rollnum[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(rollnum));
    }
}
