package MyPackage;
/*this class is common
 * for all the players
 * each player will get his unique cards
 */

public class CardGame {
	//Player[] players=new Player[4];//4 players are participating 
	
	public String[] rank;
	public String[] suit;
	 
	

	
	CardGame(){//constructor to intialize values
		suit=new String[]{"Clubs", "Diamonds", "Hearts", "Spades"};
		rank=new String[]{"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		
	}

	
	public void printCards() {
		
		System.out.println("printing  suit {");
		for(int i=0;i<suit.length;i++) {
		System.out.print(suit[i]+" ,");}
		System.out.println("}");
		
		System.out.println("printing rank  {");
		for(int i=0;i<rank.length;i++) {
			System.out.print(rank[i]+" ,");}
		System.out.println("}");
		
		
	}
	
	
}
