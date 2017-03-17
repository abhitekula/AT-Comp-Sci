package recursive;

public class Sudoku {

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
		cr=row-1;
		cc=col-1;
		num=arr[cr][cc];
		if(check(arr)){
			
			if(!(checkrow(arr[cr], num) && checkcol(arr,num,cc))){
				if(arr[cr][cc]==row)
					arr[cr][cc]=1;
				else
					arr[cr][cc]++;
				System.out.print("" + arr[cr][cc]);
				return Sudokus(arr,row,col);
			}
			else{
				if(row==arr.length && col==arr[cr].length)
					return arr;
				if(row<arr.length && col<arr[cr].length)
					return Sudokus(arr,row+1,col);
				
			}
				
		}
		else
			return arr;
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
