package com.company.patterns.behavioral.memento.example1;

//caretaker
public class FileWriterCaretaker {

	private Object object;

	public void save(FileWriterUtil fileWriter) {
		this.object = fileWriter.save();
	}

	public void undo(FileWriterUtil fileWriter) {
		fileWriter.undoToLastSave(this.object);
	}
}
