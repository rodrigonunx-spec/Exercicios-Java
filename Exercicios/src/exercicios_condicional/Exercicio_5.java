package exercicios_condicional;
import java.util.Scanner;

public class Exercicio_5 {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade;
		
		
		System.out.println("Digite o codigo do produto: ");
		codigo = sc.nextInt();
		
		System.out.println("Digite a quantidade do produto: ");
		quantidade = sc.nextInt();
		
		double valor;
		if (codigo == 1) {
			valor = 4.00 * quantidade;
		}
		else if (codigo == 2) {
			valor = 4.50 * quantidade;
		}
		else if (codigo == 3) {
			valor = 5.00 * quantidade;
		}
		else if (codigo == 4) {
			valor = 2.00 * quantidade;
		}
		else if (codigo == 5) {
			valor = 1.50 * quantidade;
		}
		else {
			valor = 0;
			System.out.println("Codigo invalido!");
		}
		
		System.out.printf("Valor a pagar: %.2f", valor);
		
		sc.close();
	}
}
