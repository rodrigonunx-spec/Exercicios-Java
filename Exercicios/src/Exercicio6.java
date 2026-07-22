import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main (String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, num1, cod2, num2;
		double val1, val2, pag;
		
		System.out.println("Digite o codigo da peça 1, sua quantidade e seu valor unitario: ");
		cod1 = sc.nextInt();
		num1 = sc.nextInt();
		val1 = sc.nextDouble();
		
		System.out.println("Digite o codigo da peça 2, sua quantidade e seu valor unitario: ");
		cod2 = sc.nextInt();
		num2 = sc.nextInt();
		val2 = sc.nextDouble();
		
		pag = val1 * num1 + val2 * num2;
		
		System.out.println("VALOR A PAGAR = " + pag);
		
		sc.close();
	}
}
