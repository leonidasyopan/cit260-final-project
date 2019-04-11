package football.menu;

/**
 * Menu class for the use of Menu objects
 * @author Mahonrry and Leonidas 
 *
 */
public class MenuItem {
	
	// Setting parameters
	private char key;
	private String text;
	
	/**
	 * Main constructor
	 * @param key
	 * @param text
	 */
	public MenuItem (char key, String text) {
		this.key = key;
		this.text = text;
	}
	
	/**
	 * Accessor
	 * @return
	 */
	public char getKey() {
		return key;
	}
	
	/**
	 * Accessor
	 * @return
	 */
	public String getText() {
		return text;
	}
	
	
}
