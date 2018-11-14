package rsa;
import java.math.*;

public class KeySetUnitTest {
	
	public static void main(String[] args) {
		
		BigInteger mod = new BigInteger("282412700609590300056272192845681536961");
		BigInteger e = new BigInteger("65537");
		BigInteger d = new BigInteger("71093347798297462040877249316521181801");
		KeySet key = new KeySet(mod,e,d);
		String s = key.toString();
		System.out.println(s);
		
		System.out.println(KeySet.parseInt("1209182309123120918"));
		System.out.println(KeySet.intString(new BigInteger("448378203247")));
		
		
	}
}
