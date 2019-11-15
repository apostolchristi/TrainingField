package com.company.patterns.behavioral.command.example1;

public class FileSystemReceiverUtil {

	public static FileSystemReceiver getUnderLyingFileSystem() {
		String osName = System.getProperty("os.name");
		System.out.println("Underlying OS is:" +osName);
		if(osName.contains("Windows")) {
			return new WindowsFileSystemReceiver();
		} else {
			return new UnixFileSystemReceiver();
		}
	}
}
