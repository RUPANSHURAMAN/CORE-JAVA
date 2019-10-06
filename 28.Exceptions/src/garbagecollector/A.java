package garbagecollector;

//* Garbage collector: When many objects are created and they are not in use then JVM will auto call JAVA garbage collector to
			//clean up the unused object. But it is very difficult to predict when garbage colloector will be called 

//A programmer can call finalize() method using the stat System.gc()
//When we call finalize() method, it is a request but when JVM calls, it's a command

public class A {
	@Override
	protected void finalize() throws Throwable { // if not override then finalize is called by JVM and Throws [THROWABLE]
		System.out.println("From finalize");
	}

	public static void main(String[] args) {
		A a1 = new A();
		a1 = null;
		System.gc(); // garbage collector is called
	}
}
