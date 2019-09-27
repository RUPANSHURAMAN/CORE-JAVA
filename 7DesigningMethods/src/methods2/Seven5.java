package methods2;

public class Seven5 {
	public static void main(String[] args) {
		Seven5 s5 = new Seven5();
		// System.out.println(s5.test()); //ERROR as method calling statement can't be
		// inside SOP if the method return type is [VOID] and SOP can't print control
		// transfered
	}

public void test()
	{
		System.out.println("test");
	}
}
