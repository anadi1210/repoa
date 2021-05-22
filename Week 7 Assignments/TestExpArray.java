package org.meritamerica.assignments;

public class TestExpArray {

	public static void main(String[] args) {
		
		ExpandableArray myList = new ExpandableArray();
		myList.set(14, "Bob");
		myList.set(12, "Sally");
		myList.set(25, "Anadi");
		
		String value = (String) myList.get(25); 
		if (value != null) {
			System.out.println("Got value: " + value);
			System.out.println("Array length : "+myList.getSize());
		}
	
		else {
			System.out.println("Either the value is null Or Specified Index does not exist");
		}
		
	}

}
