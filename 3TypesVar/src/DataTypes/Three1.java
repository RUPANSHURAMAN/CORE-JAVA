package DataTypes;
//MEDIOCRE
public class Three1 {
	public static void main(String[] args) {
		int i = 10;// local var created in method and to be used within method // we don't require
					// ref var to access local vars (directly)
		int j; // NO ERROR as no display var value
		System.out.println(i);
		// System.out.println(j); // ERROR as local var need to initialized
		Three1 t1 = new Three1();
		t1.test();
	}

	public void test() {
		// System.out.println(i);//ERROR as local var defined in main()
	}
}
