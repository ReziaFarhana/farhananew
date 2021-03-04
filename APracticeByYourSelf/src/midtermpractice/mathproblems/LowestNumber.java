package mathproblems;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */
		int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};

		System.out.println("Lowest number: " + lowestNumber(array));

		//find lowest number from the array
		Arrays.sort(array);
		int lowestNumber = array[0];
		int [] lowestValueArray = {array[0]};

		List<Integer> lowestValue = new ArrayList<Integer>();
		for (int num : lowestValueArray) {
			lowestValue.add(num);
		}
		try {
			ConnectToSqlDB.insertDataFromArrayListToSqlTableIntegers(lowestValue, "tbl_lowestNumber", "column_lowestNumber");
			ConnectToSqlDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
		for(Integer st:lowestValue){
			System.out.println(st);
		}
	}

	public static int lowestNumber (int [] array) {
		int lowestValue = 0;
		Arrays.sort(array);
		lowestValue = array[0];
		return lowestValue;
	}

}
