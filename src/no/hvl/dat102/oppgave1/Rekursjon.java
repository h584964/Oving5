package no.hvl.dat102.oppgave1;

public class Rekursjon {

	public static void main(String[] args) {
		System.out.println("S100 er: " + sum(100));
		
		System.out.println();
		

		System.out.println("De 10 første tallene i tallfølgen:");
		for (int i = 0; i < 10; i++) {
			System.out.println("Ledd " + i + " ");
			System.out.println(a(i));
		}

	}

//	a)
	/*Lager en metode for å beregne Sn, for
	 * å se finne S100.
	 */
	public static int sum(int n) {
		if (n == 1) {
			return 1;
		} else {
			return sum(n - 1) + n;
		}
	}

	// b)
	/*Lager en rekusiv metode. Basistilfellet her er 0
	 * og gir 2. Skal finnne an og finne de 10 første tallene 
	 * i tallrekken.
	 * 
	 */
	public static int a(int n) {
		if (n == 0) {
			return 2;
		} else if (n == 1) {
			return 5;

		} else {
			return (5 * (a(n - 1)) - (6 * (a(n - 2))) + 2);
		}
	}
	
	// c) 
	/*
	 * Finne koden i boken kap 8.3. Kopiere inn koden for å så kjøre den.
	 * Så skal du modifsere det til å telle opp antall flyttinger i stedet for å ta med 
	 * utskriftsettningene. Kjør deretter programmet for noen ulike verdier av n(antall ringer)
	 * for eksemepel n mellom 28 og 32, og må tiden. 
	 */
	
	
	
}
