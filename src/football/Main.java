package football;

import football.menu.*;

/**
 * This is the Main Class, which starts the program with the Menu Options
 * @author Mahonrry and Leonidas
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		

		// Creates the Main Menu for the program
		Menu menu = new MainMenu();
		
		// Displays the Menu for the user
		menu.display();
		
		// This message would only be executed if the user exited the program
		// As the program is settup right now, we're not giving a "quit" option in the Menu.
		System.out.println("Good-bye!");

	}
}
