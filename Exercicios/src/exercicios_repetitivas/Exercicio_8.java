package exercicios_repetitivas;
import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o numero que deseja ver o fatorial: ");
		int num = sc.nextInt();
		int fatorial = 1;
		
		for (int i=num; i>=1; i--) {
				fatorial = fatorial * i;
			}
		System.out.printf("Fatorial de %d = %d", num, fatorial);
		
		sc.close();
	}
}
