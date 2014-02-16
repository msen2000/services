package org.sen.security.service.encryption;

import javax.crypto.*;
import javax.crypto.spec.PBEParameterSpec;

/**
 * 
 * @author Sen
 *
 */
public abstract class EncryptionSvc {
	
	private SecretKey secretKey;
		
	/**
	 * Password based ctor
	 */
	public EncryptionSvc(String password) {
		SecretKeyGenerator keyGen = new SecretKeyGenerator();
		try {
			secretKey = keyGen.generatePBEKey(password);
		} catch (Exception e) {
			e.printStackTrace();
		}
    
	}
	/**
	 * default AES based ctor
	 */
	public EncryptionSvc() {
		SecretKeyGenerator keyGen = new SecretKeyGenerator();
		try {
			secretKey = keyGen.generateAESDefaultKey();
		} catch (Exception e) {
			e.printStackTrace();
		}
    
	}

	/**
	 * Spec for PBE
	 * @throws Exception
	 */
	public PBEParameterSpec getPBEParameterSpec() throws Exception {
		
        PBEParameterSpec pbeParamSpec = null;
        // Salt
        byte[] salt = {
            (byte)0xc7, (byte)0x73, (byte)0x21, (byte)0x8c,
            (byte)0x7e, (byte)0xc8, (byte)0xee, (byte)0x99
        };
        // Iteration count
        int count = 20;
        // Create PBE parameter set
        pbeParamSpec = new PBEParameterSpec(salt, count);
        
        return pbeParamSpec;
	}

	public SecretKey getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(SecretKey secretKey) {
		this.secretKey = secretKey;
	}

	/**
	 * 
	 * @param inputPlainText
	 * @return
	 * @throws Exception
	 */
	abstract public byte[] encryptString(String inputPlainText) throws Exception;
	/**
	 * 
	 * @param byteCipherText
	 * @return
	 * @throws Exception
	 */
	abstract public byte[] decryptByteArray(byte[] byteCipherText) throws Exception;

}
