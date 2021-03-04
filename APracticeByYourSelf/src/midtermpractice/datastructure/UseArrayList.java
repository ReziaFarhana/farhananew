package midterm.datastructure;

import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
	
		List<String> fruitName = new ArrayList<String>();

		fruitName.add("Apple");
		fruitName.add("Orange");
		fruitName.add("Mango");
		fruitName.add("Banana");
		fruitName.add("Cherry");

		System.out.println("*******for each loop****");
		for (String st : fruitName) {
			System.out.println("Fruits in the basket are " + st);
		}

		System.out.println("************remove**********");
		fruitName.remove("Banana");
		fruitName.remove("Orange");
		for (String st1 : fruitName) {
			System.out.println("Fruits in the basket are now" + st1);
		}
		System.out.println("*********while Loop********");
		Iterator<String> it =fruitName.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		//ConnectToSqlDB.connectToSqlDatabase();
		ConnectToSqlDB.insertDataFromArrayListToSqlTable(fruitName,"fruits","namesOfFruits");
		try {
			ConnectToSqlDB.readDataBase("fruits","namesOfFruits");
		} catch (Exception e) {
			e.printStackTrace();
		}


	}//end of main

}



