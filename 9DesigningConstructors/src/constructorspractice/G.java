package constructorspractice;
// MEDIOCRE
public class G {

	G(){
		System.out.println("G"); //2
	}
	
	public void test() {
		System.out.println("From test"); //4
	}
	
	public static void main(String[] args) {
		new G().test();//1 //3
		System.out.println("Main"); //5
	}
}
