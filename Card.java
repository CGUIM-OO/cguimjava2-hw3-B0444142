public class Card {
	public enum Suit{Club,Diamond,Heart,Spade};
	Suit suit;
	private int rank;
	
	public Card(Suit s,int r)
	{
		suit=s;
		rank=r;
	}
	
	public void printCard(){
		System.out.println(getSuit()+","+getRank());
		
	}
	
	public Suit getSuit(){
		return suit;
	}
	
	public int getRank(){
		return rank;
	}
}
