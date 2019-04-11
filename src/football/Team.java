package football;

import java.util.ArrayList;

/**
 * This class will manage the data for the team. From here we are going to
 * organize everything in lists. Here we are going to read and write to a file.
 * 
 * @authors Mahonrry and Leonidas
 *
 */
public class Team {

	// declare all variables
	private String name;
	private String city;
	private String country;

	/**
	 * Empty Constructor
	 * Default Constructor
	 */
	public Team() {
	
	}

	/**
	 * Constructor
	 * 
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
	 * This method change the status of a player from Starter to Reserve
	 * (and vice versa) The method uses the jersey number as the ID of the player.
	 * @param jerseyNumber
	 * @param squad
	 */
	public static String changeStatus(int jerseyNumber, ArrayList<Player> squad) {

		// Bring the Squad to scope
		// ArrayList<Player> squad = TeamDatabase.getSquad();
		
		// Create a variable to store the result of the change
		String resultChange = null;

		// Stores the number of the jersey of the player that must be changed
		int currentPlayer = jerseyNumber;

		// Reads the current status of the player based on it's jersey number
		// Loop through our Players list to check whether there is any player
		// with the jersey number of the "currentPlayer"
		for (Player player : squad) {			
			if (player.getNumber() == currentPlayer) {
				
				// Generates a local variable boolean for handling the change
				boolean currentStatus = player.isStarter();
				
				// "if statement" that will switch the current status
				// if the player is a starter he will become a reserve
				// if the player is a reserve he will become a starter
				if (currentStatus == true) {					
					// Change status to False (reserve)
					player.setStarter(false);
					resultChange = player.getName() + " is now a Reserve";
				} else {
					// Change status to True (starter)
					player.setStarter(true);
					resultChange = player.getName() + " is now a Starter";
				}
			}
		}
		
		return resultChange;		
	}

}
