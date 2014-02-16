package org.sen.security.service.encryption;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	    	
    	//EncryptionSvc encSvc = new AESEncryptionSvc();
    	EncryptionSvc encSvc = new PBEEncryptionSvc("Password123");
    	
		try {
			String inputPlainText = "Insert here whatever you want to crypt";
			System.out.println("inputPlainText: "+inputPlainText);
			
			byte[] byteCipherText = encSvc.encryptString(inputPlainText);
			System.out.println("encrypted Text : "+new String(byteCipherText));
			
			byte[] dec = encSvc.decryptByteArray(byteCipherText);
			System.out.println("decrypted Text : "+new String(dec));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

    }
}
