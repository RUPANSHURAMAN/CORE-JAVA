
public class GoldAccount extends SilverAccount{
	@Override
	public void chqBooks() {
		System.out.println("unlimited chq books");
	}
	
	public static void main(String[] args) {
		GoldAccount g1 = new GoldAccount();
		g1.chqBooks();
		g1.phBanking();
		g1.atmCard();
		
		System.out.println("-----");
		
		SilverAccount s1 = new SilverAccount();
		s1.chqBooks();
		s1.phBanking();
		s1.atmCard();
	}
}
