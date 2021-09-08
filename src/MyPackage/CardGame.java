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
	public int count=0;
	

	
	CardGame(){//constructor to intialize values
		suit=new String[]{"Clubs", "Diamonds", "Hearts", "Spades"};
		rank=new String[]{"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		
	}

	
	
	
	
}
