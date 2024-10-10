package it.lessons.collection.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> interi = new ArrayList<>();
		interi.add(234);
		interi.add(234354);
		interi.add(2341212);
		interi.add(3243);
		interi.add(21234);
		interi.add(1213234);
		interi.add(23213124);
		interi.add(-234234234);
		interi.add(-1231234);
		interi.add(-2234);
		interi.add(-1221234);
		
		interi.size();
		
		System.out.println("Lista non ordinata: " + interi);
		Collections.sort(interi);
		System.out.println("Lista ordinata: " + interi);
		
		List<Integer> ints = Arrays.asList(1, 2, 3);
		
		Integer[] arr = (Integer[]) ints.toArray();
		
		
		Integer a = 1;
		Double b = 1.2;
		Float c = 2.3f;
		Boolean bool = false;
		
		int a2 = a;
		double b2 = b;
		float c2 = c;
		boolean bool2 = bool;
		
		a = a2;
		b = b2;
		c = c2;
		bool = bool2;
	}
}
