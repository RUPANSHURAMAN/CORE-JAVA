
public class J extends I{
public void test2() {
	System.out.println("test2");
}

public static void main(String[] args) {
	J j = new J();
	j.test();//inherited from I //so during inheritance we can access inherited and also same class members
	j.test2(); //which is of J
}
}
