package battleship;

public class EmptySea extends Ship {

	public EmptySea() {
		// set inherited 'length' variable to '1'
	}

	@Override
	boolean shootAt(int row, int column) {
		return false; // NOT a dummy value
	}
	
	@Override
	boolean isSunk() {
		return false; // NOT a dummy value
	}

	// for use with the Ocean print method
	@Override
	public String toString() {
		return "s";
	}
	
}
