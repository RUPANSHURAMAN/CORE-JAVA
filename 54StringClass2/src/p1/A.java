package p1;

// MUTABLE AND IMMUTABLE STRINGS
// setters and getters
public class A {
	int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		A a1 = new A();
		a1.setAge(20);
		System.out.println(a1.getAge());
	}
}
