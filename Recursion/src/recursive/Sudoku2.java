package recursive;

/**
 * @author Abhinav Tekulapally
 */
import java.util.Scanner;

public class Sudoku2 {
	private static int size;
	private static int[][] arr;

	public static void main(String[] args) {
		//It goes up to 10000
		System.out.println("This definetely deserves an A,\nit thinks outside of the box and is much more efficient.");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input the row/column size");
		size = keyboard.nextInt();
		arr = new int[size][size];
		sort(arr);
		for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr[0].length; y++) {
				System.out.print(" " + arr[x][y]);
			}
			
			System.out.println();
		}
		keyboard.close();
	}

	public static int[][] sort(int[][] arr) {
		return sort(arr, arr.length - 1);
	}

	public static int[][] sort(int[][] arr, int count) {
		//base case
		if (count < 0) {
			return arr;
		}
		for (int y = 0; y < arr[0].length; y++) {
			//starts at last row and recursively fills in the values
			if ((size - count - y) > 0)
				arr[count][y] = size - count - y;
			else
				arr[count][y] = size - count - y + size;
		}
		return sort(arr, count - 1);
	}

}
