package football;

/**
 * This class will manage the data for the team. From here we are going
 * to organize everything in lists.
 * Here we are going to read and write to a file.
 * @authors Mahonrry and Leonidas
 *
 */
public class Team {
	
	//declare all variables
	private String name;
	private String city;
	private String country;
	
	/**
	 * Default Constructor
	 */
	public Team() {
		// empty constructor
	}
	
	/**
	 * Constructor
	 * @param name
	 * @param city
	 * @param country
	 */
	public Team(String name, String city, String country) {
		this.name = name;
		this.city = city;
		this.country = country;
	}	
	
	
	
	/**
	 * This is a method for changing the status of a player 
	 * from Starter to Reserve (and vice versa)
	 * The method uses the jersey number as the ID of the player. 
	 * @param jerseyNumber
	 */
	
	 public void changeStatus(int jerseyNumber) {
	 
		
		// Generates a local variable boolean for handling the change
		boolean currentStatus = true;
		
		// Stores the number of the jersey of the player that must be changed
		int currentPlayer = jerseyNumber;		
		
		// reads the current status of the player based on it's jersey number			
		// Loop through our Players list to check whether there is any player
		// with the jersey number of the "currentPlayer"
		for(int i=0; i<99; i++) {
			
			Player player2 = null;
			Player player = player2.get(i);
			if ( player.getNumber() == currentPlayer) {
				player.setCurrentStatus(! player.getCurrentStatus());
			}
			
			
			if( i == currentPlayer ) {
				
				
				currentStatus = Player.isStarter();
			}
		}
		
		// "if statement" that will switch the current status
		// if the player is a starter he will become a reserve
		// if the player is a reserve he will become a starter		
		if (currentStatus = true) {
			// Select the player by jersey
			
			
			// Change status to False (reserve)
			Player.setStarter(false);
		} else {
			// Select the player by jersey
			
			
			// Change status to True (starter)
			Player.setStarter(true);
		}		
		
	}	
	
	/**
	 * @return the Team's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the Team's city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the Team's country
	 */
	public String getCountry() {
		return country;
	}	
	
}
