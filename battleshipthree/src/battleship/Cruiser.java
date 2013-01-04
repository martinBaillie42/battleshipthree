package battleship;

public class Cruiser extends Ship {

	public Cruiser() {
		length = 3;
		// set inherited 'length' variable to correct value 
		// initialise 'hit' array
	}

	@Override
	public String getShipType() {
		return "cruiser";
	}

	// for use with the Ocean print method
	@Override
	public String toString() {
		return "c";
	}
	
}
