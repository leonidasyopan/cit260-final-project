package football.menu;

import football.TeamDatabase;
import football.Player;

/**
 * This is the Main Menu
 * It's responsible for the most important options of the program.
 * Including listing all the players and printing to an external file.
 * It extends the Menu Class
 * @author Mahonrry and Leonidas 
 *
 */
public class MainMenu extends Menu {	
	
	/**
	 * Default constructor. Does nothing.
	 */
	public MainMenu() {
		super();
	}
		
	/**
	 * Provide the Menu title (or null to skip it).
	 * @return
	 */
	@Override
	protected String getTitle() {
		return "BARCELONA FOOTBALL CLUB";
	}
	
	/**
	 * Provide the Menu description (or null to skip it).
	 * @return
	 */
	@Override
	protected String getDescription() {
		return "This is the main menu of the program.";
	}
	
	/**
	 * Provide the list of menu items.
	 * @return
	 */
	@Override
	protected MenuItem[] getMenuItems() {
		return new MenuItem[] {
				new MenuItem('1', "Goalkeepers"),
				new MenuItem('2', "Defenders"),
				new MenuItem('3', "Midfielders"),
				new MenuItem('4', "Attackers"),
				new MenuItem('5', "List Complete Squad"),
				new MenuItem('6', "Print Squad"),
				new MenuItem('Q', "Quit Program")
		};
	}
	
	/**
	 * Handle the user's menu selection.
	 * @param key
	 * @return false if the menu should exit and return to whatever call it.
	 */
	@Override
	protected boolean handleMenuSelection(char key) {
		
		switch (Character.toUpperCase(key)) {
        case '1': 
        	Menu goalkeepersMenu = new GoalkeepersMenu();
            goalkeepersMenu.display();
            break;
        case '2':
        	Menu defendersMenu = new DefendersMenu();
        	defendersMenu.display();
            break;
        case '3':
        	Menu midfieldersMenu = new MidfieldersMenu();
        	midfieldersMenu.display();
            break;
        case '4':
        	Menu attackersMenu = new AttackersMenu();
        	attackersMenu.display();
            break;
        case '5':
        	System.out.println(" ");
        	System.out.println("COMPLETE SQUAD");
        	System.out.println(" ");
        	printPlayers(Player.class);
            break;
        case '6':
        	TeamDatabase.storeSquad();
        	System.out.println("File has been properly Printed to a TXT File.");
            break;
        case 'Q':
            return false;
            
        default:       	
        	System.out.println("Invalid Entry");
        
    }
		
		return true;
	}

}
