package jar;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//Reflection: helps us to anlyze members of class developed by someone else 
	// The major drawback of reflection is it reduces the security of the pgm

//* jar: is java archive ie.e collection of .class files and interfaces
/* Steps to generate jar file 
 * 1. right-click on the project
 * 2. select export by path you want to choose
 * 3. click on next
 * 4. finish
 * 
 * Steps to linking jar into your current program
 * 1. right-click on the project
 * 2. go to properties
 * 3. java build path
 * 4. libraries tab
 * 5. add external jar 
 * 
 */
public class A {
	public static void main(String[] args) {

		try {
			Class cls = Class.forName("classes.A"); //loads the class into your pgm dynamically

			Field[] f = cls.getDeclaredFields();

			for (Field i : f) {
				System.out.println(i);
			}

			Method[] m = cls.getDeclaredMethods();

			for (Method i : m) {
				System.out.println(i);
			}

			Constructor[] c = cls.getDeclaredConstructors();

			for (Constructor i : c) {
				System.out.println(i);
			}

		} catch (ClassNotFoundException cnfs) {
			System.out.println(cnfs);
		}

	}
}
