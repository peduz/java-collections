package it.lessons.collection.set;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(10);
		
		list.add("pippo");
		list.add("pluto");
		list.add("paperino");
		
		int indiceDiPaperino = list.indexOf("paperino");
		System.out.println("Indice di paperino: " + indiceDiPaperino);
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		
		indiceDiPaperino = list.indexOf("paperino");
		System.out.println("Indice di paperino: " + indiceDiPaperino);
		
		list.add(0, "pippo");
		System.out.println(list);
		
		list.add(2, "alin");
		System.out.println(list);
		
		list.set(2, null);
		System.out.println(list);
		
	}
}
