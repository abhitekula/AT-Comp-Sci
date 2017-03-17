package bigo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class QuadraticSortLab {

		private int[] nos;
		private int steps;
		private double timer;

		// Constructs a default array of size 10
		public QuadraticSortLab() {
			nos = new int[10];
			nos[0] = -10001;
			nos[1] = 3;
			nos[2] = 7;
			nos[3] = 19;
			nos[4] = 15;
			nos[5] = 19;
			nos[6] = 7;
			nos[7] = 3;
			nos[8] = 19;
			nos[9] = -100;

		}

		public QuadraticSortLab(int[] temp) {
			nos = temp;
		}

		// Constructs an array with size random Sorts from [0,range)
		public QuadraticSortLab(int size, int range) {
			nos = new int[size];
			for(int x: nos){
				x=(int)(Math.random()+range);
			}
		}

		// Constructs an array of random Sorts [0-range) array of size count with a
		// seed
		// The seed allows you to use the same set of random numbers

		public QuadraticSortLab(int count, int range, long seed) {
			Random rand = new Random(seed);
			nos = new int[count];
			for(int x: nos){
				x=(int)(rand.nextDouble()+range);
			}
		}

		// This constructor will create an ordered array of consecutive integers
		// true will yield ascending order
		// false will yield descending order
		public QuadraticSortLab(int count, boolean ordered) {
			nos = new int[count];
			if(ordered){
				for(int x=0; x<nos.length; x++){
					nos[x]=x;
				}
			}
			else{
				for(int x=0; x<nos.length; x++){
					nos[x]=nos.length-x-1;
				}
			}
			
			
		}

		public int getSteps() {
			return steps;
		}

		public void display() {
			for (int x : nos)
				System.out.print(x + " ");
			System.out.println();
		}

		public int[] getNos() {
			return nos;
		}

		public void swap(int x, int y) {
			int temp = nos[x];
			nos[x] = nos[y];
			nos[y] = temp;
			steps += 3;
		}

		public void bubbleSort() {
			//Consecutive values are compared and swapped if necessary
			double time1,time2;
			time1=System.currentTimeMillis();
			steps = 0;
			boolean swapped = true;
			steps++;
			int lastSwap = nos.length - 1;
			steps++;
			int temp = 0;
			steps++;
			steps++; // initialize for loop
			for (int i = 0; i < nos.length; i++) {
				steps += 3; // boundary check, increment,if
				if (swapped) {
					swapped = false;
					steps++;
					steps++; // initialize for loop
					for (int j = 0; j < lastSwap; j++) {
						steps += 3; // boundary check, increment,if
						if (nos[j] > nos[j + 1]) {
							swap(j, j + 1);
							swapped = true;
							steps++;
							temp = j;
							steps++;
						}
					}
					lastSwap = temp;
					steps++;
				}

			}
			time2=System.currentTimeMillis();
			timer=time2-time1;
		}
		
		public void insertionSort(){
			insertionSort(nos);
		}
		
		public void insertionSort( int[] stuff){
			steps=0;
			  for (int i=1; i< stuff.length; ++i){
			    steps++;
				int bot=0, top=i-1;
			    while (bot<=top){
			    	steps+=2;
			      int mid=(bot+top)/2;
			      if (stuff[mid]<stuff[i])
			        bot=mid+1;
			      else top=mid-1;
			    }
			    int temp= stuff[i];
			    for (int j=i; j>bot; --j){
			    	steps++;
			      stuff[ j]= stuff[ j-1];
			    }
			    stuff[bot]=temp;
			  }
		}
		
		public void SelectionSort(){
			SelectionSort(nos);
		}
		
		public void SelectionSort(int[] arr){
	         
	        for (int i = 0; i < arr.length - 1; i++)
	        {
	            int index = i;
	            steps++;
	            for (int j = i + 1; j < arr.length; j++){
	                if (arr[j] < arr[index]){
	                    index = j;
	                    steps++;
	                }
	                //steps++;
	            }
	            int smallerNumber = arr[index]; 
	            arr[index] = arr[i];
	            arr[i] = smallerNumber;
	        }
	        nos=arr;
	    }
		
		public int[] customSort(){
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int a: nos){
				list.add(a);
			}
			int[] temp = new int[nos.length];
			int min;
			for(int x=0;x<temp.length;x++){
				min=Collections.min(list);
				min=list.indexOf(min);
				temp[x]=list.get(min);
				list.remove(min);
			}
			return temp;
		}
		
		public double timeTaken(){
			return timer;
		}

	
}
