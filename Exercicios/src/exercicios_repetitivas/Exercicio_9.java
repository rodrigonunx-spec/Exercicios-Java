package exercicios_repetitivas;

import java.util.Scanner;

public class Exercicio_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("informe o numero que deseja ver os divisores: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}
}
