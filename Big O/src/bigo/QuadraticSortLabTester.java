package bigo;

public class QuadraticSortLabTester {

	public static void main(String[] args) throws InterruptedException {

		QuadraticSortLab one = new QuadraticSortLab();
		QuadraticSortLab two = new QuadraticSortLab(10, true);
		QuadraticSortLab three = new QuadraticSortLab(10, false);
		//StopWatch timer = new StopWatch();
		//timer.start();
		//double onetime,twotime,threetime,temp,temp2;
		//temp=System.currentTimeMillis();
		one.bubbleSort();
		//temp2=System.currentTimeMillis();
		//onetime=temp2-temp;
		//temp=System.currentTimeMillis();
		two.bubbleSort();
		//temp2=System.currentTimeMillis();
		//twotime=temp2-temp;
		//temp=System.currentTimeMillis();
		three.bubbleSort();
		//temp2=System.currentTimeMillis();
		//threetime=temp2-temp;
		//System.out.println(temp2);
		//System.out.println(temp/1000);
		//timer.stop();
		one.display();
		two.display();
		three.display();
		System.out.println("Bubble Sort Default Array Steps:     " + one.getSteps());
		//System.out.println("Bubble Sort Default Array Time(ms): " + one.timeTaken());
		System.out.println("Bubble Sort Ascending Order Steps:     " + two.getSteps());
		//System.out.println("Bubble Sort Ascending Order Time(ms): " + two.timeTaken());
		System.out.println("Bubble Sort Descending Order Steps:     " + three.getSteps());
		//System.out.println("Bubble Sort Descending Order Time(ms): " + three.timeTaken());
		//System.out.println("Default Array time: " + timer.getElapsedTime()+ " milliseconds.");
		
		//This is a sample code for testing bubble sort  for data in  reverse order
	//QuadraticSortLab reverse = new QuadraticSortLab (100000,false);
		// timer.reset();
		// timer.start();
	//reverse.bubbleSort();
		// timer.stop();
	//reverse.display();
	// System.out.println("Reverse order Steps: " + two.getSteps());
		// System.out.println("Reverse order time: " + timer.getElapsedTime()+ "
		// milliseconds");
		// System.out.println();
		
		QuadraticSortLab four = new QuadraticSortLab();
		QuadraticSortLab five = new QuadraticSortLab(10, true);
		QuadraticSortLab six = new QuadraticSortLab(10, false);
		
		four.insertionSort();
		five.insertionSort();
		six.insertionSort();
		
		four.display();
		five.display();
		six.display();
		
		System.out.println("Insertion Sort Default Array Steps:     " + four.getSteps());
		System.out.println("Insertion Sort Ascending Order Steps:     " + five.getSteps());
		System.out.println("Insertion Sort Descending Order Steps:     " + six.getSteps());
		
		QuadraticSortLab seven = new QuadraticSortLab(10, false);
		QuadraticSortLab eight = new QuadraticSortLab(10, false);
		QuadraticSortLab nine = new QuadraticSortLab(10, false);
		
		seven.bubbleSort();
		eight.insertionSort();
		nine.SelectionSort();
		
		seven.display();
		eight.display();
		nine.display();
		
		System.out.println("Bubble Sort Ascending Array Steps:     " + seven.getSteps());
		System.out.println("Selection Sort Ascending Order Steps:     " + eight.getSteps());
		System.out.println("Insertion Sort Ascending Order Steps:     " + nine.getSteps());
		
	
		QuadraticSortLab ten = new QuadraticSortLab();
		QuadraticSortLab eleven = new QuadraticSortLab();
		QuadraticSortLab twelve = new QuadraticSortLab();
		
		ten.bubbleSort();
		eleven.insertionSort();
		twelve.SelectionSort();
		
		System.out.println(ten.getSteps());
		System.out.println(eleven.getSteps());
		System.out.println(twelve.getSteps());
		
		QuadraticSortLab thirteen = new QuadraticSortLab();
		int[] temp = thirteen.getNos();
		for(int a : temp){
			System.out.print(" " + a);
		}
		System.out.println("\n\n");
		temp = thirteen.customSort();
		for(int a : temp){
			System.out.print(" " + a);
		}
	
	}

}
