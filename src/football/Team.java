package football;

import java.util.ArrayList;
import java.util.Scanner;

public class Team {

	private String name;
	private String city;
	private String country;
	
	
	public Team() {
		
	}
	
	public Team(String name, String city, String country) {
		
	}
		
	public void storeSquad(ArrayList<Player> squad) {
		
	}
	
	public ArrayList<Player> loadSquad() {		
		
		
		ArrayList<Player> squad = new ArrayList<>();
		
		return squad;
		
	}
	
	 private Goalkeeper readGoalkeeper(Scanner scanner) {
		 
		 return new Goalkeeper();
	 }
	 
	 private Defender readDefender(Scanner scanner) {		 
		 
		 return new Defender();
	 }
	 
	 private Midfielder readMidfielder(Scanner scanner) {
		 
		 return new Midfielder();
	 }

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
