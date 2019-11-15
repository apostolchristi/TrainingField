package com.company.ocp.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectInputStreamAndObjectOutputStream {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("Tommy Tiger",5,'T'));
		animals.add(new Animal("Peter Penguin",8,'P'));
		File dataFile = new File("animal.data");
		ObjectStreamSample.createAnimalsFile(animals, dataFile);
		System.out.println(ObjectStreamSample.getAnimals(dataFile));

	}
}

class ObjectStreamSample {
	public static List<Animal> getAnimals(File dataFile) throws IOException, ClassNotFoundException {
		List<Animal> animals = new ArrayList<>();

		try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dataFile)))){
			while (true) {
				Object object = in.readObject();
				if(object instanceof Animal) {
					animals.add((Animal)object);
				}
			}
		} catch (IOException e) {
			// File end reached
		}
		return animals;
	}

	public static void createAnimalsFile(List<Animal> animals, File dataFile) throws IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)))){
			for(Animal animal : animals) {
				out.writeObject(animal);
			}

		}
	}
}

class Animal implements Serializable {
	private static final long SERIAL_VERSION_UID = 1L;
	private String name;
	private int age;
	private char type;

	public Animal(String name, int age, char type) {
		this.name = name;
		this.age = age;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Animal{" +
				"name='" + name + '\'' +
				", age=" + age +
				", type=" + type +
				'}';
	}
}
