package p1;

public class B {
	public static void main(String[] args) {
		// If not using import stat everytime we have to write the packageName.<calss-name> to members of C
		new p2.C().test();
		new p2.C().test();
		System.out.println(new p2.C().j);
	}
}
