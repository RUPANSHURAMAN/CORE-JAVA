package p1;

/*
 * Mutable objects: Mutable objects are the one whose value keeps changing.
 * 
 * Immutable objects: Immutable objects are the one whose value can never altered
 * 
 * RULES TO DESIGN IMMUTABLE CLASS:
 * 		1. Make class [final].
 * 		2. Make variables [final & private]
 *  	3. Initialize variable through constructors 
 *   	4. Use only public getters and [not setters]
 *   
 */
public final class B {
	final private int i; // If not initialized then ERROR
	final private int j;
	
	public B(int i, int j) {
		this.i = i;
		this.j = j;
	}
	public int getI() {
		return i;
	}
	public int getJ() {
		return j;
	}
	
	public static void main(String[] args) {
		B b1 = new B(10, 20);
		System.out.println(b1.getI());
		System.out.println(b1.getJ());
	}
}
