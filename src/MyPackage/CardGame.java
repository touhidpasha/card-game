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
	String[] cardsArray;
	

	
	CardGame(){//constructor to intialize values
		suit=new String[]{"","Clubs", "Diamonds", "Hearts", "Spades"};
		rank=new String[]{"","2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		
	}

	public void shuffle(int numberOfPlayers) {
		
		    while((cards.size()<(numberOfPlayers*13))) 
		    {
		        int row=((int) ((Math.random() * (5 - 1)) + 1));
		        int column=((int) ((Math.random() * (14 - 1)) + 1));
		        cards.add(String.valueOf(suit[row]+"+"+rank[column]));
		    }
		    //System.out.print(cards);
		}
	
  
	public void distributeCards(int numberOfPlayers) {
		players=new String[numberOfPlayers][13];//here each row will contain players and column will contain cards for each of one
		cardsArray = cards.toArray(new String[cards.size()]);//converting set to array	
		int k=0;
		for(int i=0;i<(numberOfPlayers);i++)
		for(int j=0;j<(13);j++)
		{
			
			players[i][j]=cardsArray[k++];
		}
	}
	
	public void displayEachPlayerCards(int numberOfPlayers) {
		//cardsArray = cards.toArray(new String[cards.size()]);//converting set to array	
		int k=0;
		for(int i=0;i<numberOfPlayers;i++) {
			System.out.println("player "+i+" cards are");
			for(int j=0;j<(13);j++)
			{
				System.out.print(players[i][j]+"  ");
				
			}
			System.out.println();
		}
		
	}
	
	
	
}

