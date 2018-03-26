/**
 * This is a class that plays the GUI version of the Elevens game.
 * See accompanying documents for a description of how Elevens is played.
 */
public class ElevensGUIRunner {

	/**
	 * Plays the GUI version of Elevens.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
    	System.out.println("Tyler An, Period: 2, 3/23/2018, Computer #37");
		Board board = new ElevensBoard();
		CardGameGUI gui = new CardGameGUI(board);
		gui.displayGame();
	}
}
