package com.company.ocp.generics_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {

		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(66);
		hashSet.add(88);
		hashSet.add(1);
		hashSet.add(25);

//		for(Integer integer : hashSet) {
//			System.out.print(integer + ",");
//		}

		Iterator<Integer> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			Integer inte = iterator.next();
			System.out.print(inte);
			if(iterator.hasNext()) {
				System.out.print(",");
			} else if (!iterator.hasNext()) {
				System.out.println(".");
			}
		}

		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(66);
		treeSet.add(88);
		treeSet.add(1);
		treeSet.add(25);

		Iterator<Integer> iterator2 = hashSet.iterator();
		while (iterator2.hasNext()) {
			Integer inte = iterator2.next();
			System.out.print(inte);
			if(iterator2.hasNext()) {
				System.out.print(",");
			} else if (!iterator2.hasNext()) {
				System.out.println(".");
			}
		}

	}
}
