package no.hvl.dat102.Oppgave4;

public class FletteSortering {
	
	public static <T extends Comparable<T>> void fletteSortering(T[] data) {
	fletteSortering(data, 0, data.length -1);
}
	public static <T extends Comparable<T>> void fletteSortering(T[] tabell, int foerste, int siste) {
		int midten;
		if (foerste < siste) {
			 midten = (foerste + siste) / 2; // Finner gjennomsnittet
			fletteSortering(tabell, foerste, midten);
			fletteSortering(tabell, midten + 1, siste);
			flette(tabell, foerste, midten, siste);

		}

	}

	private static <T extends Comparable<T>> void flette(T[] tabell, int foerste, int midten, int siste) {
		T[] temp = (T[]) (new Comparable[tabell.length]);

		int stoerlse = siste - foerste + 1;

		
		//Start og slutt p� venstre deltabell
		int foersteV = foerste;
		int sisteV = midten;
		
		//Start og slutt p� h�yre deltabell
		int foersteH = midten + 1;
		int sisteH = siste;

		// Indeks i hjelp
		int h;
		h = foersteV;

		/*
		 * S� m� vi ha en while l�kke s� lenge begge deltabellen ikke er tomme. Kopier
		 * det minste elementet til hjelpetabellen
		 */

		while (foersteV <= sisteV && foersteH <= sisteH) {
			if (tabell[foersteV].compareTo(tabell[foersteH]) < 0) {
				temp[h] = tabell[foersteV];
				foersteV++;
			} else {
				temp[h] = tabell[foersteH];
				foersteH++;
			}
			h++;
		}
		// Kopiere reste av venstre del (Kan v�re tom)
		// kan ogs� bruke for-l�kke
		while (foersteV <= sisteV) {
			temp[h] = tabell[foersteV];
			foersteV++;
			h++;
		}
		// Kopier resten av h�yre tabellen
		// kan ogs� bruke for-l�kke
		while (foersteH <= sisteH) {
			temp[h] = tabell[foersteH];
			foersteH++;
			h++;
		}
		for(h = foerste; h <= siste; h++) {
			tabell[h] = temp[h];
			
		}
	}
}
