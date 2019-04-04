package football;

import java.util.ArrayList;

public class Team {

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
	
	public ArrayList<Goalkeeper> listGoalkeeper() {
		
		ArrayList<Goalkeeper> goalkeeperList = new ArrayList<>();
		return goalkeeperList;
	}
	
	
	public ArrayList<Defender> listDefender() {
		
		ArrayList<Defender> defenderList = new ArrayList<>();
		return defenderList;
	}
	
	public ArrayList<Midfielder> listMidfielder() {
		
		ArrayList<Midfielder> midfielderList = new ArrayList<>();
		return midfielderList;
	}
	
	public ArrayList<Attacker> listAttacker() {
		
		ArrayList<Attacker> attackerList = new ArrayList<>();
		return attackerList;
	}
	
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}	
	
}
