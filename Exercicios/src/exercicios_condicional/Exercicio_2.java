package exercicios_condicional;
import java.util.Scanner;

public class Exercicio_2 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um numero inteiro: ");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("O numero " + num + " eh PAR!");
		}
		else {
			System.out.println("O numero " + num + " eh IMPAR!");
		}
		sc.close();
	}
}
