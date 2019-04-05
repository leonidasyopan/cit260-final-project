package football.menu;

public class DefendersMenu extends Menu {	
	
	/**
	 * Default constructor. Does nothing.
	 */
	public DefendersMenu() {
		super();
	}
		
	/**
	 * Provide the Menu title (or null to skip it).
	 * @return
	 */
	@Override
	protected String getTitle() {
		return "DEFENDERS MENU";
	}
	
	/**
	 * Provide the Menu description (or null to skip it).
	 * @return
	 */
	@Override
	protected String getDescription() {
		return "This is the Menu for the Defenders.";
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
            System.out.println(" ");
            break;
        case '2':
            System.out.println(" ");
            break;
            
        case 'R':
            return false;
            
        default:
            System.out.println("Invalid Entry");
        
    }
		
		return true;
	}

}
