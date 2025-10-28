package com.codegnan.mapinterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapCustomObject {

	public static void main(String[] args) {
		HashMap<Person,Integer>h1=new HashMap<>();
		h1.put(new Person(1,"malli","malli@gmail.com"), 666);
		h1.put(new Person(7,"arjun","arjun@gmail.com"), 111);
		h1.put(new Person(5,"neha","neha@gmail.com"), 000);
		h1.put(new Person(3,"monika","monika@gmail.com"), 999);
		h1.put(new Person(8,"anusha","anu@gmail.com"), 888);
		System.out.println("Printing entries one by one");
		for(Entry<Person, Integer> entry:h1.entrySet()) {
			System.out.println(entry.getKey()+ "===>" + entry.getValue());
     }
		System.out.println("LinkedHash Map");
		LinkedHashMap<Person, Integer> h2=new LinkedHashMap<>();
		h2.put(new Person(1,"malli","malli@gmail.com"), 666);
		h2.put(new Person(7,"arjun","arjun@gmail.com"), 111);
		h2.put(new Person(5,"neha","neha@gmail.com"), 000);
		h2.put(new Person(3,"monika","monika@gmail.com"), 999);
		h2.put(new Person(8,"anusha","anu@gmail.com"), 888);
		System.out.println("Printing entries one by one");
		for(Entry<Person, Integer> entry:h2.entrySet()) {
			System.out.println(entry.getKey()+ "===>" + entry.getValue());
		}
		System.out.println("Tree Map");
		TreeMap<Person, Integer> h3=new TreeMap<>();
		h3.put(new Person(1,"malli","malli@gmail.com"), 666);
		h3.put(new Person(7,"arjun","arjun@gmail.com"), 111);
		h3.put(new Person(5,"neha","neha@gmail.com"), 000);
		h3.put(new Person(3,"monika","monika@gmail.com"), 999);
		h3.put(new Person(8,"anusha","anu@gmail.com"), 888);
		System.out.println("Printing entries one by one");
		for(Entry<Person, Integer> entry:h3.entrySet()) {
			System.out.println(entry.getKey()+ "===>" + entry.getValue());
		}

		
		
	}
}



