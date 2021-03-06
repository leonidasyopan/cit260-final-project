package football;

/*
 * This class manage all data for the players who play in the 
 * defender position 
 * @authors Mahonrry and Leonidas
 */
public class Defender extends Player {
	
	/**
	 * Default Constructor
	 */
	public Defender() {
		super();
	}
	
	/**
	 * Constructor
	 * @param name
	 * @param country
	 * @param number
	 * @param starter
	 */
	public Defender(String name, String country, int number, boolean starter) {
		super(name, country, number, starter);
	}
	
	/**
	 * Return the characteristic "Backward Pass"
	 */
	@Override
    public String pass() {
        return "Backward Pass!";
    }
	
	/**
	 * @return an specific action for defenders: tackle
	 */
	public boolean tackle() {		
		return true;
	}
	
	/**
     * toString() override
     */
    @Override
    public String toString() {
        return String.format("DEFENDER:     %s", super.toString());        
    }
	
}
