package rsa;
import java.math.*;
public class RSAEncryptorUnitTest {
	
	public static void main(String[] args) {
		
		RSAEncryptor r = new RSAEncryptor();
		KeySet myKey = new RSAKeyGenerator().generateKeys();
		
		BigInteger message = r.messageToInteger("Hello this is a test message");
		BigInteger ciphertext = r.encrypt(message, myKey.publicKey, myKey.modulus);
		
		System.out.println("Encrption....");
		System.out.println("Ciphertext: "+ ciphertext.toString());
		System.out.println("Decryption...");
		BigInteger dec = r.decrypt(ciphertext, myKey.privateKey, myKey.modulus);
		System.out.println("Message: " + r.integerToMessage(dec));
	}
}
