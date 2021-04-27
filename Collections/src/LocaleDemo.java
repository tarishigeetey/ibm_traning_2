
import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {
	
	public static void main(String[] args) {
		
		Locale french = new Locale("fr");
		Locale english = new Locale("en");
		Locale desi = new Locale("hi");
		ResourceBundle bundle = ResourceBundle.getBundle("msgs", french);
		
		System.out.println(bundle.getString("greeting"));
		System.out.println(bundle.getString("message"));
	}

}
