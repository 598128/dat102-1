package no.hvl.dat102.oppg1;
import java.util.Random;
import java.time.*;
public class Insert {
	
	public static <T extends Comparable<? super T>> void sorteringVedInnsetting(T[] a, int n) {
		sorteringVedInssetting(a, 0, n - 1);
	}

	// Sorterer ein del av tabellen, start ... slutt (begge grensene er med)
	public static <T extends Comparable<? super T>> void sorteringVedInssetting(T[] a, int start, int slutt) {
		for (int i = start + 1; i <= slutt; i++) {
			T temp = a[i];
			int j = i - 1;
			boolean ferdig = false;
			while (!ferdig && j >= 0) {
				if (temp.compareTo(a[j]) < 0) {
					a[j + 1] = a[j];
					j--;
				} else {
					ferdig = true;
				}
			}
			a[j + 1] = temp;
		}
	}
	
	Random tilfeldig = new Random();
	
	n=100;
	
	int[] tabell = new int[];
	
	for (int i=0; i < n; i++){
	 tabell[i] = tilfeldig.nextInt();
	}
	
	
	
	public static void main(String[] args) {
		Instant start = Instant.now(); // get the current time

		// code block to measure
		// ...

		Instant end = Instant.now(); // get the current time again

		Duration duration = Duration.between(start, end); // calculate the duration

		System.out.println("Time elapsed: " + duration.toMillis() + " milliseconds"); // print the duration in milliseconds

	}

}
}