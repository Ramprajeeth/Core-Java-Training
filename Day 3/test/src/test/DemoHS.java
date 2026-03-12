package test;

import java.util.Iterator;
import java.util.HashSet;

public class DemoHS {

	public static void main(String[] args) {
		HashSet set = new HashSet();

		System.out.println("1.Initial size of HashSet before adding elements: " + set.size());
		System.out.println("2.HashSet is empty before adding values: " + set.isEmpty());
		System.out.println("3.Contents of HashSet before adding values: " + set);

		// adding elements or values to the TreeSet
		set.add("C");
		set.add("A");
		set.add("E");
		set.add("B");
		set.add("D");
		set.add("F");

		// cannot add duplicates, dissimilar and null values in TreeSet
//		set.add("A");
//		set.add(new Integer(10));
//		set.add(null);

		System.out.println("4.Size of HashSet after adding elements: " + set.size());
		System.out.println("5.HashSet is empty after adding values: " + set.isEmpty());

		// display the contents of TreeSet
		System.out.println("6.Contents of HashSet after adding values: " + set);

		// check whether an element is present or not
		boolean b1 = set.contains("E");
		System.out.println("7.Value E is present: " + b1);

		boolean b2 = set.contains("R");
		System.out.println("8.Value R is present: " + b2);

		// Remove an element from the TreeSet
		set.remove("B");

		Iterator it = set.iterator();
		while (it.hasNext()) {
			Object e = it.next();
			System.out.println(e);
		}

		System.out.println("9.Size of HashSet after deletion: " + set.size());
		System.out.println("10.Contents of HashSet after deletion: " + set);

		// delete all the elements in the TreeSet
		set.clear();
		System.out.println("11.Size of HashSet after clearing: " + set.size());
		System.out.println("12.Contents of HashSet after clearing: " + set);

	}

}
