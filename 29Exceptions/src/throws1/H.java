package throws1;

public class H{

	public void test() throws Exception, NullPointerException{ //method can throw multiple exception
		int i = 10/0;
		System.out.println(i);
	}
}
