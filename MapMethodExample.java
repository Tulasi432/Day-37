package com.codegnan.mapinterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethodExample {

	public static void main(String[] args) {
		Map<String,Integer>studentMarks=new HashMap<>();
		studentMarks.put("Arjun", 88);
		studentMarks.put("Rahul", 98);
		studentMarks.put("Sita", 68);
		studentMarks.put("priya", 98);
		System.out.println(studentMarks);
		
		Map<String,Integer>newStudents=new HashMap<>();
		studentMarks.put("ananaya", 78);
		studentMarks.put("vikram", 38);
		studentMarks.put("sneha", 28);
		studentMarks.putAll(newStudents);
		System.out.println(studentMarks);
		
		System.out.println("Marks of Arjun:"+studentMarks.get("Arjun"));
		
		System.out.println("Removed Priya's marks:"+studentMarks.remove("Priya"));
		
		System.out.println("is Sita present?:"+studentMarks.containsKey("Sita"));
		
		System.out.println("Any Student Scored 100:"+studentMarks.containsKey(newStudents));
		
		System.out.println("Is Map empty?:"+studentMarks.isEmpty());
		System.out.println("Total Students:"+studentMarks.size());
		Set<String>studentNames=studentMarks.keySet();
		System.out.println("student names"+studentNames);
		
		Collection<Integer>marks=studentMarks.values();
		System.out.println("Marks:"+marks);
		
		Set<Map.Entry<String,Integer>>entries=studentMarks.entrySet();
		System.out.println("All Entries");
		for(Map.Entry<String,Integer>entry:entries) {
			System.out.println(entry.getKey()+"--->"+entry.getValue());
			
		}
		studentMarks.clear();
		System.out.println("Map is cleared.is Empty?"+studentMarks.isEmpty());
		
	}

}
