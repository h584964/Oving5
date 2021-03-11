package no.hvl.dat102.Oppgave4;

public class SorteringsMetoder {

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

	public static <T extends Comparable<T>> void utvalgSortering(T[] data) {
		int minstePos;
		T temp;

		for (int indeks = 0; indeks < data.length - 1; indeks++) {
			minstePos = indeks;
			for (int sok = indeks + 1; sok < data.length; sok++) {
				// Undersøke om den som står på sok er mindre en det som er minst sålangt
				if (data[sok].compareTo(data[minstePos]) < 0) {
					minstePos = sok;

				}
			}
			temp = data[minstePos];
			data[minstePos] = data[indeks];
			data[indeks] = temp;
		}
	}
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

	/*
	 * Må lage en partisjonsmetode for kikksorteringen Partisjon betyr oppdeling
	 */
	private static <T extends Comparable<T>> int finnPartisjon(T[] data, int min, int maks) {
		T temp, pivot;
		int venstre, hoyre;
		int midten = (min + maks) / 2;

		pivot = data[midten];
		temp = data[midten];
		data[midten] = data[min];
		data[min] = temp;

		venstre = min;
		hoyre = maks;

		while (venstre < hoyre) {
			/*
			 * Søker etter et element som er større enn temp. Slik at partisjonsprossesen
			 * vil forsette så lege venstre < hoyre
			 */
			while (venstre < hoyre && data[venstre].compareTo(pivot) <= 0) {
				venstre++;
			}

			/*
			 * Søker etter et element som er mindre eller lik temp
			 * 
			 */
			while (data[hoyre].compareTo(pivot) > 0) {
				hoyre--;
			}
			/*
			 * Bytter element dersom venstre er mindre enn hoyre
			 */
			if (venstre < hoyre) {
				temp = data[venstre];
				data[venstre] = data[hoyre];
				data[hoyre] = temp;
			}
		}
		// Flytter temp til riktig og sin endelige posisjon;
		temp = data[min];
		data[min] = data[hoyre];
		data[hoyre] = temp;
		return hoyre;

	}

	public static <T extends Comparable<T>> void kvikkSort(T[] data, int min, int maks) {
		// Basis: 0 eller eller 1 element -> Da skal vi gjøre ingenting
		// Når har vi minst to elementer: min og maks
		if (min < maks) {
			// Lager partisjonen
			int posPartisjon = finnPartisjon(data, min, maks);
			// Sortere venstre del
			kvikkSort(data, min, posPartisjon - 1);
			// Sortere høyre del
			kvikkSort(data, posPartisjon + 1, maks);

		}
	}

//	public static <T extends Comparable<T>> void kvikkSort(T[] data) {
//	kvikkSort(data, 0, data.length -1);
//}
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

		
		//Start og slutt på venstre deltabell
		int foersteV = foerste;
		int sisteV = midten;
		
		//Start og slutt på høyre deltabell
		int foersteH = midten + 1;
		int sisteH = siste;

		// Indeks i hjelp
		int h;
		h = foersteV;

		/*
		 * Så må vi ha en while løkke så lenge begge deltabellen ikke er tomme. Kopier
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
		// Kopiere reste av venstre del (Kan være tom)
		// kan også bruke for-løkke
		while (foersteV <= sisteV) {
			temp[h] = tabell[foersteV];
			foersteV++;
			h++;
		}
		// Kopier resten av høyre tabellen
		// kan også bruke for-løkke
		while (foersteH <= sisteH) {
			temp[h] = tabell[foersteH];
			foersteH++;
			h++;
		}
		for(h = foerste; h <= siste; h++) {
			tabell[h] = temp[h];
			
		}
	}

//	public static void main(String[] args) {
//		Integer[] tab = { 8, 10, 1, 9, 15, 19, 4, 3, 18, 11 };
////		sorteringVedInnsetting(tab);
////		utvalgSortering(tab);
////		bobleSortering(tab);
////		kvikkSort(tab, 0, tab.length - 1);
//		fletteSortering(tab, 0, tab.length -1);
//
//		for (Integer el : tab) {
//			System.out.print(el + " ");
//		}
//		System.out.println();
//	}

}
