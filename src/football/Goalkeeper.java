package football;

/*
 * This class manage all data for the players who play in the 
 * goal keeper position 
 */
public class Goalkeeper extends Player {	
	
	/**
	 * Default Constructor
	 */
	public Goalkeeper() {
		
	}
	
	/**
	 * Constructor
	 * @param name
	 * @param country
	 * @param number
	 * @param starter
	 */
	public Goalkeeper(String name, String country, int number, boolean starter) {
		
	}
	
	/**
	 * Return the characteristic "Long Pass"
	 */
	@Override
    public String pass() {
        return "Long Pass!";
    }
	
	/**
	 * 
	 * @return an specific action for goal keepers: Use hands
	 */
	public boolean useHands() {		
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
