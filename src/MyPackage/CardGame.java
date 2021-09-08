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
	public String players[][];
		
	

	
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
	
  
	public void distributeCards(int numberOfPlayers) {
		players=new String[numberOfPlayers][13];//here each row will contain players and column will contain cards for each of one
		String[] cardsArray = cards.toArray(new String[cards.size()]);//converting set to array
		int k=0;
		for(int i=0;i<(numberOfPlayers);i++)
		for(int j=0;j<(13);j++)
		{
			
			players[i][j]=cardsArray[k];
		}
			}

	/*public void printCards() {
		System.out.print(cards.size());
		System.out.print(cards);
		for(int i=0;i<cardsArray.length;i++)
		System.out.println(cardsArray[i]);

	}*/
	
	
	
}

