package football;

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
	 * @return
	 */
	public boolean useHands() {		
		return true;
	}

}
