package football;

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
	 * 
	 * @return
	 */
	public boolean score() {
		return true;
	}

}
