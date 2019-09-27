package constructors;

public class Eight7 {
	
	public Eight7() {
		Eight7 e7 = new Eight7(); // ERROR as can't create object in custroctor using the same custructor
									// but can use different constructor to create object in another constructor e.g NEXT
	}

	public static void main(String[] args) {
		Eight7 e8 = new Eight7(); // StackOverflow
	}
}
