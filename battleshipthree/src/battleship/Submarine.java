package battleship;

public class Submarine extends Ship {

	public Submarine() {
		// set inherited 'length' variable to correct value 
		// initialise 'hit' array
	}

	@Override
	public String getShipType() {
		return "submarine";
	}

	// for use with the Ocean print method
	@Override
	public String toString() {
		return "s";
	}
	
}
