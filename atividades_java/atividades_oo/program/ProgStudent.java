package program;
import java.util.Scanner;
import entities.Student;

public class ProgStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		student.name = sc.next();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		double finalGrade = student.finalGrade();
		System.out.println("FINAL GRADE = " + finalGrade);
		
		if (finalGrade >= 60.0) {
			System.out.println("PASS");
		} else {
			double missingPoints = student.missingPoints();
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", missingPoints);
		}
		
		
		sc.close();
	}

}
