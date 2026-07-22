package exercicios_repetitivas;
import java.util.Scanner;

public class Exercicio_5 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros deseja informar: ");
		int num = sc.nextInt();
		int nums;
		int in = 0;
		int out = 0;
		
		for (int i=1; i<=num; i++) {
			nums = sc.nextInt();
			if (nums >= 10 && nums <= 20) {
				in += 1;
			}
			else {
				out += 1;
			}
		}
		
		System.out.printf("%d numbers in [10, 20]%n", in);
		System.out.printf("%d numbers out [10, 20]", out);
		
		sc.close();
	}
	
}
