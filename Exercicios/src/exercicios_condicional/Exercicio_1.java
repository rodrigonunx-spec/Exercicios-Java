package exercicios_condicional;
import java.util.Scanner;

public class Exercicio_1 {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um numero inteiro: ");
		num = sc.nextInt();
		
		if (num >= 0) {
			System.out.println("O numero digitado eh NAO NEGATIVO!");
		}
		else {
			System.out.println("O numero digitado eh NEGATIVO!");
		}
		
		sc.close();
		
	}
}
