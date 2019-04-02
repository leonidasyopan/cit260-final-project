package football;

public class Goalkeeper extends Player {	
	
	public Goalkeeper() {
		
	}
	
	public Goalkeeper(String name, String country, int number, boolean starter) {
		
	}

	@Override
    public String pass() {
        return "Long Pass!";
    }
	
	public boolean useHands() {
		
		return true;
	}

}
