package it.lessons.collection.set;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("1", 1);
		map.put("2", 2);
		map.put("3", 3);
		
		System.out.println(map);
		
		map.put("3", 33);
		System.out.println(map);
		
		Set<String> chiavi = map.keySet();
		
		System.out.println(chiavi);
		
		Collection<Integer> values = map.values();
		
		System.out.println(values);
		
		if(map.containsKey("14")) {
			System.out.println("non ricordavo di averla inserita");
		} else {
			System.out.println("Manca la chiave");
		}
		
		if(map.containsValue(14)){
			System.out.println("non ricordavo di averla inserita");
		} else {
			System.out.println("Manca il valore");
		}
		
		
		Integer integer = map.get("1");
		System.out.println(integer);
	}
}
