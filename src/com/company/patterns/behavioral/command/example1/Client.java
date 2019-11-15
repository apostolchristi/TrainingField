package com.company.patterns.behavioral.command.example1;

public class Client {

	public static void main(String[] args) {

		// creating the receiver
		FileSystemReceiver fileSystemReceiver = FileSystemReceiverUtil.getUnderLyingFileSystem();

		// create the command with the associating receiver
		OpenFileCommand openFileCommand = new OpenFileCommand(fileSystemReceiver);
		WriteFileCommand writeFileCommand = new WriteFileCommand(fileSystemReceiver);
		CloseFileCommand closeFileCommand = new CloseFileCommand(fileSystemReceiver);

		// creating invoker and associate it with the command
		FileInvoker fileInvoker = new FileInvoker(openFileCommand);


		// perform action on invoker object
		fileInvoker.execute();

		fileInvoker = new FileInvoker(writeFileCommand);
		fileInvoker.execute();

		fileInvoker = new FileInvoker(closeFileCommand);
		fileInvoker.execute();

	}
}
