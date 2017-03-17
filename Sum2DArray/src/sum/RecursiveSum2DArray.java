package sum;

import java.util.Arrays;

public class RecursiveSum2DArray {

	public static void main(String[] args) {
		int[][] array = new int[2][5];
		System.out.println(FindMax(array));
	}
	
	public static int FindMax(int[] arr){
			return FindMax(arr,arr.length);
	}
	
//	public static int FindMax(int[]arr, int c){
//		
//	}
//	
//	
//	public static int FindMax(int[][] arr){
//		//if
//	}
//	
	
	
}
