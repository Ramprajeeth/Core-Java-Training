package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class DemoArrayList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		
		Iterator ite = al.iterator();
		
		while(ite.hasNext()) {
			Object e = ite.next();
			System.out.println(e);
		}
		
		al.add(0, 1);
		
		Iterator ite1 = al.iterator();
		while(ite1.hasNext()) {
			Object e = ite.next();
			System.out.println(e);
		}
		
		al.remove(2);
		
		ListIterator ite2 = al.listIterator(al.size());
		while(ite2.hasPrevious()) {
			Object e = ite2.previous();
			System.out.println(e);
		}
		
	}
	
}
