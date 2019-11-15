package com.company.ocp.functionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {

		Stream<String> empy = Stream.empty();
		Stream<Integer> singleElement = Stream.of(1);
		Stream<Integer> fromArray = Stream.of(1, 2, 3);

		List<String> list = Arrays.asList("a", "b", "c");
		Stream<String> formList = list.stream();
		Stream<String> fromlistParallel = list.parallelStream();

		Stream<Double> randoms = Stream.generate(() -> Math.random());
		Stream<Integer> oddNumbers = Stream.iterate(1, n -> n+2);

		List<String> someBingoNumbers = Arrays.asList("N40", "N36", "B12", "B6", "G53", "G49", "G60", "G50", "g64", "I26", "I17", "I29", "O71");
		List<String> gNumbers = new ArrayList<>();

		//*******Lambda classic implementation*********
		System.out.println("\t\t//*******Lambda classic implementation*********\n");
		someBingoNumbers.forEach(number -> {
			if(number.toUpperCase().startsWith("G")) {
				gNumbers.add(number);
//				System.out.println(number);
			}
		});

		gNumbers.sort(String::compareTo);
		gNumbers.forEach(System.out::println);
		System.out.println();

		System.out.println("\t\t//*******Stream  implementation*********\n");
		someBingoNumbers
				.stream()
				.map( String::toUpperCase)
				.filter(s -> s.startsWith("G"))
				.sorted()
				.forEach(System.out::println);


		Stream<String> ioNumberString = Stream.of("I26", "I17", "I29", "O71");
		Stream<String> inNumberStream = Stream.of("N40", "N36", "I26", "I17", "I29", "O71");
		Stream<String> concatStream = Stream.concat(ioNumberString, inNumberStream);
//		concatStream.forEach(s -> System.out.print(s + ","));
		System.out.println("------------------------------");
		System.out.println("\n" + concatStream.
				distinct().
				peek(System.out::println).
				count());

		Employee jhonDoe = new Employee("Jhon Doe", 30);
		Employee janeDeer = new Employee("Jane Deer", 25);
		Employee jackHill = new Employee("Jack Hill", 40);
		Employee snowWhite = new Employee("Snow White", 2);

		Department hr = new Department("Human Resources");
		hr.addEmployee(janeDeer);
		hr.addEmployee(jackHill);
		hr.addEmployee(snowWhite);

		Department accounting = new Department("Accounting");
		accounting.addEmployee(jhonDoe);

		List<Department> departments = new ArrayList<>();
		departments.add(hr);
		departments.add(accounting);

		departments.stream()
				.flatMap(department -> department.getEmployees().stream())
				.forEach(System.out::println);

		System.out.println("-------------");
//		List<String> sortedGNumbers = someBingoNumbers
//				.stream()
//				.map(String::toUpperCase)
//				.filter(s -> s.startsWith("G"))
//				.sorted()
//				.collect(Collectors.toList());
//		sortedGNumbers.forEach(System.out::println);

		List<String> sortedGNumbers = someBingoNumbers
				.stream()
				.map(String::toUpperCase)
				.filter(s -> s.startsWith("G"))
				.sorted()
				.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		sortedGNumbers.forEach(System.out::println);

		Map<Integer, List<Employee>> groupedByAge = departments.stream()
				.flatMap(department -> department.getEmployees().stream())
				.collect(Collectors.groupingBy(employee -> employee.getAge()));

		departments.stream()
				.flatMap(department -> department.getEmployees().stream())
				.reduce((e1, e2) -> e1.getAge() < e2.getAge() ? e1 : e2)
				.ifPresent(System.out::println);

		Stream.of("ABC", "AC","BAA","CCCC","XY", "ST")
				.filter(s -> {
					System.out.println(s);
					return s.length() == 3;
				})
		.count();



	}
}

class Employee {

	private String name;
	private int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return name;
	}
}

class Department {

	private String name;
	private List<Employee> employees;

	public Department(String name) {
		this.name = name;
		employees = new ArrayList<>();
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);

	}

	public List<Employee> getEmployees() {
		return this.employees;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
