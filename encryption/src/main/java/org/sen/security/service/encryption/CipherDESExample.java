package org.sen.security.service.encryption;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public class CipherDESExample {

	public static void main(String[] args) {
		try {
			String key = "squirrel123"; // needs to be at least 8 characters for DES

//			FileInputStream fis = new FileInputStream("C:\\Temp\\crypto\\original.txt");
//			FileOutputStream fos = new FileOutputStream("C:\\Temp\\crypto\\encrypted.txt");
//			encrypt(key, fis, fos);
//
//			FileInputStream fis2 = new FileInputStream("C:\\Temp\\crypto\\encrypted.txt");
//			FileOutputStream fos2 = new FileOutputStream("C:\\Temp\\crypto\\decrypted.txt");
//			decrypt(key, fis2, fos2);

			//DOCX
			
//			FileInputStream fis = new FileInputStream("C:\\Temp\\crypto\\PostMaster.docx");
//			FileOutputStream fos = new FileOutputStream("C:\\Temp\\crypto\\PostMasterEncrypted.docx");
//			encrypt(key, fis, fos);
//
//			FileInputStream fis2 = new FileInputStream("C:\\Temp\\crypto\\PostMasterEncrypted.docx");
//			FileOutputStream fos2 = new FileOutputStream("C:\\Temp\\crypto\\PostMasterDecrypted.docx");
//			decrypt(key, fis2, fos2);


//			FileInputStream fis = new FileInputStream("C:\\Temp\\crypto\\AccountFeb.xlsx");
//			FileOutputStream fos = new FileOutputStream("C:\\Temp\\crypto\\AccountFebEncrypted.xlsx");
//			encrypt(key, fis, fos);
//
//			FileInputStream fis2 = new FileInputStream("C:\\Temp\\crypto\\AccountFebEncrypted.xlsx");
//			FileOutputStream fos2 = new FileOutputStream("C:\\Temp\\crypto\\AccountFebDecrypted.xlsx");
//			decrypt(key, fis2, fos2);

			FileInputStream fis = new FileInputStream("C:\\Temp\\crypto\\mobilecell.pdf");
			FileOutputStream fos = new FileOutputStream("C:\\Temp\\crypto\\mobilecellEncrypted.pdf");
			encrypt(key, fis, fos);

			FileInputStream fis2 = new FileInputStream("C:\\Temp\\crypto\\mobilecellEncrypted.pdf");
			FileOutputStream fos2 = new FileOutputStream("C:\\Temp\\crypto\\mobilecellDecrypted.pdf");
			decrypt(key, fis2, fos2);

			//mobilecell
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	public static void encrypt(String key, InputStream is, OutputStream os) throws Throwable {
		encryptOrDecrypt(key, Cipher.ENCRYPT_MODE, is, os);
	}

	public static void decrypt(String key, InputStream is, OutputStream os) throws Throwable {
		encryptOrDecrypt(key, Cipher.DECRYPT_MODE, is, os);
	}

	public static void encryptOrDecrypt(String key, int mode, InputStream is, OutputStream os) throws Throwable {

		DESKeySpec dks = new DESKeySpec(key.getBytes());
		SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
		SecretKey desKey = skf.generateSecret(dks);
		Cipher cipher = Cipher.getInstance("DES"); // DES/ECB/PKCS5Padding for SunJCE

		if (mode == Cipher.ENCRYPT_MODE) {
			cipher.init(Cipher.ENCRYPT_MODE, desKey);
			CipherInputStream cis = new CipherInputStream(is, cipher);
			doCopy(cis, os);
		} else if (mode == Cipher.DECRYPT_MODE) {
			cipher.init(Cipher.DECRYPT_MODE, desKey);
			CipherOutputStream cos = new CipherOutputStream(os, cipher);
			doCopy(is, cos);
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