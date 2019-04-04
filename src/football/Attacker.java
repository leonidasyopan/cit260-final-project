package football;

/*
 * This class manage all data for the players who play in the 
 * Attacker position 
 * @authors mahonrry and leonidas
 */
public class Attacker extends Player {
	
	/**
	 * Default Constructor
	 */
	public Attacker() {
		
	}
	
	/**
	 * Constructor
	 * @param name
	 * @param country
	 * @param number
	 * @param starter
	 */
	public Attacker(String name, String country, int number, boolean starter) {
		
	}
	
	/**
	 * Return the characteristic "Piercing Pass"
	 */
	@Override
    public String pass() {
        return "Piercing Pass!";
    }
	
	/**
	 * @return an specific action for attackers: score
	 */
	public boolean score() {
		return true;
	}
	
	/**
     * toString() override
     */
    @Override
    public String toString() {
        return String.format("", super.toString());
    }

}
