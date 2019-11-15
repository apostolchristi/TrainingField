package com.company.ocp.io;

import java.io.*;

public class BufferedInputStreamAndBufferedOutputStream {

	public static void main(String[] args) {

	}
}


class CopyBufferFileSample {

	public static void copy(File source, File destination) throws IOException {
		try (
				InputStream in = new BufferedInputStream(new FileInputStream(source));
				OutputStream out = new BufferedOutputStream(new FileOutputStream(destination))
				){
			byte[] buffer = new byte[1024];
			int lengthRead;
			while ((lengthRead = in.read()) > 0) {
				out.write(buffer, 0, lengthRead);
				out.flush();
			}

		}
	}
}
