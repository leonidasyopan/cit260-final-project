package football.menu;

import football.Midfielder;

/**
 * This is the Menu responsible for handling the options
 * for the Midfielder Players.
 * It extends the Menu Class
 * @author Mahonrry and Leonidas 
 *
 */
public class MidfieldersMenu extends Menu {	
	
	/**
	 * Default constructor. Does nothing.
	 */
	public MidfieldersMenu() {
		super();
	}
		
	/**
	 * Provide the Menu title (or null to skip it).
	 * @return
	 */
	@Override
	protected String getTitle() {
		return "MIDFIELDERS MENU";
	}
	
	/**
	 * Provide the Menu description (or null to skip it).
	 * @return
	 */
	@Override
	protected String getDescription() {
		return "This is the Menu for the Midfielders.";
	}
	
	/**
	 * Provide the list of menu items.
	 * @return
	 */
	@Override
	protected MenuItem[] getMenuItems() {
		return new MenuItem[] {
				new MenuItem('1', "List Players"),
				new MenuItem('2', "Change Starters"),
				new MenuItem('R', "Return to Main Menu")
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
        	printPlayers(Midfielder.class);
            break;
        case '2':
        	promptChage();
            break;
            
        case 'R':
            return false;
            
        default:
            System.out.println("Invalid Entry");
        
    }
		
		return true;
	}

}
