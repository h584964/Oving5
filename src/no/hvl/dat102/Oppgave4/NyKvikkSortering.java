package no.hvl.dat102.Oppgave4;

public class NyKvikkSortering {
	
	private static final int MIN = 1;

	public static <T extends Comparable<T>> void kvikkSortNy(T[] data) {
		
		NyKvikkSortering.kvikkSortNy(data,0, data.length -1);
		SorteringVedInnsetting.sorteringVedInnsetting(data);
		}
	
	
	public static <T extends Comparable<T>> void kvikkSortNy(T[] data, int min, int maks) {
		int posPartisjon;
		if (maks - min +1 > MIN) {
			//antall elementer > MIN ? 
			posPartisjon = finnPartisjon(data, min, maks);
			kvikkSortNy(data, min, posPartisjon -1);
			kvikkSortNy(data, posPartisjon + 1, maks);  
			}
		}// metode
	
	
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
}
