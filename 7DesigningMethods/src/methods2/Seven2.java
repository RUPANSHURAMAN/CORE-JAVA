package methods2;
//MEDIOCRE
public class Seven2 {
	public static void main(String[] args) {
		Seven2 s2 = new Seven2();
		s2.test1();
	}

	public void test1() {
		return; // should be not written as written by compiler, why take the risk // return
				// keyword returns the control
		// System.out.println("test"); //ERROR as unrachable
		// UNREACHABLE CODE the code can't be reached
	}
}