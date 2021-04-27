import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Base64.Decoder;

public class EncodingDemo {
	public static void main(String[] args) {
		String password = "P@ssWorD";
		System.out.println(password);
		
		Encoder encoder = Base64.getEncoder();
		String encodedPassword = encoder.encodeToString(password.getBytes());
		System.out.println(encodedPassword);
		
		Decoder decoder = Base64.getDecoder();
		String d = new String(decoder.decode(encodedPassword.getBytes()));
		System.out.println(d);
	}
	

}
