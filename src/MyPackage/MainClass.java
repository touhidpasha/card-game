package MyPackage;

public class MainClass {
public static void main(String args[]) {
	CardGame game=new CardGame();
	Players players=new Players(4);//setting players count 4
		//game.printCards();
		game.shuffle(players.numberOfPlayers);
		game.printCards();
	}
}
