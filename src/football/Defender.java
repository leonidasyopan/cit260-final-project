package football;

public class Defender extends Player {

	public Defender() {
		
	}
	
	public Defender(String name, String country, int number, boolean starter) {
		
	}

	@Override
    public String pass() {
        return "Backward Pass!";
    }
	
	public boolean tackle() {
		
		return true;
	}
}
