package finalkeyword;

public class S extends R{
/* public void test() { //ERROR as override not possible as inherited method is declared final
	System.out.println("From test overrided");
}*/

public static void main(String[] args) {
	S s1 = new S();
	s1.test();
}
}
