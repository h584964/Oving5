package no.hvl.dat102.KlientOppgave4;


import java.util.Arrays;
import java.util.Random;

import no.hvl.dat102.Oppgave4.BobleSortering;
import no.hvl.dat102.Oppgave4.FletteSortering;
import no.hvl.dat102.Oppgave4.KvikkSortering;
import no.hvl.dat102.Oppgave4.NyKvikkSortering;
import no.hvl.dat102.Oppgave4.SorteringVedInnsetting;
import no.hvl.dat102.Oppgave4.UtvalgSortering;

public class KlientSortering {
	
//	public void main() {
//	Random tilfeldig = new Random();
//	int i = 0;
//	Integer [] a = new Integer[i];
//	for(i = 32000; i <= 128000; i = i *2) {
//		
//	}
//	
//	
//		
//	}
	
	public static void main(String[] args) {
Integer[] testTab = {9, 6, 4, 1, 2, 10, 0, 7, 8, 5};
		
		SorteringVedInnsetting.sorteringVedInnsetting(testTab);
		System.out.println("Sortering ved innsetting: \t" + Arrays.toString(testTab));
		
		UtvalgSortering.utvalgSortering(testTab);
		System.out.println("Sortering ved utvalg: \t\t" + Arrays.toString(testTab));
		
		BobleSortering.bobleSortering(testTab);
		System.out.println("Boblesortering: \t\t" + Arrays.toString(testTab));
		
		KvikkSortering.kvikkSort(testTab);
		System.out.println("Kvikksortering: \t\t" + Arrays.toString(testTab));
		
		FletteSortering.fletteSortering(testTab);
		System.out.println("Flettesortering: \t\t" + Arrays.toString(testTab));

		//Oppgae 5a - tidsm�ling
		System.out.println("\n");
		System.out.println("M�LING AV UTF�RINGSTIDER: ");
		System.out.print("\n");
		Random tilfeldig = new Random();
		int n = 32000;
		int antall = 10;
		
		Integer[][] a = new Integer[antall][n];
		
		// set inn tilfeldige heiltal i alle rekker
		for (int i = 0; i < antall; i++) {
			for (int j = 0; j < n; j++){
				a[i][j] = tilfeldig.nextInt();
				}
			}
		
		long tidFoer, tidEtter;
		long tidBrukt, gjenTid;
		int mil = 1000000;
		
		//M�ling for Sortering ved innsetting
		tidFoer = System.currentTimeMillis(); // tiden f�r sorteringen
		for (int i = 0; i < antall; i++){
			SorteringVedInnsetting.sorteringVedInnsetting(a[i]); // M�ling for sortering ved innsetting
			}	// slutt tidsm�ling
		tidEtter = System.currentTimeMillis();// tiden etter sorteringen
		tidBrukt = (tidEtter-tidFoer);	// tiden sorteringen tok
		gjenTid = tidBrukt/antall;
	
		System.out.println("\t-----Sortering ved Innsetting-----");
		System.out.println("F�r: " + tidFoer + " Etter: " + tidEtter);
		System.out.println("Antall m�linger: " + antall);
		System.out.println("Gjennomsnittelig tid brukt: " + gjenTid + " ms!\n");
		
		//M�ling for UtvalgsSortering
		tidFoer = System.currentTimeMillis(); // tiden f�r sorteringen
		for (int i = 0; i < antall; i++){
			UtvalgSortering.utvalgSortering(a[i]); // M�ling for utvalgssortering
			}	// slutt tidsm�ling
		tidEtter = System.currentTimeMillis();// tiden etter sorteringen
		tidBrukt = (tidEtter-tidFoer);	// tiden sorteringen tok
		gjenTid = tidBrukt/antall;
	
		System.out.println("\t-----Utvalgssortering-----");
		System.out.println("F�r: " + tidFoer + " Etter: " + tidEtter);
		System.out.println("Antall m�linger: " + antall);
		System.out.println("Gjennomsnittelig tid brukt: " + gjenTid + " ms!\n");
		
		//M�ling for BobleSortering
		tidFoer = System.currentTimeMillis(); // tiden f�r sorteringen
		for (int i = 0; i < antall; i++){
			BobleSortering.bobleSortering(a[i]); // M�ling for boblesortering
			}	// slutt tidsm�ling
		tidEtter = System.currentTimeMillis();	// tiden etter sorteringen
		tidBrukt = (tidEtter-tidFoer);	// tiden sorteringen tok
		gjenTid = tidBrukt/antall;
	
		System.out.println("\t-----Boblesortering-----");
		System.out.println("F�r: " + tidFoer + " Etter: " + tidEtter);
		System.out.println("Antall m�linger: " + antall);
		System.out.println("Gjennomsnittelig tid brukt: " + gjenTid + " ms!\n");
		
		//M�ling for KvikkSortering
		tidFoer = System.currentTimeMillis(); // tiden f�r sorteringen
		for (int i = 0; i < antall; i++){
			KvikkSortering.kvikkSort(a[i]); // M�ling for kvikksortering
			}	// slutt tidsm�ling
		tidEtter = System.currentTimeMillis();// tiden etter sorteringen
		tidBrukt = (tidEtter-tidFoer);	// tiden sorteringen tok
		gjenTid = tidBrukt/antall;
	
		System.out.println("\t-----Kvikksortering-----");
		System.out.println("F�r: " + tidFoer + " Etter: " + tidEtter);
		System.out.println("Antall m�linger: " + antall);
		System.out.println("Gjennomsnittelig tid brukt: " + gjenTid + " ms!\n");
		
		// M�ling for FletteSortering
		tidFoer = System.currentTimeMillis(); // tiden f�r sorteringen
		for (int i = 0; i < antall; i++){
			FletteSortering.fletteSortering(a[i]); // M�ling for flettesortering
			}	// slutt tidsm�ling
		tidEtter = System.currentTimeMillis();// tiden etter sorteringen
		tidBrukt = (tidEtter-tidFoer);	// tiden sorteringen tok
		gjenTid = tidBrukt/antall;
	
		System.out.println("\t-----Flettesortering-----");
		System.out.println("F�r: " + tidFoer + " Etter: " + tidEtter);
		System.out.println("Antall m�linger: " + antall);
		System.out.println("Gjennomsnittelig tid brukt: " + gjenTid + " ms!\n");
		
		//Utf�ring med kvikkSortNy-metoden og sjekker for ulike MIN-verdier
		tidFoer = System.nanoTime(); // tiden f�r sorteringen
		for (int i = 0; i < antall; i++){
			NyKvikkSortering.kvikkSortNy(a[i]); // M�ling for kvikksorteringNy
			}	// slutt tidsm�ling
		tidEtter = System.nanoTime();// tiden etter sorteringen
		tidBrukt = (tidEtter-tidFoer);	// tiden sorteringen tok
		gjenTid = tidBrukt/antall;
		
		System.out.println("-----KvikksSortNY, m�ling for MIN-----");
		System.out.println("F�r: " + tidFoer + " Etter: " + tidEtter);
		System.out.println("Antall m�linger: " + antall);
		System.out.println("Gjennomsnittelig tid brukt: " + gjenTid + " ns!\n");
		
		//Oppgave 4c
		
		//Opptertter tabell med identiske tall og m�ler 
		//tiden det tar � sortere ved bruk av KvikkSortering
		int ant0 = 10;
		int n0 = 10;
		Integer[][] nyTab = new Integer[ant0][n0];
		
		// set inn heltallet 1 i alle rekker
		for (int i = 0; i < nyTab.length; i++) {
			for (int j = 0; j < nyTab[i].length; j++){
				nyTab[i][j] = 0; 
			}
		}
		tidFoer = System.nanoTime(); // tiden f�r sorteringen
		for (int i = 0; i < ant0; i++){
			KvikkSortering.kvikkSort(nyTab[i]); // M�ling for kvikksorteringNy
			}	// slutt tidsm�ling
		tidEtter = System.nanoTime();// tiden etter sorteringen
		tidBrukt = (tidEtter-tidFoer);	// tiden sorteringen tok
		gjenTid = tidBrukt/ant0;
		
		System.out.println("-----KvikksSortering der alle elementer er like-----");
		System.out.println("F�r: " + tidFoer + " Etter: " + tidEtter);
		System.out.println("Antall m�linger: " + ant0);
		System.out.println("Gjennomsnittelig tid brukt: " + gjenTid + " ns!");
		
	}
	
}
			
	

	

	
		



