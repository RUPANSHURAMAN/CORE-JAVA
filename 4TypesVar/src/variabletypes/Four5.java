package variabletypes;

public class Four5 {
static Four5 f5;
int i; //Default 0
public static void main(String[] args) {
	int k =10;
	f5 = new Four5();
	System.out.println(f5.i);
	f5.test();
}

public void test() {
	// System.out.println(k);//ERROR as local var accesed outside main() 
}
}
