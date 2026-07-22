package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas alturas deseja digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Digite a %d altura: ", i+1);
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		
		for(int i=0; i<n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		
		sc.close();
	}
}
