package multipleinterfaceinheritance;

/*
 * what are interfaces?? 
 * interfaces are 100% abstrat , all the methods by default in an interface are public and abstrract , if 
 * a var created, it is public, static and final0, we cannot create object of interface but can create 
 * refernce var of an interface , interface supports multiple inheritance but classes not support 
 * multiple inheritance
 */

/*
 * what is inheritanc?? 
 * when we talk about inheritance we are inheriting non-static members of the parent class into the child object, 
 * static members in inheritance are not inherited but hey give us a feel of inheritance coz of consversion 
 * takes palce while you're calling a static member out therer
 */
/* overriding?? 
 * when inheritance happens only then overriding is ideally possible , 
 * overring hepls us to modify inherited members of their
 */
public class C extends B implements A, D {

	@Override
	public void test1() {
		System.out.println("From test1");
	}

	@Override
	public void test3() {
		System.out.println("From test3");
	}

	public static void main(String[] args) {
		C c1 = new C();
		c1.test1();
		c1.test2();
	}

}
