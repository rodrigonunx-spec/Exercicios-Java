package exercicios_repetitivas;
import java.util.Scanner;

public class Exercicio_4 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero entre 1 e 1000: ");
		int num = sc.nextInt();
		
		System.out.printf("Numeros impares entre 1 e %d%n", num);
		for (int i=0; i<=num; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		
		sc.close();
		
		}
	}
