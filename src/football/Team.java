package football;

import java.util.ArrayList;
import java.util.Scanner;

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
	
	/**
	 * 
	 * @param squad
	 */
	public void storeSquad(ArrayList<Player> squad) {
		
	}
	
	/**
	 * 
	 * @return
	 */
	public ArrayList<Player> loadSquad() {		
		
		ArrayList<Player> squad = new ArrayList<>();
		return squad;
		
	}
	
	/**
	 * 
	 * @param scanner
	 * @return
	 */
	private Goalkeeper readGoalkeeper(Scanner scanner) {
		 
		 return new Goalkeeper();
	 }
	
	 /**
	  * 
	  * @param scanner
	  * @return
	  */
	 private Defender readDefender(Scanner scanner) {		 
		 
		 return new Defender();
	 }
	 
	 /**
	  * 
	  * @param scanner
	  * @return
	  */
	 private Midfielder readMidfielder(Scanner scanner) {
		 
		 return new Midfielder();
	 }
	 
	 /**
	  * 
	  * @param scanner
	  * @return
	  */
	 private Attacker readAttacker(Scanner scanner) {
		 
		 return new Attacker();
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
