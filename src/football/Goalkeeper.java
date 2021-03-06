package football;

/*
 * This class manage all data for the players who play in the 
 * goal keeper position 
 * @authors Mahonrry and Leonidas
 */
public class Goalkeeper extends Player {	
	
	/**
	 * Default Constructor
	 */
	public Goalkeeper() {
		super();
	}
	
	/**
	 * Constructor
	 * @param name
	 * @param country
	 * @param number
	 * @param starter
	 */
	public Goalkeeper(String name, String country, int number, boolean starter) {
		super(name, country, number, starter);
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
    	return String.format("GOALKEEPER:   %s", super.toString());     
    }

}
