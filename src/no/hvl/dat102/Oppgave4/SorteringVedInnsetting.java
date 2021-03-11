package no.hvl.dat102.Oppgave4;

public class SorteringVedInnsetting {
	public static <T extends Comparable<T>> void sorteringVedInnsetting(T[] data) {
		for (int indeks = 1; indeks < data.length; indeks++) {
			T nokkel = data[indeks];
			/*
			 * Hvis nokkel er mindre en det elementet som st�r til venstre for seg s� skal
			 * elementet som er st�rst flyttes en til h�yre, og det er plassen n�kkel skal
			 * inn p�.
			 */
			int plass = indeks;
			while (plass > 0 && nokkel.compareTo(data[plass - 1]) < 0) {
				data[plass] = data[plass - 1]; // aktuell posisjon
				plass--;
			}
			// N�r man kommer ut av l�kken har plass f�t rett verdi
			data[plass] = nokkel;

		}
	}
	
	//kanskje ha en metode for m�lt i tid, og s� bruke den i klienten etterp�
}
