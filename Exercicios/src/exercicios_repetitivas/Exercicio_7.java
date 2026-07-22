package exercicios_repetitivas;
import java.util.Scanner;

public class Exercicio_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos pares de numeros deseja informar: ");
		int qtd = sc.nextInt();
		int num1, num2;
		double resultado;
		
		for (int i=0; i<qtd; i++) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			if (num2 != 0) {
				resultado = (double) num1 / num2;
				System.out.printf(" %d / %d = %.1f%n", num1, num2, resultado);
			}
			else {
				System.out.println("Divisao Impossivel!!");
			}
		}
		
		sc.close();

	}
}
