package bigo;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(binsearch(1, arr));
	}
	
	public static int binsearch(int val, int[] arr){
		int first=0, last=arr.length, mid=last/2, index=-1;
		while(first<last){
			if(arr[mid]==val){
				index=mid;
				break;
			}
			else if(val<arr[mid])
				last=mid-1;
			else
				first=mid+1;
			mid=(first+last)/2;
		}
		return index;
	}

}
