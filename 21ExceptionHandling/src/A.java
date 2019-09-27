
/*.java class this is whereas .class file is in parent of src /bin/package_name/A.class which get auto compiled when typing
 * Throwable==>1.ERROR
 * 			||
 *  		||
 *   		==>2.Exception ==>1.Run-time Exception
 *   						||		a. Arithmetic Exception
 *   						||		b. Null Pointer Exception
 *   						||		c. Number Format
 *   						||		d. Class Cast Exception
 *   						||
 *   						==>2.Compile-time/straight away
 *   								a.FileNotFound
 *   								b.IO
 *   								c.SQL Exception
 */
public class A {

	public static void main(String[] args) {
		try {
			int i = 10/0;
		}catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		System.out.println("Completed");
	}
}
