package football;

public class Midfielder extends Player {
	
	public Midfielder() {
		
	}
	
	public Midfielder(String name, String country, int number, boolean starter) {
		
	}

	@Override
    public String pass() {
        return "Push Pass!";
    }
	
	public boolean assist() {
		
		return true;
	}

}
