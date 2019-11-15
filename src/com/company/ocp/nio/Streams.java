package com.company.ocp.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) throws IOException {

		Path paths = Paths.get("/bigcats");

		try {
			Files.walk(paths)
					.filter( p -> p.toString().endsWith(".java"))
					.forEach(System.out::println);

		}catch (IOException e) {

		}


		Path path = Paths.get("/bigcats");
		long dateFilter = 1420070400000l;

		try {
			Files.readAllLines(path);
			Stream<Path> stream = Files.find(path, 10, (p, a) -> p.toString().endsWith(".java") && a.lastModifiedTime().toMillis() > dateFilter);
			stream.forEach(System.out::println);


		}catch (IOException e) {

		}
	}
}
