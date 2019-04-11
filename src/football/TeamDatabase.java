package football;

// Imports all packages required by our database
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * This is the Database class. It's responsible for handling 
 * everything related to receiving, storing and printing data
 * to or from an external TXT file. 
 * @author Mahonrry and Leonidas 
 *
 */
public class TeamDatabase {
	
	// Creates a constant for the name of our file
	private static final String FILEPATH = "Squad.txt";
    
	// creates an Array list for listing the whole Team Squad
    private static ArrayList<Player> squad = null;
    
    /**
     * Return the Squad database array, loading it from a file, if necessary.
     * @return
     */
    synchronized public static ArrayList<Player> getSquad() {
        
        if (squad == null) {
            loadSquad();
        }
        
        return squad;
    }	    

    
    /**
     * Write the list of players to a file
     * Each player will show: Position, Name, Number and Starter Status (Starter or Reserve)
     */
    public static void storeSquad() {   
    	
    	getSquad();
    	    	 	        
        File textFile = new File(FILEPATH);
        
        try (PrintWriter out = new PrintWriter(new FileOutputStream(textFile))) {            
            
            for (Player player : squad) {
                out.printf("Position: %s%n", player.getClass().getSimpleName());
                out.printf("Name: %s%n", player.getName());
                out.printf("Country: %s%n", player.getCountry());
                out.printf("Number: %d%n", player.getNumber());
                out.printf("Starter: %b%n", player.isStarter());
            }
            
            out.flush();
        
        } catch (FileNotFoundException exception) {
            System.err.println("Could not find file path");
            
        } 
        
    }
    
    
    /**
     * Load a Squad from a file
     */
    public static void loadSquad() {
        
        File textFile = new File(FILEPATH);
        squad = new ArrayList<>();
        
        try (Scanner scanner = new Scanner(textFile)) {
            
            scanner.useDelimiter(Pattern.compile("[:\\n]"));
            
            while (scanner.hasNext()) {
                String key = scanner.next();
                String value = scanner.next().trim();
                
                Player player = null;
                
                if (key.equals("Position")) {
                    
                    switch(value) {
                        case "Goalkeeper":
                            player = readGoalkeeper(scanner);
                            break;
                        case "Defender":
                            player = readDefender(scanner);
                            break;
                        case "Midfielder":
                            player = readMidfielder(scanner);
                            break;
                        case "Attacker":
                            player = readAttacker(scanner);
                            break;
                        default:
                            break;
                    }
                }
                
                if (player != null) {
                    squad.add(player);
                }
            }
            
        } catch (FileNotFoundException exception) {
            System.err.println("Could not find file path");
            
        } 
        
    }
    
    
    /**
     * This is a reader for the Goalkeeper position
     * It will allow the Goalkeeper to be allocated to its correct position
     * @param scanner
     * @return
     */    
    private static  Goalkeeper readGoalkeeper(Scanner scanner) {
        
        String name = null;        
    	String country = null;
    	int number = 0;
    	boolean starter = true;
        
        for (int i=0; i < 4; i++) {
            
            String key = scanner.next();
            
            if (key.equals("Name")) {
                name = scanner.next().trim();
                
            } else if (key.equals("Country")) {
                country = scanner.next().trim();
                
            } else if (key.equals("Number")) {
                number = Integer.parseInt(scanner.next().trim());
                
            } else if (key.equals("Starter")) {
                starter = Boolean.parseBoolean(scanner.next().trim());
            }            

        }
        
        if (name == null || country == null || number < 0 ) {
            return null;
        }
        
        return new Goalkeeper(name, country, number, starter);
        
    }


    /**
     * This is a reader for the Defender position
     * It will allow the Defender to be allocated to its correct position
     * @param scanner
     * @return
     */    
    private static Defender readDefender(Scanner scanner) {
        
        String name = null;        
    	String country = null;
    	int number = 0;
    	boolean starter = true;
        
        for (int i=0; i < 4; i++) {
            
            String key = scanner.next();
            
            if (key.equals("Name")) {
                name = scanner.next().trim();
                
            } else if (key.equals("Country")) {
                country = scanner.next().trim();
                
            } else if (key.equals("Number")) {
                number = Integer.parseInt(scanner.next().trim());
                
            } else if (key.equals("Starter")) {
                starter = Boolean.parseBoolean(scanner.next().trim());
            }            

        }
        
        if (name == null || country == null || number < 0 ) {
            return null;
        }
        
        return new Defender(name, country, number, starter);
        
    }
    
    /**
     * This is a reader for the Midfielder position
     * It will allow the Midfielder to be allocated to its correct position
     * @param scanner
     * @return
     */    
    private static Midfielder readMidfielder(Scanner scanner) {
        
    	String name = null;        
    	String country = null;
    	int number = 0;
    	boolean starter = true;
        
        for (int i=0; i < 4; i++) {
            
            String key = scanner.next();
            
            if (key.equals("Name")) {
                name = scanner.next().trim();
                
            } else if (key.equals("Country")) {
                country = scanner.next().trim();
                
            } else if (key.equals("Number")) {
                number = Integer.parseInt(scanner.next().trim());
                
            } else if (key.equals("Starter")) {
                starter = Boolean.parseBoolean(scanner.next().trim());
            }            

        }
        
        if (name == null || country == null || number < 0 ) {
            return null;
        }
        
        return new Midfielder(name, country, number, starter);
        
    }	
	
    /**
     * This is a reader for the Attacker position
     * It will allow the Attacker to be allocated to its correct position
     * @param scanner
     * @return
     */    
    private static Attacker readAttacker(Scanner scanner) {
        
        String name = null;        
    	String country = null;
    	int number = 0;
    	boolean starter = true;
        
        for (int i=0; i < 4; i++) {
            
            String key = scanner.next();
            
            if (key.equals("Name")) {
                name = scanner.next().trim();
                
            } else if (key.equals("Country")) {
                country = scanner.next().trim();
                
            } else if (key.equals("Number")) {
                number = Integer.parseInt(scanner.next().trim());
                
            } else if (key.equals("Starter")) {
                starter = Boolean.parseBoolean(scanner.next().trim());
            }             

        }
        
        if (name == null || country == null || number < 0 ) {
            return null;
        }
        
        return new Attacker(name, country, number, starter);
        
    }
    
    
}
