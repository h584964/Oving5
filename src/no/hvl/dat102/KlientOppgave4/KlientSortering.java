package no.hvl.dat102.KlientOppgave4;


import java.util.Arrays;
import java.util.Random;

import no.hvl.dat102.Oppgave4.BobleSortering;
import no.hvl.dat102.Oppgave4.FletteSortering;
import no.hvl.dat102.Oppgave4.KvikkSortering;
import no.hvl.dat102.Oppgave4.SorteringVedInnsetting;
import no.hvl.dat102.Oppgave4.UtvalgSortering;

public class KlientSortering {
	
	public void main() {
	Random tilfeldig = new Random();
	int i = 0;
	Integer [] a = new Integer[i];
	for(i = 32000; i <= 128000; i = i *2) {
		
	}
	
	
		
	}
	
	public static void main(String[] args) {
		Integer[] tab = { 8, 10, 1, 9, 15, 19, 4, 3, 18, 11 };
		
		SorteringVedInnsetting.sorteringVedInnsetting(tab);
		System.out.println("Sortering ved innsettning:\t " + Arrays.toString(tab));

		UtvalgSortering.utvalgSortering(tab);
		System.out.println("Sortering ved utvalg:\t\t " + Arrays.toString(tab));
		
		BobleSortering.bobleSortering(tab);
		System.out.println("Bobblesortering:\t\t " + Arrays.toString(tab));
		
		KvikkSortering.kvikkSort(tab);
		System.out.println("KvikkSortering:\t\t\t " + Arrays.toString(tab));
		
		FletteSortering.fletteSortering(tab);
		System.out.println("Flettesortering:\t\t " + Arrays.toString(tab));
		
//		Random tilfeldig = new Random();
		
//		for(int i = 32000; i <= 128000; i = i*2) {
//			long start = System.currentTimeMillis();
		}
		
		
		
	}
			
	

	

	
		



