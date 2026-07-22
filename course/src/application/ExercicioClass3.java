package application;
import java.util.Scanner;
import java.util.Locale;

import entities.Student;

public class ExercicioClass3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Student name: ");
		student.name = sc.nextLine();
		System.out.print("First grade: ");
		student.grade1 = sc.nextDouble();
		System.out.print("Second grade: ");
		student.grade2 = sc.nextDouble();
		System.out.print("Third grade: ");
		student.grade3 = sc.nextDouble();
		
		System.out.printf("Final grade: %.2f%n", student.finalGrade());
		if (student.finalGrade() < 60) {
			System.out.println("FAILED");
			System.out.printf("Missing %.2f Points", student.missingGrade());
		}
		else {
			System.out.println("PASS");
		}
		
		sc.close();
	}
}
