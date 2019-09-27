package constructors;
public class H {
H(){
	H h1 = new H(100);//2 
	System.out.println("H");//3
}

public H(int i) {
	System.out.println(i);//4
}

public static void main(String[] args) {
	H h1 =new H();//1
}
}
