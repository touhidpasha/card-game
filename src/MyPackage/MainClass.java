package MyPackage;
/*this is main class
 * to start game of 4 palyers
 */

public class MainClass {
	
	public static void main(String args[]) {
		CardGame[] gamers=new CardGame[4];//4 players are participating 
		
		for(int i=0;i<gamers.length;i++) {
			gamers[i]=new CardGame();
			gamers[i].printCards();//printing each player cards
	}

}
}
