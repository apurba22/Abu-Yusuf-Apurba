package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;

/*
 *Created by mrahman on 04/02/2018.
 */
public class Numbers {



	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */

	public static void main(String[] args) throws Exception {
		
		int [] num = new int[1000000];
		storeRandomNumbers(num);
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
        printValue(numbers);
		int n = num.length;
		randomize (num, n);

		//Insertion Sort
		for(String st:numbers){
			System.out.println(st);
		}
		int n8 = num.length;
		randomize (num, n8);


		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");

		connectToSqlDB.insertDataFromArrayToSqlTable(num, "insertion_sort", "SortingNumbers");
		List<String> numbers1 = connectToSqlDB.readDataBase("insertion_sort", "SortingNumbers");

		for(String st:numbers1) {
			System.out.println(st);
		}
		int n1 = num.length;
		randomize(num,n1);

		//bubble sort
		algo.insertionSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + bubbleSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "bubble_sort", "SortingNumbers");
		List<String> numbers2 = connectToSqlDB.readDataBase("bubble_sort", "SortingNumbers");

		for(String st:numbers2) {
			System.out.println(st);
		}
		int n2 = num.length;
		randomize(num,n2 );

		//merge sort
		algo.insertionSort(num);
		long mergeSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + mergeSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "merge_sort", "SortingNumbers");
		List<String> numbers3 = connectToSqlDB.readDataBase("merge_sort", "SortingNumbers");

		for(String st:numbers3) {
			System.out.println(st);
		}
		int n3 = num.length;
		randomize(num,n3);

		// quick short
		algo.insertionSort(num);
		long quickSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + quickSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "quick_sort", "SortingNumbers");
		List<String> numbers4 = connectToSqlDB.readDataBase("quick_sort", "SortingNumbers");

		for(String st:numbers4) {
			System.out.println(st);
		}
		int n4 = num.length;
		randomize(num,n4);
		//heap sort
		algo.insertionSort(num);
		long heapSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + heapSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "heap_sort", "SortingNumbers");

		for(String st:numbers) {
			System.out.println(st);
		}
		int n5 = num.length;
		randomize(num,n5);
		//bucket sort
		algo.insertionSort(num);
		long bucketSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + bucketSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "bucket_sort", "SortingNumbers");
		List<String> numbers6= connectToSqlDB.readDataBase("bucket_sort", "SortingNumbers");

		for(String st:numbers6) {
			System.out.println(st);
		}
		int n6 = num.length;
		randomize(num,n6);
//shell sort

		algo.insertionSort(num);
		long shellSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + shellSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "shell_sort", "SortingNumbers");
		List<String> numbers7 = connectToSqlDB.readDataBase("shell_sort", "SortingNumbers");

		for(String st:numbers7) {
			System.out.println(st);
		}
		int n7 = num.length;
		randomize(num,n7);

	//By following above, Continue for rest of the Sorting Algorithm....


		//Come to conclusion about which Sorting Algo is better in given data set.

	}

	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(1000000);
		}
	}

	public static void randomize( int arr[], int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.println(st);
		}
	}
}
