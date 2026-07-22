package exercicios_condicional;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_8 {

	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do salario: ");
		double salario = sc.nextDouble();
		double imposto;
		
		if (salario <= 2000) {
			imposto = 0.0;
		}
		
		else if (salario > 2000 && salario <= 3000) {
			imposto = (salario - 2000) * 0.08;
		}
		else if (salario > 3000 && salario <= 4500) {
			imposto = (salario - 3000) * 0.18 + 1000 * 0.08;
		}
		else {
			imposto = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;  
		}
		
		if (imposto > 0) {
			System.out.printf("Total de imposto: %.2f", imposto);
		}
		else {
			System.out.println("Isento de imposto!");
		}
		sc.close();
	}
}
