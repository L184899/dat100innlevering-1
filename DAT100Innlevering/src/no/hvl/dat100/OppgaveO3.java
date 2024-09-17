package no.hvl.dat100;
import java.util.Scanner;
import java.math.BigInteger;

public class OppgaveO3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Heltall større enn null: ");
		int x = scanner.nextInt();
		int t = 1;
		
		while (x <= 0) {
			System.out.print("Ugyldig tall. Skriv et tall større enn null");
			x = scanner.nextInt();
		}
		
		for (int i = 1; i <= x; i++) {
			t = t * i;
		}
		
		System.out.println(x + "! = " + t);
		scanner.close();
	}

}
