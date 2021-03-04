package midterm.datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
//		Map<Integer, String> countryMap = new HashMap<>();
//		// Storing data
//		countryMap.put(1, "USA");
//		countryMap.put(2, "CANADA");
//		countryMap.put(3, "Bangladesh");
//
//		// to retrieve all values use for loop
//		System.out.println("*********for each loop **********");
//		for (Map.Entry<Integer, String> entry : countryMap.entrySet()) {
//			System.out.println(entry.getKey() + ". " + entry.getValue());
//		}
//
//		//Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
//		Map<String, List<String>> list = new HashMap<String, List<String>>();
//		list.put("car", Arrays.asList("toyota", "bmw", "honda"));
//		list.put("fruit", Arrays.asList("Apple", "Banana", "Mango"));
//
//		//Use For Each loop and while loop with Iterator to retrieve data.

		Map<Integer, String> map = new HashMap<Integer, String>();


		map.put(1, "New york");
		map.put(2, "Virginia");
		map.put(3, "Florida");
		map.put(4, "California");
		map.put(5, "Indiana");

		//to retrieve values
		for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + " ---> " + entry.getValue());
		}

		List<String> cityOfUSA = new ArrayList<>();

		cityOfUSA.add("New Jersey");
		cityOfUSA.add("Maryland");
		cityOfUSA.add("Boston");

		List<String> cityOfBangladesh = new ArrayList<>();

		cityOfBangladesh.add("Dhahk");
		cityOfBangladesh.add("Rajshahi");
		cityOfBangladesh.add("Chittagong");

		Map<Integer, List<String>> map2 = new LinkedHashMap<>();

		map2.put(1, cityOfUSA);
		map2.put(2, cityOfBangladesh);

		//to retrieve values
		for (Map.Entry<Integer, List<String>> city : map2.entrySet()) {
			System.out.println(city.getKey() + "  ==>" + city.getValue());
		}

		System.out.println("************************");
		System.out.println(map.get(3));

		map.remove(2);
		System.out.println(map);

		System.out.println(map.containsKey(1));

		System.out.println(map.containsValue("Indiana"));

		System.out.println(map.isEmpty());

		System.out.println(map.keySet());

		//to retrieve keys
		for (Object i : map.keySet()) {
			System.out.println(i);
		}

		//to retrieve values
		for (Object i : map.values()) {
			System.out.println(i);
		}

		for (Object i : map.keySet()) {
			System.out.println(i + "     " + map.get(i));
		}

		Set s = map.entrySet();

		//to retrieve values use Iterator with while loop
		Iterator itr = s.iterator();

		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + "      " + entry.getValue());
		}
	}

	}






