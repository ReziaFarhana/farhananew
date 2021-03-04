package midterm.datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

	public static void main(String[] args) throws FileNotFoundException {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */
		DataReader.readData();
	}

	public static void readData() throws FileNotFoundException {
		FileReader fileReader=null;
		BufferedReader bufferedReader =null;

		//String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
		String textFile ="../MidTerm_WeekendAfternoon_Selenium_NY_Fall2020/src/data/self-driving-car";

		try {
			fileReader = new FileReader(textFile);
			bufferedReader = new BufferedReader(fileReader);
			String data;

			while ((data = bufferedReader.readLine()) != null) {
				System.out.println(data);
			}
		} catch (FileNotFoundException e){
			System.out.println("File not found exception");

		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				fileReader.close();
				bufferedReader.close();
			} catch (Exception e){
				System.out.println("File Already closed");

				//Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
				//After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
				//		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
				//		 * order from LinkedList and retrieve as FILO order from Stack.
				//		 *
				//		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
				//		 * Use For Each loop/while loop/Iterator to retrieve data.


			}
		}
	}

}
