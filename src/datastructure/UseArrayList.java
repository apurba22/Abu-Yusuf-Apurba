package datastructure;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		ArrayList<Object> arrayList = new ArrayList<>();

		arrayList.add(25);
		arrayList.add(56);
		arrayList.add(25);
		arrayList.add(12);
		arrayList.add(10);
		arrayList.add(21);
		arrayList.add(9);
		printForEach(arrayList);

//		ConnectToSqlDB.connectToSqlDatabase() = new ConnectToSqlDB();
//
//		conn.(arrayList, "User", "Name");
//		ab.readDataBase("User","Name");
	}
	public static void printForEach(ArrayList<Object>arrayList){
		Iterator<Object> iterator  = arrayList.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		List<String> arrayList1 = new ArrayList<String>();
		try {
			connectToSqlDB.insertDataFromArrayListToSqlTable(arrayList, "arraylist", "Numbers");
			arrayList1 = connectToSqlDB.readDataBase("arraylist", "Numbers");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (arraylist) and displaying to the console");
		for(String st:arrayList1){
			System.out.println(st);
		}

	}
	}

