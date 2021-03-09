package no.hvl.dat102.Oppgave3;

public class BinaerSoking {
	
	public static <T extends Comparable<T>> boolean finnes(T[] data, int min, int maks, T el) {
		if(min > maks) {
			return false;
		}
		int midten = (min + maks) / 2;
		int resultat = el.compareTo(data[midten]);
		
		if(resultat == 0) { // Finner elementet
			return true;
		} 
		if(resultat < 0) {
			return
					(finnes(data, min, midten -1, el));
		}else {
			return
					(finnes(data, midten + 1, maks, el));
		}
		
	}

	public static void main(String[] args) {
//		BinaerSoking ob = new BinaerSoking();
		Integer [] data = {2, 4, 5, 7, 8, 10, 12, 15, 18, 21, 23, 27, 29, 30}; 
		
		//Tester om element 8 finnes
		Integer elm = Integer.valueOf(8);
		boolean funnet = finnes(data, 0, data.length - 1, elm);
		if (funnet) {
			System.out.println("\nElementet " + elm + " fins");
		} else {
			System.out.println("\nElementet " + elm + " fins ikke");
		}
		
		//Tester om element 16 finnes --> Noe som det ikke gjør ifølge den fysike tabellen
		Integer elm2 = Integer.valueOf(16);
		boolean funnet1 = finnes(data, 0, data.length - 1, elm2);
		if (funnet1) {
			System.out.println("\nElementet " + elm2 + " fins");
		} else {
			System.out.println("\nElementet " + elm2 + " fins ikke");
		}
	}

}
