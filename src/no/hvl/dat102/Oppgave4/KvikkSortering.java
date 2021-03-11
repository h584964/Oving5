package no.hvl.dat102.Oppgave4;

public class KvikkSortering {
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

	public static <T extends Comparable<T>> void kvikkSort(T[] data) {
		kvikkSort(data, 0, data.length -1);
	}
}
