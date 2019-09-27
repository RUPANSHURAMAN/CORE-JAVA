
public class A7 {
int i;
{
	i = 20;
	System.out.println(i); //A7.i not needed as instance var can be directly accessed inside IIB
}

public static void main(String[] args) {
	A7 a1 = new A7();
}
}
