package com.company.patterns.behavioral.memento.example1;


//Originator - is going to create a memento containing a snapshot of its current internal state and then it will use that memento to restore its internal state
public class FileWriterUtil {

	private String fileName;
	private StringBuilder content;

	public FileWriterUtil(String fileName) {
		this.fileName = fileName;
		this.content = new StringBuilder();
	}

	@Override
	public String toString() {
		return this.content.toString();
	}

	public void write(String str) {
		this.content.append(str);
	}

	// creates the memento
	public Memento save() {
		return new Memento(this.fileName, this.content);
	}

	// restore into its earlier state
	public void undoToLastSave(Object object) {
		Memento memento = (Memento) object;
		this.fileName = memento.getFileName();
		this.content = memento.getContent();
	}

	// Memento
	private class Memento {

		private String fileName;
		private StringBuilder content;

		public Memento(String fileName, StringBuilder content) {
			this.fileName = fileName;
			this.content = new StringBuilder(content);
		}

		public String getFileName() {
			return fileName;
		}

		public StringBuilder getContent() {
			return content;
		}
	}


}
