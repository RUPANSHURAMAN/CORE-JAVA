//while overring of you are increasing the scope of access specifier then it will not give any error // default can never be inherited in different package // public--->protected--->default--->private //when default inherit can't happen in different package //overring depends on access specifier //pubic inherit any package //private caan't be inherited //protected same package different package // if you increase scope its fine inherit
public class A3 {

	//ERROR: if private 
	protected void test1() {
	System.out.println("A");
}
//default to public overrided to increase scope 
void test2() {
	System.out.println("A2");
}
}
