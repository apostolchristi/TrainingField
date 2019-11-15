package com.company.ocp.generics_collections;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Duck implements Comparable<Duck> {
	private String name;
	private int weight;

	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public String toString() {
		return name;
	}

	public int compareTo(Duck d) {
		return name.compareTo(d.name);
	}

}

 class DuckHelper  extends Duck{

  public DuckHelper(String name, int weight) {
   super(name, weight);
  }

  public static int compareByWeight(Duck d1, Duck d2) {
  return d1.getWeight() - d2.getWeight();
 }
 public static int compareByName(Duck d1, Duck d2) {
  return d1.getName().compareTo(d2.getName());
 }
}


class Main3 {
	public static void main(String[] args) {
     Duck duck = new Duck("Test", 5);
     DuckHelper duckHelper = new DuckHelper("Test", 4);

     System.out.println(duck instanceof DuckHelper);

		List<Duck> ducks = new ArrayList<>();
		ducks.add(new Duck("Quack", 7));
		ducks.add(new Duck("Puddles", 10));
     Collections.sort(ducks);
     System.out.println(ducks);

     Collections.sort(ducks, (Duck d1, Duck d2) -> d1.getWeight() - d2.getWeight());
     System.out.println(ducks);

     Collections.binarySearch(ducks, new Duck("Quack", 7));

    Comparator<Duck> comparator = (d1, d2) -> DuckHelper.compareByName(d1, d2);

     Consumer<List<Integer>> methodRef1 = Collections::sort;
     Consumer<List<Integer>> lambda = l1 -> Collections.sort(l1);

     List<Integer> list = new ArrayList<>();
     list.add(1);
     list.add(1);
     list.replaceAll(x -> x*2);

     List<String> cats = Arrays.asList("Annie", "Ripley");
     for (String cat : cats) {
      System.out.println(cat);
     }

     cats.forEach(s -> System.out.println(s));

     cats.forEach(System.out::println);


     Map<String, String> favorites = new HashMap<>();
     favorites.put("Jenny", "Bus Tour");
     favorites.put("Tom", null);

     favorites.putIfAbsent("Jenny", "Tram");
     favorites.putIfAbsent("Sam", "Tram");
     favorites.putIfAbsent("Tom", "Tram");
     System.out.println(favorites);

     BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
     Map<String, String> favorites2 = new HashMap<>();
     favorites2.put("Jenny", "Bus Tour");
     favorites2.put("Tom", "Tram");

     String jenny = favorites2.merge("Jenny", "Skyride", mapper);
     String tom = favorites2.merge("Tom", "Skyride", mapper);
     System.out.println(favorites2);


     Map<String, Integer> counts = new HashMap<>();
     counts.put("Jenny", 1);

     BiFunction<String, Integer, Integer> mapper2 = (k, v) -> v + 1;
     Integer jennyInt = counts.computeIfPresent("Jenny", mapper2);
     System.out.println(counts);
     Integer tom2 = counts.computeIfPresent("Tom", mapper2);
     System.out.println(counts);
     Function<String, Integer> function = s -> s.length();
     Integer tom3 = counts.computeIfAbsent("Tom", function);
     System.out.println(counts);



	}


}
