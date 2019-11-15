package com.company.ocp.nio;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExamples {

	public static void main(String[] args) throws URISyntaxException {

		Path path1 = Paths.get("c:", "test1", "test2");
		Path path2 = Paths.get("c:/mail/test");

		Path path3 = Paths.get(new URI("file://pandas/cuddly.png"));
		Path path4 = Paths.get(new URI("file:///c:/pandas/cuddly.png"));
//		Path path5 = Paths.get(new URI("https://mail.ru"));
//		Path path7 = Paths.get(new URI("http://mail.ru"));
//		Path path6 = Paths.get(new URI("ftp://username:password@ftp.the-ftp-server.com"));

//		URI uri = path7.toUri(); // converting a Path instance back to a URI instance

		Path pathFile1 = FileSystems.getDefault().getPath("pandas/cuddly.png");
		Path pathFile2 = FileSystems.getDefault().getPath("c:", "zooinfo", "test");
		Path pathFile3 = FileSystems.getDefault().getPath("/home/zoodirector");

		Path pathVers1 = Paths.get("/land/hippo/harry.happy");
		System.out.println("The Path Name is: " + pathVers1);
		for(int i=0; i<pathVers1.getNameCount(); i++) {
			System.out.println(" Element " + i + " is: "+ pathVers1.getName(i));
		}

	}
}

class PathFilePathTest {
	public static void printPathInformation(Path path) {
		System.out.println("FileName is :" + path.getFileName());
		System.out.println("Root is :" + path.getRoot());

		Path currentParent = path;
		while ((currentParent = currentParent.getParent()) != null) {
			System.out.println(" Current parent is: " + currentParent);
		}
	}

	public static void main(String[] args) throws IOException {
		printPathInformation(Paths.get("/zoo/armadillo/shells.txt"));
		System.out.println();
		printPathInformation(Paths.get("armadillo/shells.txt"));
		System.out.println();

		Path path1 = Paths.get("C:\\birds\\egret.txt");
		System.out.println("Path1 is Absolute? " + path1.isAbsolute());
		System.out.println("Absolute Path1: " + path1.toAbsolutePath());

		Path path2 = Paths.get("birds/condor.txt");
		System.out.println("Path2 is Absolute? " + path2.isAbsolute());
		System.out.println("Absolute Path2 " + path2.toAbsolutePath());
		System.out.println();

		Path paths1 = Paths.get("fish.txt");
		Path paths2 = Paths.get("birds.txt");
		System.out.println(paths1.relativize(paths2));
		System.out.println(paths2.relativize(paths1));

		System.out.println();

		final Path pathfinal1 = Paths.get("/cats/../panther");
		final Path pathfinal2 = Paths.get("food");
		System.out.println(pathfinal1.resolve(pathfinal2));

		System.out.println();

		Path path3 = Paths.get("E:\\data");
		Path path4 = Paths.get("E:\\user\\home");
		Path relativePath = path3.relativize(path4);
		System.out.println(path3.resolve(relativePath));
		System.out.println(path3.resolve(relativePath).normalize());

		System.out.println();

		try {
			System.out.println(Paths.get("/zebra/food.source").toRealPath());
			System.out.println(Paths.get(".././food.txt").toRealPath());
		} catch (IOException e) {
			//
		}
		System.out.println(Paths.get(".").toRealPath());
	}
}
