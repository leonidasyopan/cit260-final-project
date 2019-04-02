package football;

public class Attacker extends Player {
	
	public Attacker() {
		
	}
	
	public Attacker(String name, String country, int number, boolean starter) {
		
	}

	@Override
    public String pass() {
        return "Piercing Pass!";
    }
	
	public boolean score() {
		
		return true;
	}

}
