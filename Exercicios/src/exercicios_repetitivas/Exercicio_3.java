package exercicios_repetitivas;
import java.util.Scanner;

public class Exercicio_3 {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Alcool; 2. Gasolina; 3. Diesel; 4. Sair do programa.");
		System.out.println("Escolha qual combustivel voce mais utiliza: ");
		
		int combustivel = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while (combustivel != 4) {
			if (combustivel == 1) {
				alcool += 1;
			}
			else if (combustivel == 2) {
				gasolina += 1;
			}
			else if (combustivel == 3) {
				diesel += 1;
			}
			else if (combustivel == 4) {
				break;
			}
			else {
				System.out.println("Escolha Invalida!");
			}
			combustivel = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("MUITO OBRIGADO!");
		System.out.printf("Alcool: %d%n", alcool);
		System.out.printf("Gasolina: %d%n", gasolina);
		System.out.printf("Diesel: %d%n", diesel);
		sc.close();
	}
}
