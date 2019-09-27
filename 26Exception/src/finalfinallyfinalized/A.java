package finalfinallyfinalized;

//finally: It is an extension of try-catch block. anything kept in finally will execute regardless of exception e.g.

public class A {
	public static void main(String[] args) {
		try {
			int i = 10/1;
			System.out.println(i);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("I will always run");
		}
	}

}
