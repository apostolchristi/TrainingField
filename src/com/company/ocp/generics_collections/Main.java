package com.company.ocp.generics_collections;

public class Main {

	public static void main(String[] args) {

		Elephant elephant = new Elephant();
		Crate<Elephant> crateForElephant = new Crate<>();
		crateForElephant.packCrate((Elephant) elephant);
		Elephant inNewHome = crateForElephant.emptyCrate();

		Animal zebra = new Zebra();
		Crate<Zebra> zebraCrate = new Crate<>();
		zebraCrate.packCrate((Zebra) zebra);

		SizeLimitedCrate<Elephant, Integer> c1 = new SizeLimitedCrate<>(elephant, 1000);
	}
}

class Crate<T> {

	private T contents;

	public T emptyCrate() {
		return contents;
	}

	public void packCrate(T contents) {
		this.contents = contents;
	}

	public static <T> Crate<T> ship(T t) {
		System.out.println("Preparing " + t);
		return new Crate<T>();
	}

}

interface Shippable<T> {
	void ship (T t);
}

class SizeLimitedCrate<T, U> {
	private T contents;
	private U sizeLimit;

	public SizeLimitedCrate(T contents, U sizeLimit) {
		this.contents = contents;
		this.sizeLimit = sizeLimit;
	}

}

class Animal {

}

class Elephant implements Shippable<Zebra>{
	@Override
	public void ship(Zebra zebra) {

	}
}

class Zebra extends Animal {

}
