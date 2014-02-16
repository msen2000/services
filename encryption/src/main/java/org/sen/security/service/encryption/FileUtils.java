package org.sen.security.service.encryption;

import java.io.*;

public class FileUtils {

	public void readfile() throws Exception {
		String filename = "C:\\temp";
		FileInputStream fis = new FileInputStream(filename);
		BufferedInputStream bis = new BufferedInputStream(fis);
	
		while (bis.available() > 0) {
		   // System.out.println(cert.toString());
		}
	}
	
	
	public static void doCopy(InputStream is, OutputStream os) throws IOException {
		byte[] bytes = new byte[64];
		int numBytes;
		while ((numBytes = is.read(bytes)) != -1) {
			os.write(bytes, 0, numBytes);
		}
		os.flush();
		os.close();
		is.close();
	}
}
