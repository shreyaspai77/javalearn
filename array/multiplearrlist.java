import java.util.ArrayList;
import java.util.Scanner;

public class multiplearrlist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        //first create an arraylist with say 3 empty arraylists before adding
        for (int i = 0; i < 3; i++) {
            matrix.add(new ArrayList<>());
        }
        //enter the values 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix.get(i).add(in.nextInt());
            }
        }
        //printing
        System.out.println(matrix);
    }
}
