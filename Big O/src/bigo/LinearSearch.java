package bigo;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(lsearch(1, arr));
	}

	public static int lsearch (int val, int[] arr){
		for(int x=0;x<arr.length;x++){
			if(arr[x]==val)
				return x;
		}
		return -1;
	}
	
	
}
