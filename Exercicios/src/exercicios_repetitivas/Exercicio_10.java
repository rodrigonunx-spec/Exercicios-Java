package exercicios_repetitivas;
import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um numero:");
		int num = sc.nextInt();
		int quadrado, cubo;
		
		for (int i=1; i<=num; i++) {
			quadrado = i * i;
			cubo = i * i * i;
			System.out.printf("%d %d %d%n", i, quadrado, cubo);
		}
		sc.close();
	}
}
