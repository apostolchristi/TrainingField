package com.company.ocp.io;

import java.io.*;

/**
 * File class is used to read information about existing files and directories, list the contnts of a directory and create/delete files and directories
 *
 * Absolute Path = is the full path from the root directory to the file or directory, including all subdirectories that contain the file or directory
 * Relative Path =
 */
public class FileClassExamples {

	public static void main(String[] args) throws IOException {

		System.out.println(System.getProperty("file.separator"));
		System.out.println(File.separator);
		String path = "C:\\Users\\Capostol\\Desktop";
		File file = new File(path);
		System.out.println(file.exists());

		File parent = new File("C:\\Users\\Capostol");
		File child = new File(parent, "Desktop");

		System.out.println("File Exists: " + child.exists());
		System.out.println("Absolute Path: " + child.getAbsolutePath());
		System.out.println("Is Directory: " + child.isDirectory());
		System.out.println("Parent Path : " + child.getParent());
		if(child.isFile()) {
			System.out.println("File Size: " + child.length());
			System.out.println("File LastModified: " + child.lastModified());
		} else {
			for(File subfile : child.listFiles()) {
				System.out.println("\t " + subfile.getName());
			}
		}

		BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"));


		try (ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream("file.txt")))){
			System.out.println(objectInputStream.read());

		} finally {

		}


	}
}
