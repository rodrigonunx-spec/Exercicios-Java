package exercicios_condicional;
import java.util.Scanner;

public class Exercicio_4 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int horaInicial, horaFinal, duracao;
		
		System.out.println("Digite a hora inicial do jogo, sendo que ele tem que durar no minimo 1 hora e no maximo 24 horas: ");
		horaInicial = sc.nextInt();
		
		System.out.println("Digite a hora final do jogo, sendo que ele tem que durar no minimo 1 hora e no maximo 24 horas: ");
		horaFinal = sc.nextInt();
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
			System.out.printf("O jogo durou %d HORA(S)!", duracao);
		}
		
		else {
			duracao = 24 - horaInicial + horaFinal;
			System.out.printf("O jogo durou %d HORA(S)", duracao);
		}
		
		sc.close();
	}
	
}
