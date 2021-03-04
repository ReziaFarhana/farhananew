package datastructure;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		Map<Integer, String> countryMap = new HashMap<>();
		// Storing data
		countryMap.put(1, "USA");
		countryMap.put(2, "CANADA");
		countryMap.put(3, "Bangladesh");

		// to retrieve all values use for loop
		System.out.println("*********for each loop **********");
		for (Map.Entry<Integer, String> entry : countryMap.entrySet()) {
			System.out.println(entry.getKey() + ". " + entry.getValue());
		}

		//Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		Map<String, List<String>> list = new HashMap<String, List<String>>();
		list.put("car", Arrays.asList("toyota", "bmw", "honda"));
		list.put("fruit", Arrays.asList("Apple", "Banana", "Mango"));

		//Use For Each loop and while loop with Iterator to retrieve data.
	}

}



