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
		// empity constructor
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
	 * 
	 * @return the goal keepers list
	 */
	public ArrayList<Goalkeeper> listGoalkeeper() {
		
		ArrayList<Goalkeeper> goalkeeperList = new ArrayList<>();
		new Goalkeeper("Marc-André Ter Stegen", "Germany" , 1, false);
		new Goalkeeper("Jasper Cillessen", "Netherlands", 13, false);
		return goalkeeperList;
	}
	
	/** 
	 * @return the defenders list
	 */
	public ArrayList<Defender> listDefender() {
		
		ArrayList<Defender> defenderList = new ArrayList<>();
		new Defender("Samuel Umtity", "France" , 23, false);
		new Defender("Clément Lenglet", "France" , 15, false);
		new Defender("Gerard Piqué", "Spain" , 3, false);
		new Defender("Jeison Murillo", "Colombia" , 17, false);
		new Defender("Jean Claire Todibo", "France" , 6, false);
		new Defender("Thomas Vermaelen", "Germany" , 24, false);
		new Defender("Jordi Alba", "Spain" , 18, false);
		new Defender("Sergi Roberto", "Spain" , 20, false);
		new Defender("Nelson Semedo", "Portugal" , 2, false);
		return defenderList;
	}
	
	/**
	 * @return the Midfielders list
	 */
	public ArrayList<Midfielder> listMidfielder() {
		
		ArrayList<Midfielder> midfielderList = new ArrayList<>();
		new Midfielder("Sergio Busquets", "Spain" , 5, false);
		new Midfielder("Arthur", "Brazil" , 8, false);
		new Midfielder("Ivan Rakitic", "Croatia" ,4, false);
		new Midfielder("Carles Aleñá", "Spain" , 21, false);
		new Midfielder("Arturo Vidal", "Chile" , 22, false);
		new Midfielder("Rafinha", "Spain" ,12, false);
		new Midfielder("Philippe Coutinho", "Brazil" , 7, false);
		return midfielderList;
	}
	
	/**
	 * @return the Attackers  list
	 */
	public ArrayList<Attacker> listAttacker() {
		
		ArrayList<Attacker> attackerList = new ArrayList<>();
		new Attacker("Ousmane Dembélé", "France" , 11, false);
		new Attacker("Lionel Messi", "Argentina" , 10, false);
		new Attacker("Malcolm", "Brzil" , 14, false);
		new Attacker("Luis Suárez", "Uruguay" , 9, false);
		new Attacker("Kevin-Prince Boateng", "Ghana" , 19, false);
		return attackerList;
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
			
			Player player = player.get(i);
			if ( player.getNumber() == currentPlayer) {
				player.setCurrentStatus(! player.getCurrentStatus());
			}
			
			
			if( i = currentPlayer ) {
				
				
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
