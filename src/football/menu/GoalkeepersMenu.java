package football.menu;

import java.util.ArrayList;

import football.Goalkeeper;
import football.Player;
import football.Team;
import football.TeamDatabase;

public class GoalkeepersMenu extends Menu {	
	
	/**
	 * Default constructor. Does nothing.
	 */
	public GoalkeepersMenu() {
		super();
	}
		
	/**
	 * Provide the Menu title (or null to skip it).
	 * @return
	 */
	@Override
	protected String getTitle() {
		return "GOALKEEPERS MENU";
	}
	
	/**
	 * Provide the Menu description (or null to skip it).
	 * @return
	 */
	@Override
	protected String getDescription() {
		return "This is the Menu for the Goalkeepers.";
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
        	printPlayers(Goalkeeper.class);
            break;
        case '2':
        	String userPlayer = prompt("Type the Number of the Player you want to change the status: ");
    		ArrayList<Player> squad = TeamDatabase.getSquad();
        	Team.changeStatus(Integer.parseInt(userPlayer), squad);
            break;
            
        case 'R':
            return false;
            
        default:
            System.out.println("Invalid Entry");
        
    }
		
		return true;
	}

}
