package no.hvl.dat102.dobbeltkjedetliste;

public class DobbelKjedetListeS<T extends Comparable<T>> {
	private DobbelNode<T> foerste;
	private DobbelNode<T> siste;
	private int antall;

	public DobbelKjedetListeS(T minVerdi, T maksVerdi) {

		foerste = new DobbelNode<T>(minVerdi);
		siste = new DobbelNode<T>(maksVerdi);
		
		foerste.setNeste(siste);
		siste.setForrige(foerste);

		antall = 0;


	}

	public void leggTil(T ny) {
		DobbelNode<T> nyNode = new DobbelNode<T>(ny);
		DobbelNode<T> aktuell = foerste.getNeste();
		while(ny.compareTo(aktuell.getElement())> 0) {
			aktuell = aktuell.getNeste();
		}
		nyNode.setNeste(aktuell);
		nyNode.setForrige(aktuell.getForrige());
		aktuell.getForrige().setNeste(nyNode);
		aktuell.setForrige(nyNode);
		antall++;
	}


	public T fjern(T x) {
		T resultat = null;
		boolean fjernet = false;
		if (antall > 0) {

			DobbelNode<T> aktuell = foerste.getNeste();

			// Går igjen til element er funnet
			while (aktuell.getNeste() != null && !fjernet) {

				T el = aktuell.getElement();
				if (x.compareTo(el) == 0) {
					resultat = el;
					aktuell.getForrige().setNeste(aktuell.getNeste());
					aktuell.getNeste().setForrige(aktuell.getForrige());
					antall--;
					fjernet = true;
				}
				aktuell = aktuell.getNeste();
			}

		}
		return resultat;

	} 

	// Sjekker om et element finnes i den DobbelteKjedetListen, hvis det finnes
	// retunere true og false ellers
	public boolean fins(T x) {
		DobbelNode<T> aktuell = foerste.getNeste();
		boolean resultat = false;
		while (aktuell != null && x.compareTo(aktuell.getElement()) > 0) {
			aktuell = aktuell.getNeste(); // oppdaterer

		}
		if (aktuell != null) {
			if (x.compareTo(aktuell.getElement()) == 0) {
				resultat = true;
			}
		}
		return resultat;

	}

	public void visListe() {
		if (erTom()) {
			System.out.println("Ingen liste");
		}
		DobbelNode<T> aktuell = foerste.getNeste();

		while (aktuell != null) {
			System.out.print(aktuell.getElement() + " ");
			aktuell = aktuell.getNeste();
		}


		System.out.println();

	}

	public boolean erTom() {
		return antall == 0;
	}

}
