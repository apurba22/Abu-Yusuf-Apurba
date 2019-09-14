package datastructure;

import java.util.ArrayList;
import java.util.LinkedHashMap;
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
		List<String> name = new ArrayList<>();

		name.add("Apple");
		name.add("Orange");
		name.add("Cherry");
		name.add("Mango");
		name.add("Grape");
		name.add("Watermilon");

		List<String> ls = new ArrayList<>();

		ls.add("USA");
		ls.add("UK");
		ls.add("BANGLADESH");
		ls.add("INDIA");
		ls.add("JAPAN");
		ls.add("KOREA");


		LinkedHashMap<String, List<String>> fruthsAndCountry = new LinkedHashMap<>();
		fruthsAndCountry.put("This is fruits name: ",  name);
		fruthsAndCountry.put("This is coynrtry name: ",ls);

		for (Map.Entry entry : fruthsAndCountry.entrySet()){
			System.out.println(entry.getKey()+ " "+ entry.getValue());
		}
	}
}

