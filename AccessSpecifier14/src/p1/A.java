package p1;
/*
 * Q. Can a class be made private?
 * A. NO, ONLY public(or default), abstract and final is permitted to a class
 * 
 * 	  * If you make a class as private or protected it will give error as they are not supported on 
 * 	  class
 *    * So, a class can only be public or default
 *    * If class is made public, then it can be used anywhere in any package e.g. below
 * 
 */
public class A {
	
}

/*final public class A { //final public can be
	
}*/

/*abstract final class H{ //ERROR as class can be either abstract or final

}*/


/*private class B { //ERROR: Illegal modifier used ONLY public(or default), abstract and final is permitted 
	
}*/

class C { //NO ERROR as default permitted
	
}

/*protected class D {//ERROR: Illegal modifier used ONLY public(or default), abstract and final is permitted
	
}*/

/*static class E{//ERROR: Illegal modifier used ONLY public(or default), abstract and final is permitted
	
}*/

abstract class F{
	
}

final class G{
	
}

/*final public class I{ //ERROR as public class should be in own file so class A can be public and final both
	
}*/