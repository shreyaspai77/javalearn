import java.util.*;

public class multiarray {
	public static void main(String[] args) {
		/*
		 * want to create an array to look like this
		 * 1 2 3
		 * 4 5 6
		 * 7 8 9
		 */
		Scanner in = new Scanner(System.in);
		int[][] arr = new int[3][3];
		// 2d arrays are basically an array containing arrays]
		/*
		 * example
		 * { {1,2,3}
		 * {4,5,6}
		 * {7,8,9}
		 * }
		 * rows mandatory but not the columns
		 */
		// taking an input
		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = in.nextInt();
			}
		}
		// printing
		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col]);

			}
			System.out.println();
		}
		// using .tostrings()
		for (int row = 0; row < arr.length; row++) {
			System.out.println(Arrays.toString(arr[row]));
		}
	
	// better for loop
	for (int[] each : arr) {
		System.out.println(Arrays.toString(each));
		
	}
	}
}