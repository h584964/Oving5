package no.hvl.dat102;

import no.hvl.dat102.dobbeltkjedetliste.DobbelKjedetListeS;

public class KlinetDobbelKjedet {

	public static void main(String[] args) {
	int min = 0;
	int max = 100;
	
//	int [] tall = {1,2,3,6,10,19};
	
	DobbelKjedetListeS<Integer> liste = new DobbelKjedetListeS<Integer>(100, max);
	
//	for(int i = 0; i < tall.length; i++ ) {
//		liste.leggTil(tall[i]);
//	}
	// Legger til tall i liste
	liste.leggTil(1);
	liste.leggTil(10);
	liste.leggTil(2);
	liste.leggTil(3);
	liste.leggTil(19);
	liste.leggTil(6);
	
	//Skriver ut liste
	System.out.println("Opprinnelig liste");
	liste.visListe();
	
	//Tester om et bestemt element fins
	Integer elm = Integer.valueOf(1);
	boolean funnet = liste.fins(elm);
	if(funnet) {
		System.out.println("\nElementet " + elm + " fins");
	}else {
		System.out.println("Elementet " + elm + " fins ikke");
	}
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
