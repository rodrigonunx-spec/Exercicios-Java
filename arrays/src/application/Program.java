package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the amount of products: ");
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.printf("Digite o nome do %dº produto: ", i+1);
			String name = sc.nextLine();
			System.out.printf("Digite o preco do %dº produto: ", i+1);
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		
		for(int i=0; i<n; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / n;
		
		System.out.printf("Average price: %.2f", avg);
		
		sc.close();
	}
}
