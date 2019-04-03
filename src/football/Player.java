package football;

/**
 * Base class of all players in our program.
 */
public abstract class Player {
	
	private String name;
	private String country;
	private int number;
	private boolean starter;
	
    /** 
     * Default Constructor
     * The players name will default to null.
     */
	public Player() {
		
	}
	
	/**
	 * Constructor
	 * @param name
	 * @param country
	 * @param number
	 * @param starter
	 */
	public Player (String name, String country, int number, boolean starter) {
		
	}
	
	/**
	 * 
	 * @return
	 */
	public abstract String pass();	
	
	
	/**
	 * @return the starter
	 */
	public boolean isStarter() {
		return starter;
	}
	
	/**
	 * @param starter the starter to set
	 */
	public void setStarter(boolean starter) {
		this.starter = starter;
	}
	
	/**
	 * @return the Player's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the Player's name
	 * @param name
	 */
	
    public void setName(String name) {
        this.name = name;
    }
	
	/**
	 * @return the Player's country
	 */
	public String getCountry() {
		return country;
	}
	
	/**
     * Set the Player's country
     */
    public void setCountry(String country) {
        this.country = country;
    }
	
	/**
	 * @return the Player's number
	 */
	public int getNumber() {
		return number;
	}	
	
	/**
     * Set the Player's number
     */
    public void setNumber(int number) {
        this.number = number;
    }

}
