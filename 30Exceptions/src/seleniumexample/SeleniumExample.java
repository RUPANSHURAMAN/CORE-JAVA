package seleniumexample;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class SeleniumExample {

	public static void main(String[] args) {
		
		try {
		Class cls = Class.forName("org.openqa.selenium.firefox.FirefoxDriver");
		
		Constructor[] c = cls.getConstructors();
		
		for(Constructor i:c) {
			System.out.println(i);
		}
		
		Method[] m = cls.getMethods();
		
		for(Method i:m) {
			System.out.println(i);
		}
		
		
		}catch(ClassNotFoundException cnfe) {
			System.out.println(cnfe);
		}
		
		
	}
}
