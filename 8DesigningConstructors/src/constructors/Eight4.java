package constructors;
//MEDIOCRE
public class Eight4 {
	Eight4(int x) {
		System.out.println(x);// 100 //2
	}

	public static void main(String[] args) {
		Eight4 e4 = new Eight4(100);// 1
		System.out.println("From main");// 3
	}
}
