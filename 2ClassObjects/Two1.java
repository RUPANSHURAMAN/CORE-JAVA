package appjava1;

public class Two1 {
	int i = 10;// copies = objects created // non-static member=object member=instance var
	static int j = 20;// belongs to class common memory / one copy // to access <clas-name>.member_name
	int k = 40;
	public static void main(String[] args) {//w/o main can't run
		Two1 t1 = new Two1();
		System.out.println(t1.i);
		System.out.println(t1.k);
	}
}
