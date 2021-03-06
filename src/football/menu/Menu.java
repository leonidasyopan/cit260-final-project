package football.menu;

import java.util.ArrayList;
import java.util.Scanner;

import football.Player;
import football.Team;
import football.TeamDatabase;

/**
 * This is the base Menu class.
 * It's responsible for the most important methods related 
 * to all the menu options.
 * @author Mahonrry and Leonidas 
 *
 */
public abstract class Menu {
	
	// We declare this as static so all of the Menu
    // objects we might create will share this one
    // variable. That way we don't create a lot of
    // different Scanner objects in our application.
    private static Scanner scanner;
    
    // This is a static initializer. It's like a constructor
    // for the class itself. It gets called when the class
    // is first loaded into memory. We'll initialize our scanner
    // in here.
    static {
        scanner = new Scanner(System.in);
    }
	
	/**
	 * Main Constructor | Empty
	 */
	protected Menu() {
		// empty constructor
	}
	
	/**
	 * Provide the Menu title (or null to skip it).
	 * @return
	 */
	protected abstract String getTitle();
	
	/**
	 * Provide the Menu description (or null to skip it).
	 * @return
	 */
	protected abstract String getDescription();
	
	/**
	 * Provide the list of menu items.
	 * @return
	 */
	protected abstract MenuItem[] getMenuItems();
	
	/**
	 * Handle the user's menu selection.
	 * @param key
	 * @return false if the menu should exit and return to whatever call it.
	 */
	protected boolean handleMenuSelection(char key) {
		return false;
	}
	
	
	/**
	 * The menu loop. When this method ends the menu is closed and returns to whatever called it.
	 */
	public void display() {
		
		boolean keepGoing = true;
		
		while (keepGoing == true) {
			// print the title
			String title = getTitle();
			if(title != null) {
				System.out.println( title );
				System.out.println();
			}			
			
			// print the description
			String description = getDescription();
			if(description != null) {
				System.out.println( description );
				System.out.println();
			}
			
			// print the menu items
			MenuItem[] menuItems = getMenuItems();
			if ( menuItems == null ) {
				System.out.println("Programmer error.");
				break;
			}
			
			for ( MenuItem item : menuItems) {
				System.out.printf("%c - %s%n", item.getKey(), item.getText());
			}
			
			System.out.println();
			
			// prompt the user and get the menu choice
			String userInput = prompt("Your choice: ");
			
			// process the menu choice
			if ( userInput != null && userInput.length() > 0 ) {
				keepGoing = handleMenuSelection(userInput.charAt(0));
			}
			
			System.out.println();
			
		}
	}
	
	
	/**
     * Print out the players based on their position
     * @param playerClass
     */
    protected void printPlayers(Class<?> playerClass) {

        boolean somethingPrinted = false;

        for (Player player : TeamDatabase.getSquad()) {
            if (playerClass.isInstance(player)) {
                System.out.println(player.toString());
                somethingPrinted = true;
            }
        }

        if (somethingPrinted == false) {
            System.out.printf("We don't currently have any %ss.%n", playerClass.getSimpleName());
        }
    }
    
    
    /**
     * This is the method to prompt the user for the jersey number
     * in order to change the Status of a Specific player.
     */
	public void promptChage() {
		// Prompt the user for the number
		String userPlayer = prompt("Type the Number of the Player you want to change the status: ");

		// Brings the Squad with the list of players into scope
		ArrayList<Player> squad = TeamDatabase.getSquad();
		
		// Creates a String variable to store the result of the changeStatus method
		String resultChange = Team.changeStatus(Integer.parseInt(userPlayer), squad);
		
		// Prints out the result to screen.
		System.out.println(resultChange);
	}

	
	/**
	 * Prompt the user for input and return whatever they type. The user must hit Enter before the value is returned.
	 * @param message
	 * @return the user's typed value
	 */
	public static String prompt(String message) {
		
			System.out.print(message);
			String input = scanner.nextLine();
			return input.trim();
		
	}

	/**
	 * Pause the program for the specified number of milliseconds
	 * @param milliseconds
	 */
	public static void delay(long milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (Exception e) {
			// do nothing
		}
	}

}
