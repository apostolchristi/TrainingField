package com.company.patterns.behavioral.command.example1;

//Command
public interface Command {

	void execute();

	//could add an undo or redo commands
}

//ConcreteCommand
class OpenFileCommand implements Command {
	private FileSystemReceiver fileSystemReceiver;

	// store previous state for undo, String someState

	public OpenFileCommand(FileSystemReceiver receiver) {
		this.fileSystemReceiver = receiver;
	}

	@Override
	public void execute() {
		//save previous state, in case undo called someState =...... .;
		fileSystemReceiver.openFile();
	}

	public void undo() {
		//restore previous state
		// myMemberVariable = previousState;
	}
}

class CloseFileCommand implements Command {
	private FileSystemReceiver fileSystemReceiver;

	public CloseFileCommand(FileSystemReceiver fileSystemReceiver) {
		this.fileSystemReceiver = fileSystemReceiver;
	}

	@Override
	public void execute() {
		this.fileSystemReceiver.closeFile();
	}
}

class WriteFileCommand implements Command {
	private FileSystemReceiver fileSystemReceiver;

	public WriteFileCommand(FileSystemReceiver fileSystemReceiver) {
		this.fileSystemReceiver = fileSystemReceiver;
	}

	@Override
	public void execute() {
		this.fileSystemReceiver.writeFile();
	}
}
