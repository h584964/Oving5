package no.hvl.dat102.Oppgave4;

public class UtvalgSortering {
	
	
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
}
