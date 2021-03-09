package no.hvl.dat102.oppgave1;

//1c)
public class Hanoi {
	private int totalDisks;
	private long antall;

	public long getAntall() {
		return antall;
	}

	public static void main(String[] args) {

		// 4 disker
		System.out.println("Kjører med 4 disker");
		long start = System.nanoTime();
		Hanoi towers = new Hanoi(4);
		towers.solve();
		long slutt = System.nanoTime();
		System.out.println("Det tok " + (slutt - start) / 1000 + " millisekund");
		System.out.println("Antall flyttninger " + towers.getAntall());

		System.out.println();

		// 28 disker
		System.out.println("Kjører med 28 disker");
		long start1 = System.nanoTime();
		Hanoi towers1 = new Hanoi(28);
		towers1.solve();
		long slutt1 = System.nanoTime();
		System.out.println("Det tok " + (slutt1 - start1) / 1000 + " millisekund");
		System.out.println("Antall flyttninger " + towers1.getAntall());

		System.out.println();

		// 30 disker
		System.out.println("Kjører med 30 disker");
		long start2 = System.nanoTime();
		Hanoi towers2 = new Hanoi(28);
		towers2.solve();
		long slutt2 = System.nanoTime();
		System.out.println("Det tok " + (slutt2 - start2) / 1000 + " millisekund");
		System.out.println("Antall flyttninger " + towers2.getAntall());

		System.out.println();

		// 32 disker
		System.out.println("Kjører med 32 disker");
		long start3 = System.nanoTime();
		Hanoi towers3 = new Hanoi(32);
		towers3.solve();
		long slutt3 = System.nanoTime();
		System.out.println("Det tok " + (slutt3 - start3) / 1000 + " millisekund");
		System.out.println("Antall flyttninger " + towers3.getAntall());
	}

	/**
	 * Sets up the puzzle with the specified number of disks.
	 *
	 * @param disks the number of disks
	 */
	public Hanoi(int disks) {
		totalDisks = disks;
	}

	/**
	 * Performs the initial call to moveTower to solve the puzzle. Moves the disks
	 * from tower 1 to tower 3 using tower 2.
	 */
	public void solve() {
		moveTower(totalDisks, 1, 3, 2);
	}

	/**
	 * Moves the specified number of disks from one tower to another by moving a
	 * subtower of n-1 disks out of the way, moving one disk, then moving the
	 * subtower back. Base case of 1 disk.
	 *
	 * @param numDisks the number of disks to move
	 * @param start    the starting tower
	 * @param end      the ending tower
	 * @param temp     the temporary tower
	 */
	private void moveTower(int numDisks, int start, int end, int temp) {
		if (numDisks == 1)
//			moveOneDisk(start, end);
			antall++;
		else {
			moveTower(numDisks - 1, start, temp, end);
//			moveOneDisk(start, end);
			moveTower(numDisks - 1, temp, end, start);
			antall++;
		}
	}

	/**
	 * Prints instructions to move one disk from the specified start tower to the
	 * specified end tower.
	 *
	 * @param start the starting tower
	 * @param end   the ending tower
	 */
	private void moveOneDisk(int start, int end) {
		System.out.println(" ");
//		System.out.println("Move one disk from " + start + " to " + end);
	}
}
