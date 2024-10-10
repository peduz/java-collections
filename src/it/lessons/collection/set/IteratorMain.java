package it.lessons.collection.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IteratorMain {

	public static void main(String[] args) {
		
		Set<String> mySet = new HashSet<>();
		mySet.add("Pippo");
		mySet.add("Pluto");
		mySet.add("Paperino");
		
		Iterator<String> iterator = mySet.iterator();
		
		while(iterator.hasNext()) {
			String item = iterator.next();
			System.out.println(item);
		}
		
		
		Map<Integer, String> mappa = new HashMap<>();
		
		mappa.put(1, "Giuseppe");
		mappa.put(2, "Marco");
		mappa.put(3, "Antonio");
		
		Iterator<Integer> chiavi = mappa.keySet().iterator();
		while(chiavi.hasNext()) {
			Integer chiave = chiavi.next();
			System.out.println("chiave " + chiave + 
					" valore " + mappa.get(chiave));
		}
		
		
		Iterator<String> valori = mappa.values().iterator();
		while(valori.hasNext()) {
			System.out.println(valori.next());
		}
		
		
		Iterator<Entry<Integer, String>> entries = mappa.entrySet().iterator();
		
		while(entries.hasNext()) {
			
			Entry<Integer, String> e = entries.next();
			
			System.out.println(e.getKey() + " : " + e.getValue());
			
		}
	}
}
