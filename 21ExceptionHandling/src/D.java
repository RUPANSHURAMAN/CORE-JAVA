
public class D {
static D d1;
int i =10;
D(D d2){
	System.out.println(d2.i); //NPE exception as in main() object forst created which generates exception heree
}

public static void main(String[] args) {
	d1 = new D(d1);
}
}
