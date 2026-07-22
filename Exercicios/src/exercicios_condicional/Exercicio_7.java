package exercicios_condicional;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_7 {

	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		System.out.println("Digite o ponto X: ");
		x = sc.nextDouble();
		System.out.println("Digite o ponto Y: ");
		y = sc.nextDouble();
		
		if (x == 0) {
			System.out.println("Eixo Y");
		}
		else if (y == 0) {
			System.out.println("Eixo X");
		}
		else if (x > 0 && y > 0) {
			System.out.println("Quandrante 1");
		}
		else if (x < 0 && y > 0) {
			System.out.println("Quadrante 2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Quadrante 3");
		}
		else if (x > 0 && y < 0) {
			System.out.println("Quadrante 4");
		}
		else {
			System.out.println("Origem");
		}
		
		sc.close();
	}
}
