package battleship;

public class Destroyer extends Ship {

	public Destroyer() {
		// set inherited 'length' variable to correct value 
		// initialise 'hit' array
	}

	@Override
	public String getShipType() {
		return "destroyer";
	}

	// for use with the Ocean print method
	@Override
	public String toString() {
		return "d";
	}
	
}
