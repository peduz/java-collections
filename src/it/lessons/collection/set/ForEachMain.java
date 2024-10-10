package it.lessons.collection.set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ForEachMain {

	
	public static void main(String[] args) {
		
		Map<Integer, String> mappa = new HashMap<>();
		
		mappa.put(452321345, "Pippo");
		mappa.put(456452345, "Pluto");
		mappa.put(456532645, "Paperino");
		
		
		for(Integer chiave : mappa.keySet()) {
			System.out.println("Chiave: " + chiave + 
					" valore " + mappa.get(chiave));
		}
		
		for(String valore : mappa.values()) {
			System.out.println(valore);
		}
		
		for(Entry<Integer, String> entry : mappa.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		String [] arr = {"Giuseppe", "Marco", "Antonio", "Giovanni"};
		
		for(String nome : arr) {
			System.out.println(nome);
		}
		
		List<Integer> chiavi = new ArrayList<>();
		chiavi.add(1);
		chiavi.add(1234);
		chiavi.add(3452435);
		chiavi.add(657657);
		chiavi.add(3431);
		
		for(int i = 0; i < chiavi.size(); i++) {
			System.out.println("Chiave: " + chiavi.get(i));
		}
		
	}
}
