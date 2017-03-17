package recursive;

public class Sudoku3 {

	public static void main(String[] args) {
		int[][] puzzle = new int[3][3];
		puzzle=Sudokus(puzzle);
		
	}
	
	static int cr;
	static int cc;
	public static int[][]  Sudokus(int[][] arr){
		cr=arr[0].length;
		cc=arr.length;
		for(int[] x: arr){
			for(int y: x){
				y=1;
			}
		}
		return Sudokus(arr,cr,cc);
	}
	
	static int num;
	public static int[][] Sudokus(int[][]arr,int row, int col){
		boolean check=true;
		while(check){
			
		}
	}	

	public static boolean check(int arr[][]){
		boolean empty=false;
		for(int x=0;x<arr.length;x++){
			for(int y=0;y<arr[0].length;y++){
				if(arr[x][y]==0)
					empty=true;
			}
		}
		return empty;
	}
	
	public static boolean checkrow(int[] arr, int num2){
		for(int x=0;x<arr.length;x++){
			if(arr[x]==num2)
				return true;
		}
		return false;
	}
	
	public static boolean checkcol(int[][] arr, int num2, int col){
		for(int x=0;x<arr.length;x++){
			if(arr[x][col]==num2)
				return true;
		}
		return false;
	}
	
}
