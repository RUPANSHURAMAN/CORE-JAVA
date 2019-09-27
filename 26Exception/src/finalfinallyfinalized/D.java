package finalfinallyfinalized;

public class D {

	public static void main(String[] args) {
		try {
			int i =10/0;
		}finally {
			System.out.println("Bollo/Helee");
		}
		/* catch() {
						//ERROR as catch can't be at try-finally
		}*/
		System.out.println("xczxcxzc"); //Doesn't print as Exception at try
	}
}
