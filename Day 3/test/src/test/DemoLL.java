package test;

import java.util.LinkedList;
import java.util.ListIterator;

public class DemoLL {
 public static void main(String[] args) {
	LinkedList ll = new LinkedList();
	
	ll.add(1);
	ll.add(2);
	ll.add(3);
	
	ListIterator li = ll.listIterator();
	while(li.hasNext()) {
		Object e = li.next();
		System.out.println(e);
	}
	
	ll.remove(2);
	
	ListIterator li1 = ll.listIterator();
	while(li1.hasNext()) {
		System.out.println(li1.next());
	}
}
}
