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
	 * Default Constructor
	 */
	public Team() {
		// empty constructor
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
	 * This is a method for changing the status of a player from Starter to Reserve
	 * (and vice versa) The method uses the jersey number as the ID of the player.
	 * @param jerseyNumber
	 * @param squad
	 */
	public static String changeStatus(int jerseyNumber, ArrayList<Player> squad) {

		// Bring the Squad to scope
//		ArrayList<Player> squad = TeamDatabase.getSquad();
		
		// Create a variable to store the result of the change
		String resultChange = null;

		// Stores the number of the jersey of the player that must be changed
		int currentPlayer = jerseyNumber;

		// reads the current status of the player based on it's jersey number
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
					resultChange = "Player " + player.getName() + " is now a Reserve";
				} else {
					// Change status to True (starter)
					player.setStarter(true);
					resultChange = "Player " + player.getName() + " is now a Starter";
				}
			}
		}
		
		return resultChange;
		
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

	/**
	 * @param name to set the name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param city to set the city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @param country to set the country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

}
