package com.codegnan.mapinterface;
import java.util.Comparator;
public class PersonComparator {
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			//return -o1.getName().compareTo(o2.getName());
			return Integer.compare(o1.getId(), o2.getId());
		}

	}

