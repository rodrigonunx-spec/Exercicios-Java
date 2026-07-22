package exercicios_condicional;
import java.util.Scanner;

public class Exercicio_3 {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B;
		
		System.out.println("Digite dois numero inteiros: ");
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Os numeros SAO MULTIPLOS!");
		}
		else {
			System.out.println("Os numeros NAO SAO MULTIPLOS!");
		}
		
		sc.close();
	}
}
