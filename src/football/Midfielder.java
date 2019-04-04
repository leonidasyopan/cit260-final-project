package football;

/*
 * This class manage all data for the players who play in the 
 * midfielder position 
 */
public class Midfielder extends Player {
	
	/**
	 * Default constructor
	 */
	public Midfielder() {
		
	}
	
	/**
	 * Constructor
	 * @param name
	 * @param country
	 * @param number
	 * @param starter
	 */
	public Midfielder(String name, String country, int number, boolean starter) {
		
	}
	
	/**
	 * Return the characteristic "Push Pass"
	 */
	@Override
    public String pass() {
        return "Push Pass!";
    }
	
	/**
	 * 
	 *@return an specific action for midfielders: assist
	 */
	public boolean assist() {
		
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
