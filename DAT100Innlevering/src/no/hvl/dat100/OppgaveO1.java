package no.hvl.dat100;
import java.util.Scanner;

public class OppgaveO1 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 1; i <= 10; i++) {	
			int poengsum; 
			
			do {
			System.out.print("Poengsum " + i + ": ");
			poengsum = scanner.nextInt();
			
				if (poengsum < 0 || poengsum > 100) {
					System.out.println("Ugylding poengsum. Skriv en verdi mellom 0 og 100.");
			}
				
		} while (poengsum < 0 || poengsum > 100);
			
		char karakter; 
		if (poengsum  >= 90) {
			karakter = 'A';
		} else if (poengsum >= 80) {
			karakter = 'B';
		} else if (poengsum >= 70) {
			karakter = 'C';
		} else if (poengsum >= 60) {
			karakter = 'D';
		} else if (poengsum >= 50) {
			karakter = 'E';
		} else  {
			karakter = 'F';
		}
		
		System.out.println("Karakter " + i + ": " + karakter);
	}
	scanner.close();
	}
}
