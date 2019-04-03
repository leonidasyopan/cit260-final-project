package football;

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
	 * @return
	 */
	public boolean assist() {
		
		return true;
	}
}
