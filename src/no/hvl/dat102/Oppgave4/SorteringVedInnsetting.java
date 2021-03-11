package no.hvl.dat102.Oppgave4;

public class SorteringVedInnsetting {
	public static <T extends Comparable<T>> void sorteringVedInnsetting(T[] data) {
		for (int indeks = 1; indeks < data.length; indeks++) {
			T nokkel = data[indeks];
			/*
			 * Hvis nokkel er mindre en det elementet som står til venstre for seg så skal
			 * elementet som er størst flyttes en til høyre, og det er plassen nøkkel skal
			 * inn på.
			 */
			int plass = indeks;
			while (plass > 0 && nokkel.compareTo(data[plass - 1]) < 0) {
				data[plass] = data[plass - 1]; // aktuell posisjon
				plass--;
			}
			// Når man kommer ut av løkken har plass fåt rett verdi
			data[plass] = nokkel;

		}
	}
	
	//kanskje ha en metode for målt i tid, og så bruke den i klienten etterpå
}
