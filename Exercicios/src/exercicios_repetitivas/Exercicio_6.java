package exercicios_repetitivas;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio_6 {

	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos trios de numeros deseja informar: ");
		int qtd = sc.nextInt();
		double num1;
		double num2;
		double num3;
		double media;
		
		for (int i=0; i<qtd; i++) {
			num1 = sc.nextDouble();
			num2 = sc.nextDouble();
			num3 = sc.nextDouble();
			media = ((num1 * 2 + num2 * 3 + num3 * 5) / 10);
			System.out.printf("Media ponderada dos valores digitados: %.1f%n", media);
		}
		
		System.out.println("Obrigada por usar nosso codigo!");
			
		sc.close();
	}
}