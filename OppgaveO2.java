package no.hvl.dat100;
import java.util.Scanner;

public class OppgaveO2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bruttoinntekt: ");
		double bruttoinntekt = scanner.nextDouble();
		
		double trinnskatt = 0.0;
		
		if (bruttoinntekt > 208050) {
			trinnskatt += (bruttoinntekt - 208050) * 0.017;
		}
		
		System.out.print("Du skal betale kr: " + trinnskatt + " i trinnskatt");
		
		scanner.close();
	}
}
