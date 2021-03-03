package no.hvl.dat102.dobbeltkjedetliste;



public class DobbelKjedetListeS<T extends Comparable<T>> {
	private DobbelNode<T> foerste;
	private DobbelNode<T> siste;
	private int antall;

	public DobbelKjedetListeS(T minVerdi, T maksVerdi) {
//		DobbelNode<T> nyNode1 = new DobbelNode<T>(minVerdi);
//		foerste = nyNode1;
//
//		DobbelNode<T> nyNode2 = new DobbelNode<T>(maksVerdi);
//		siste = nyNode2;

		
		foerste = new DobbelNode<T>(minVerdi);
		siste = new DobbelNode<T>(maksVerdi);
		antall = 0;
//		foerste.setElement(minVerdi);
//		siste.setElement(maksVerdi);
	}

	public void leggTil(T ny) {
		DobbelNode<T> aktuell = foerste;
		DobbelNode<T> forrige = null;
		DobbelNode<T> nyNode = new DobbelNode<T>(ny);
		boolean lagtTil = false;
		
//		while(ny.compareTo(aktuell.getElement())> 0) {
//			aktuell = aktuell.getNeste();
//		}
//		//Legg inn foran aktuell
//		nyNode.setNeste(aktuell);
//		nyNode.setForrige(aktuell.getForrige());
//		aktuell.getForrige().setNeste(nyNode);;
//		aktuell.setForrige(nyNode);
//		antall++;
		// Sjekker om den er tom
		if (foerste == null) {
			foerste = nyNode;
			siste = nyNode;
			antall++;
			lagtTil = true;

		}

		while (aktuell != siste && !lagtTil) {
			// Legges inn først
			if (ny.compareTo(foerste.getElement()) <= 0) {
				foerste = nyNode;
				nyNode.setNeste(aktuell);
				antall++;
				lagtTil = true;
				// Legges inn på slutten
			} else if (ny.compareTo(siste.getElement()) > 0) {
				siste.setNeste(nyNode);
				siste = nyNode;
				antall++;
				lagtTil = true;
				// Om den skal inn på et annet sted en første
			} else if (ny.compareTo(aktuell.getElement()) <= 0) {
				forrige.setNeste(nyNode);
				nyNode.setNeste(aktuell);
				antall++;
				lagtTil = true;

			}
			forrige = aktuell;
			// Oppdatere kjedetlisten
			aktuell = aktuell.getNeste();
		}
	}

//		DobbelNode<T> aktuell = foerste;
//		if ((ny.compareTo(foerste.getElement()) <= 0) || (ny.compareTo(siste.getElement()) >= 0)) {
//			System.out.println("Ulovelig verdi");
//
//		} else {
//			if (antall == 0) {
//				foerste.setNeste(siste);
//				nyNode.setForrige(foerste);
//				nyNode.setNeste(siste);
//				antall++;
//			}
//			else {
//				DobbelNode<T> aktuell = foerste;
//				boolean funnet = true;
//
//				while (aktuell != siste & !funnet) {
//					if (aktuell.getElement() == (foerste.getNeste())) {
//						funnet = true;
//
//					}
//					if (aktuell.getElement() == (siste.getForrige())) {
//						funnet = true;
//
//					} else {
//						funnet = false;
//					}
//
//			}
//
////		}
////		while (ny.compareTo(nyNode.getElement()) >= 0) {
////			nyNode = nyNode.getNeste(); // Oppdaterer
//		}
//		
//		}

//	}

	public T fjern(T x) {
		T resultat = null;
		boolean fjernet = false;
		DobbelNode<T> aktuell = foerste.getNeste();
		if(antall ==0) {
			return null;
		}

		
		
		//Går igjen til element er funnet
		while(aktuell.getNeste() != null && !aktuell.getElement().equals(x)) 
			aktuell = aktuell.getNeste();
			
		if(aktuell.getNeste() != null)
		aktuell.getForrige().setNeste(aktuell.getNeste());
		aktuell.getNeste().setForrige(aktuell.getForrige());
		antall --;
		
//			T el = aktuell.getElement();
//			if(x.compareTo(el) == 0) {
//				resultat = el;
//				aktuell.getForrige().setNeste(aktuell.getNeste());
//				aktuell.getNeste().setForrige(aktuell.getForrige());
//				antall--;
//				fjernet = true;
//			}
//			aktuell = aktuell.getNeste();
//		}
		
		return resultat;
		} // lovlige
//		
	
		
	
//		T resultat = null;
//		boolean funnet = false;
//		
//		if(antall > 0) {
			
//			while(aktuell.getNeste() != null && !funnet) {
//				T el = aktuell.getElement();
//				
//				if(x.compareTo(el)== 0) {
//					resultat = el;
//					aktuell.getForrige().setNeste(aktuell.getNeste());
//					aktuell.getNeste().setForrige(aktuell.getForrige());
//					antall--;
//					funnet = true;
//				}
//				aktuell = aktuell.getNeste();
//			}
//			
//		}
//		return resultat;
//		DobbelNode<T> p = null;
		
		
//		if(x.compareTo(foerste.getElement())<=0 || (x.compareTo(siste.getElement())>= 0)) {
//			
//		}
//		while(x.compareTo(p.getElement())> 0) {
//			p = p.getNeste();
//		}
//		
//		if(x.compareTo(p.getElement())== 0) {
//			funnet = true;
//		}
//		if(funnet) {
//			antall = antall -1;
//			
//			resultat = p.getElement();
//		}

//		if (fins(x)) {
//			
//			boolean fjernet = false;
//
//			if (x.compareTo(aktuell.getElement()) == 0) {
//				aktuell.getNeste();
//				x = null;
//				antall--;
//				fjernet = true;
//
//				DobbelNode<T> elm1 = aktuell.getNeste();
//				DobbelNode<T> elm2 = aktuell.getForrige();
//
//				elm1.setForrige(elm2);
//				elm2.setNeste(elm1);
//
//				resultat = aktuell.getElement();
//			}
//		}
//
//		return resultat;
//	}

	// Sjekker om et element finnes i den DobbelteKjedetListen, hvis det finnes
	// retunere true og false ellers
	public boolean fins(T x) {
		DobbelNode<T> denne = foerste;
		boolean resultat = false;
		while (denne != null && x.compareTo(denne.getElement()) > 0) {
			denne = denne.getNeste(); // oppdaterer

		}
		if (denne != null) {
			if (x.compareTo(denne.getElement()) == 0) {
				resultat = true;
			}
		}
		return resultat;

	}

	public void visListe() {
		if (antall == 0) {
			System.out.println("Ingen liste");
		}
		DobbelNode<T> aktuell = foerste.getNeste();

		while (aktuell != null) {
			System.out.print(aktuell.getElement() + " ");
			aktuell = aktuell.getNeste();
		}
		System.out.println("Første: " + foerste.getElement() + " " + "Siste: " + siste.getElement());

		System.out.println();

	}

	public boolean erTom() {
		return antall == 0;
	}

}
