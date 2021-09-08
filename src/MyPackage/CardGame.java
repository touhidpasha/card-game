package MyPackage;

import java.util.HashSet;
import java.util.Set;

/*this class is common
 * for all the players
 * each player will get his unique cards
 */

public class CardGame {
	
	public String[] rank;
	public String[] suit;
	public Set<String> cards = new HashSet<String>();
		
	

	
	CardGame(){//constructor to intialize values
		suit=new String[]{"","Clubs", "Diamonds", "Hearts", "Spades"};
		rank=new String[]{"","2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		
	}

	public void shuffle(int numberOfPlayers) {
		
		    while((cards.size()<(numberOfPlayers*13))) 
		    {
		        int row=((int) ((Math.random() * (5 - 1)) + 1));
		        int column=((int) ((Math.random() * (14 - 1)) + 1));
		       
		        cards.add(String.valueOf(row+"+"+column));
		    }
		    //System.out.print(cards);
		}
	
  

	public void printCards() {
		System.out.print(cards.size());
		System.out.print(cards);
	}
	
	
	
}

