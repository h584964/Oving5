package no.hvl.dat102.Oppgave4;

public class BobleSortering {
	/*
	 * Boblesortering - den ytre løkken blir litt anderledes nå. Naboelemente står
	 * på i+1 til høyre. i'en kan beynne på en for da kommer vi ut på siste
	 * elementet. Vi skal allid begynnne på starten og det er slutten som kommer til
	 * å forandre seg. Løkken skal alltid ¨ begynne på 0 og så skal den siste gangen
	 * slutte på lengde på tabellen minus 1
	 */

	public static <T extends Comparable<T>> void bobleSortering(T[] data) {

		T temp;

		// Begynner helt til høyre, og så minker den for hver gang man går igjennom
		for (int plass = data.length - 1; plass >= 0; plass--) {
			for (int sok = 0; sok <= plass - 1; sok++) {
				// Sjekker hvordan naboelemente står i forhold til hverandre
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
