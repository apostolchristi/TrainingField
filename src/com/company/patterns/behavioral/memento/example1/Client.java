package com.company.patterns.behavioral.memento.example1;

public class Client {

	public static void main(String[] args) {

		FileWriterCaretaker caretaker = new FileWriterCaretaker();


		FileWriterUtil fileWriterUtil = new FileWriterUtil("data.txt");
		fileWriterUtil.write("Thi is the test try of my memento class");

		System.out.println(fileWriterUtil + "\n");

		caretaker.save(fileWriterUtil);

		fileWriterUtil.write("Second set of data:\nJson\n");

		System.out.println(fileWriterUtil + "\n");

		caretaker.undo(fileWriterUtil);

		System.out.println(fileWriterUtil + "\n");


	}
}
