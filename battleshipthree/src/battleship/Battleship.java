package battleship;

public class Battleship extends Ship {

	public Battleship() {
		// set inherited 'length' variable to correct value 
		// initialise 'hit' array
	}

	@Override
	public String getShipType() {
		return "battleship";
	}

	// for use with the Ocean print method
	@Override
	public String toString() {
		return "b";
	}
	
}
