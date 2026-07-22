import java.util.Scanner;
import java.util.Locale;

public class Exercicio3 {

	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double r, area;
		double pi = 3.14159;
		
		System.out.println("Digite a area de um circulo: ");
		r = sc.nextDouble();
		area = (r * r) * pi;
		
		System.out.printf("A = %.4f", area);
		
		sc.close();
	}
}
