/**
 * 
 */

/**
 * @author preetipatel
 *
 */
public interface CipherInterface {
	
 public void setKey(String key);
 
 public String encrypt(String plaintext);
 
 public String decrypt(String ciphertext);
 
}
