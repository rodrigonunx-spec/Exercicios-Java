import java.util.Scanner;

public class Exercicio2 {

	public static void main (String[] args) {
		int x, y, soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois numeros inteiros: ");
		
		x = sc.nextInt();
		y = sc.nextInt();
		soma = x + y;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}
}
