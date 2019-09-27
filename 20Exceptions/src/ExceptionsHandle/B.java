package ExceptionsHandle;
//* in JAVA to handle the exception we use try catch block // whenever a exception happens inside try block, try will create an exception object and the reference of that object it will give it to catch. //catch will now handle the exception and hence pgm will not halt abruptly e.g.
public class B {

	public static void main(String[] args) {
		try{
			int i = 10/0;
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Completed");
	}
}
