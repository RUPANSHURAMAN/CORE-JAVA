
public class D {
D(){
	System.out.println("D");//4
}

public static void main(String[] args) {
//START by main()
	D.test();//1 
	D d1 = new D();//3
	System.out.println(d1);
	d1.test();//5
	System.out.println("main");//7
}

public static void test() {
	System.out.println("test");//2 //6
}
}
