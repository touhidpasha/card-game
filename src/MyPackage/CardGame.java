package MyPackage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//import com.sun.tools.javac.code.Attribute.Array;

/*this class is common
 * for all the players
 * each player will get his unique cards
 */

public class CardGame {
	
	public String[] rank;
	public String[] suit;
	public Set<String> cards = new HashSet<String>();
	public Set<Integer> values = new HashSet<Integer>();
	public String players[][];
	
	String[] cardsArray;
	

	
	CardGame(){//constructor to intialize values
		suit=new String[]{"","Clubs", "Diamonds", "Hearts", "Spades"};
		rank=new String[]{"","2","3","4","5","6","7","8","9","10","Jack","queen","King","ace"};
		
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
			System.out.println("player "+(i+1)+" cards are");
			for(int j=0;j<(13);j++)
			{
				System.out.print(players[i][j]+"  ");
				
			}
			System.out.println("\n");
			
		}
		
	}
	

	public void displayEachPlayerCardsBasedOnRank(int numberOfPlayers) {
		
		//players.
		String[] arr=new String[20];
		for(int i=0;i<numberOfPlayers;i++)
		{
			for(int j=0;j<rank.length-1;j++) {
				arr[j]=players[i][j];
			}
			//Arrays.sort(arr);
			for(int i1=0;i1<rank.length-1;i1++) 
				for(int j1=i1+1;j1<rank.length-1;j1++) {
					if(arr[i1].compareTo(arr[j1])<1) {
						String t=arr[i1];
						arr[i1]=arr[j1];
						arr[j1]=t;
						
						
					}
				}
			System.out.println("player "+(i+1)+ " cards after sorting");
			for(int j=0;j<rank.length-1;j++) 
				System.out.print(arr[j]+" ");
			System.out.println("\n");
			
		}
		
		
		
	}
	
	
}

