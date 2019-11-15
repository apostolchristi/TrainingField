package com.company.ocp.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesExamples {

	public static void main(String[] args) throws IOException {

		System.out.println(Files.exists(Paths.get("/ostrich/feathers.png")));
		System.out.println(Files.exists(Paths.get("/ostrich")));

//		try {
//			System.out.println(Files.isSameFile(Paths.get("/user/home/cobra"), Paths.get("/user/home/snake")));
//			System.out.println(Files.isSameFile(Paths.get("/user/tree/../monkey"), Paths.get("/user/monkey")));
//			System.out.println(Files.isSameFile(Paths.get("/leaves/./giraffe.exe"), Paths.get("/leaves/giraffe.exe")));
//			System.out.println(Files.isSameFile(Paths.get("/flamingo/tail.data"), Paths.get("/cardinal/tail.data")));
//
//		}catch (IOException e) {
//			e.printStackTrace();
//		}

		Files.createDirectory(Paths.get("/bison/field"));
	}
}
