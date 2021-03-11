package no.hvl.dat102.Oppgave4;

public class BobleSortering {
	/*
	 * Boblesortering - den ytre l�kken blir litt anderledes n�. Naboelemente st�r
	 * p� i+1 til h�yre. i'en kan beynne p� en for da kommer vi ut p� siste
	 * elementet. Vi skal allid begynnne p� starten og det er slutten som kommer til
	 * � forandre seg. L�kken skal alltid � begynne p� 0 og s� skal den siste gangen
	 * slutte p� lengde p� tabellen minus 1
	 */

	public static <T extends Comparable<T>> void bobleSortering(T[] data) {

		T temp;

		// Begynner helt til h�yre, og s� minker den for hver gang man g�r igjennom
		for (int plass = data.length - 1; plass >= 0; plass--) {
			for (int sok = 0; sok <= plass - 1; sok++) {
				// Sjekker hvordan naboelemente st�r i forhold til hverandre
				if (data[sok].compareTo(data[sok + 1]) > 0) {

					// Bytter verdiene
					temp = data[sok];
					data[sok] = data[sok + 1];
					data[sok + 1] = temp;
				}
			}

		}
	}
}
