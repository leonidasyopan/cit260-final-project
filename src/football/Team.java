package football;

import java.util.ArrayList;

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
		
	}
	
	/**
	 * Constructor
	 * @param name
	 * @param city
	 * @param country
	 */
	public Team(String name, String city, String country) {
		
	}	
	
	/**
	 * 
	 * @return the goal keepers list
	 */
	public ArrayList<Goalkeeper> listGoalkeeper() {
		
		ArrayList<Goalkeeper> goalkeeperList = new ArrayList<>();
		return goalkeeperList;
	}
	
	/** 
	 * @return the defenders list
	 */
	public ArrayList<Defender> listDefender() {
		
		ArrayList<Defender> defenderList = new ArrayList<>();
		return defenderList;
	}
	
	/**
	 * @return the Midfielders list
	 */
	public ArrayList<Midfielder> listMidfielder() {
		
		ArrayList<Midfielder> midfielderList = new ArrayList<>();
		return midfielderList;
	}
	
	/**
	 * @return the Attackers  list
	 */
	public ArrayList<Attacker> listAttacker() {
		
		ArrayList<Attacker> attackerList = new ArrayList<>();
		return attackerList;
	}
	
	/**
	 * @return true for starters and false for reserve 
	 */
	public boolean changeStatus() {
		
		boolean starter = true;
		
		// reads the current status of a player based on it's jersey number
		
		
		// if statement that will switch the current status
		// if the player is a starter he will become a reserve
		// if the player is a reserve he will become a starter
		
		return starter;
	}
	
	/**
	 * Store the squad in an Array List and save it to a file
	 * @param squad
	 */
	public void storeSquad(ArrayList<Player> squad) {
		
	}
	
	/**
	 * Load the player's squad from a file
	 * @return
	 */
	public ArrayList<Player> loadSquad() {		
		
		ArrayList<Player> squad = new ArrayList<>();
		return squad;
		
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
