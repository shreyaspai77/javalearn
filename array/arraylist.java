import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    // when you dont know the size of the array to be used.
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);// generics used
        Scanner in = new Scanner(System.in);
        // basically the type of data that can be stored in the list object
        // not mandatory to write the type
        // eg
        // ArrayList rollnum = new ArrayList(10); also works but not recommended
        // adding to the list using the .add method
        // for (int i = 0; i < 5; i++) {
        //     list.add(i);
        // }
        // System.out.println(list);
        // System.out.println(list.contains(5));// checking for existence of 5
        //replacing an element at an index
        // list.set(0, 5);
        // System.out.println(list.contains(5));//
        // System.out.println(list);
        // taking input from user
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        System.out.println(list);
        list.set(3,4);
        System.out.println(list);
        //to get a particular element at an index i cant use [i] instead must use the get function
        System.out.println(list.get(2));
    }
}