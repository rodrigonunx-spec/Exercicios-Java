import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, h;
		double ht, sal;
		
		System.out.println("Digite o numero do funcionario, suas horas trabalhadas e seu valor ganho por hora respectivamente: ");
		
		n = sc.nextInt();
		h = sc.nextInt();
		ht = sc.nextDouble();
		sal = h * ht;
		
		System.out.printf("Number = %d%n", n);
		System.out.printf("Salary = U$ %.2f", sal);
		
		sc.close();
	}
}
