package football;

public class Defender extends Player {
	
	/**
	 * Default Constructor
	 */
	public Defender() {
		
	}
	
	/**
	 * Constructor
	 * @param name
	 * @param country
	 * @param number
	 * @param starter
	 */
	public Defender(String name, String country, int number, boolean starter) {
		
	}
	
	/**
	 * Return the characteristic "Backward Pass"
	 */
	@Override
    public String pass() {
        return "Backward Pass!";
    }
	
	/**
	 * 
	 * @return
	 */
	public boolean tackle() {		
		return true;
	}
}
