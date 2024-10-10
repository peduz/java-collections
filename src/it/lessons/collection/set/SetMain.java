package it.lessons.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		int [] a = new int[3];
		
		Set<String> setStringhe = new HashSet<>();
		
		System.out.println("STAMPA CON HASHSET");
		
		setStringhe.add("6");
		setStringhe.add("234");
		setStringhe.add("q34");
		setStringhe.add("q34trqg");
		setStringhe.add("q43t");
		setStringhe.add("3q4q3");
		setStringhe.add("3q4q3");
		System.out.println(setStringhe);
		
		setStringhe.remove("234");
		
		System.out.println(setStringhe);
		
		System.out.println("\n=============================");
		System.out.println("=============================");
		System.out.println("=============================\n");
		
		setStringhe = new LinkedHashSet<>();
		System.out.println("STAMPA CON LINKEDHASHSET");

		setStringhe.add("6");
		setStringhe.add("234");
		setStringhe.add("q34");
		setStringhe.add("q34trqg");
		setStringhe.add("q34trqg");
		setStringhe.add("q43t");
		setStringhe.add("3q4q3");
		System.out.println(setStringhe);
		
		setStringhe.remove("234");
		
		System.out.println(setStringhe);
	}
}
