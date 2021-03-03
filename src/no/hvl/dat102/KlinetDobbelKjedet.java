package no.hvl.dat102;

import no.hvl.dat102.dobbeltkjedetliste.DobbelKjedetListeS;

public class KlinetDobbelKjedet {

	public static void main(String[] args) {
		int min = 0;
		int max = 100;

		DobbelKjedetListeS<Integer> liste = new DobbelKjedetListeS<Integer>(100, max);

		// Legger til tall i liste
		liste.leggTil(1);
		liste.leggTil(2);
		liste.leggTil(5);
		liste.leggTil(8);
		liste.leggTil(10);
		liste.leggTil(65);
		liste.leggTil(99);

		// Skriver ut liste
		System.out.println("Opprinnelig liste");
		liste.visListe();

		// Tester om et bestemt element fins
		Integer elm = Integer.valueOf(10);
		boolean funnet = liste.fins(elm);
		if (funnet) {
			System.out.println("\nElementet " + elm + " fins");
		} else {
			System.out.println("\nElementet " + elm + " fins ikke");
		}

//	System.out.println(liste.fjern(8));
//	liste.visListe();
		
		System.out.println();
		// Fjerner noen fra listen og skriver ut listen igjen
		Integer el1 = Integer.valueOf(10);

		System.out.println("Fjerner " + el1);
		liste.fjern(el1);
		liste.visListe();

//		
//	
//	System.out.println();
////	System.out.println(liste.fjern(3));
//	liste.visListe();

	}

}
