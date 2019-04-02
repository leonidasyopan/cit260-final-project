package football;

public abstract class Player {
	
	private String name;
	private String country;
	private int number;
	private boolean starter;
	
	public Player() {
		
	}
	
	public Player (String name, String country, int number, boolean starter) {
		
	}

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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}	

}
