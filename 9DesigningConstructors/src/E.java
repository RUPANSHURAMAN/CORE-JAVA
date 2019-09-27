
public class E {
int i = 10;
E(){
	System.out.println("E");
}

public static void main(String[] args) {
	System.out.println(new E().i); //mem address can be only once used and either a method or a var can be accessed once
}
}
