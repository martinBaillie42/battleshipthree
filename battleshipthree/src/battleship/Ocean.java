package battleship;

/* You are welcome to write additional methods of your own. Additional methods should
 * either be tested (if you think they have some usefulness outside this class), or private
 * (if they d on't)
 */

public class Ocean {
	Ship [][] ships = new Ship[10][10]; // used to quickly determine which ship is in any given location
	int shotsFired; 		// total number of shots fired by user
	int hitsCount; 			//number of times a shot hit a ship. if user shoots same part of
							// ship more than once, every hit is counted, even though additional
							// *hits* don't do the user any good
	int shipsSunk;			// NUmber of ships sunk (10 ships in all).
	
	Ocean() {
		/* creates an empty ocean (fills the *ships* array with EmptySeas).
		 * Also initiliases any game variables, such as how many shots have been fired
		 */
	}
	
	void placeAllShipsRandomly() {
		/* Place all ten ships randomly on the (initially empty) ocean. PLACE LARGER SHIPS
		 * BEFORE SMALLER ONES, or you may end up with no legal place to put a large ship.
		 * You will want to use the Random class in the java.util package
		 */
	}
	
	boolean isOccupied(int row, int column) {
		// returns true if the given location contains a ship, false if it does not
		
		return true;
	}
	
	boolean shootAt(int row, int column) {
		/* returns true if the given location contains a *real* ship, still afloat, (not
		 * an EmptySea), false if it does not. In addition, this method updates the number 
		 * of shots that have been fired, and the number of hits.
		 * 
		 * NOTE: If a location contains a *real* ship, shootAt should return true every
		 * time the user shoots at that same location. Once a ship has been sunk additional
		 * shots at its location should return false.
		 */
		
		return true;
	}
	
	int getShotsFired() {
		// returns the number of shots fired (in this game)
		return 0;
	}
	
	int getHitCount() {
		/* Returns the number of hits recorded (in this game). All hits are counted, not
		 * just the first time a given square is hit.
		 */
		
		return 0;
	}
	
	int getShipsSunk() {
		// Returns the number of ships sunk (in this game)
		
		return 0;
	}
	
	boolean isGameOver() {
		// returns true if all ships have been sunk, otherwise false
		return false;
	}
	
	Ship[][] getShipArray() {
		/* Returns the 10x10 array of ships. (You will probably need this method for 
		 * testing. However since it returns the *actual array of actual ships*, and could
		 * therefore be modified by some class that has no right to do so, use this method
		 * ONLY in you unit testing
		 * 
		 * The methods in the Ship class that take an OCean parameter really need to be
		 * able to look at the contents of this array; the placeShipAt method even needs 
		 * to modify it. While it is undesirable to allow methods in one class to directly 
		 * access instance variables in another class (hence my earlier restriction, now 
		 * crossed out), sometimes there is just no good alternative.
		 */
		return Ship[][]; // doesn't like this!
	}
	
	void print(){
		/* Prints the ocean. TO aid the user, row numbers should be displayed along the 
		 * left edge of the array, and column numbers should be displayed along the top.
		 * Numbers should be 0 to 9, not 1 to 10. THe top left corner should be 0, 0. USe 'S'
		 * to indicate a location you have fired upon and hit a (real) ship, '-' to indicate
		 * a location that you have fired upon and found nothing there, 'x' to indicate location
		 * containing a sunken ship, and '.' to indicate a location that you have never fired 
		 * upon
		 * 
		 *  This is the only method in the Ocean class that does any input/output, and it is
		 *  never called from within the Ocean class (except possibly during debugging), only
		 *  from the BattleshipGame class.
		 */
	}
	
	
}
