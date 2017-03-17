package recursive;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import static java.lang.System.*;

public class Grid
{
   public String[][] grid;
   private String[][] gridcopy;
   private int count;
   private ArrayList<Integer> maxcount;
   private String[] values;
   //private int[] maxcount;
	public Grid()
	{
		grid=new String[1][1];
		maxcount = new ArrayList<Integer>();
		values= new String[1];
		//maxcount = new int[1];
	}

	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		maxcount = new ArrayList<Integer>();
		values=vals;
		//maxcount = new int[rows*cols];
		for(int a=0;a<grid.length;a++){
			for(int b=0;b<grid[a].length;b++){
				grid[a][b]=vals[(int)(Math.random()*vals.length)];
			}
		}
		for(int a=0;a<grid.length;a++){
			for(int b=0;b<grid[a].length;b++){
				System.out.print(grid[a][b] + " ");
			}
			System.out.println();
		}
	}
	
	public void setGrid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for(int a=0;a<grid.length;a++){
			for(int b=0;b<grid[a].length;b++){
				grid[a][b]=vals[(int)(Math.random()*vals.length)];
			}
		}
		for(int a=0;a<grid.length;a++){
			for(int b=0;b<grid[a].length;b++){
				System.out.print(grid[a][b] + " ");
			}
			System.out.println();
		}
	}

	public int findMax(String val)
	{
		//maxcount.add(0, 0);
		//int temp=0;
		gridcopy=copy(grid);
		count=0;
		for(int x=0;x<maxcount.size();x++){
			maxcount.remove(0);
		}
		maxcount.add(0);
		for(int r=0;r<gridcopy.length;r++){
			for(int c=0;c<gridcopy[r].length;c++){
				if(gridcopy[r][c].equals(val)){
					count=0;
					//temp=counter(val,gridcopy,r,c);
					maxcount.add(counter(val,gridcopy,r,c));
					//maxcount[r*c+r]=temp;
					//System.out.println(counter(val,gridcopy,r,c));
				}
			}
		}
		//return max(maxcount);
		return Collections.max(maxcount);
	}
	
//	private int findMaximum(String val, String[][] arr, int i, int j) {
//		
//	}

//	private int max(int[] arr) {
//		int max=arr[0];
//		for(int i : arr)
//			if(i>max)
//				max=i;
//		return max;
//	}

	private int counter(String val){
		count=0;
		return counter(val, grid, 0,0);
	}
	
	private int counter(String val, String[][] arr, int i, int j){
		if(arr[i][j].equals(val)){
			count++;
			arr[i][j]= "*";
			gridcopy[i][j]= "*";
			//return count;
			//maxcount.add(count);
		if(i<arr.length-1 && grid[i+1][j].equals(val))
			counter(val,arr,i+1,j);
		if(i>0 && grid[i-1][j].equals(val))
			counter(val,arr,i-1,j);
		if(j<arr[i].length-1 && grid[i][j+1].equals(val))
			counter(val,arr,i,j+1);
		if(j>0 && grid[i][j-1].equals(val))
			counter(val,arr,i,j-1);
		}
		return count;
	}
	
	public void findMaxs(){
		for(int x=0;x<values.length;x++){
			System.out.println(values[x] + ": " + findMax(values[x]));
		}
	}

	private static String[][] copy(String[][] arr) {
	    String[][] array = new String[arr.length][];
	    for (int i = 0; i < arr.length; i++) {
	    	array[i] = Arrays.copyOf(arr[i], arr[i].length);
	    }
	    return array;
	}

	public String toString()
	{
		String output="";
		return output;
	}
}