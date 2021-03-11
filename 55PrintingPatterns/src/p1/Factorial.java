package p1;

public class Factorial {
public static void main(String[] args) {
	int number = 5;
	
	//Main logic start----
	int result = 1;
	while (number>0) {
		result = result * number--;
	}
	//Main logic end
	
	System.out.println(result);
}
}
