package program;
import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class ProgRectangle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		
		System.out.println("Enter with rectangle widht and height:");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		double area = rect.area();
		double perimeter = rect.perimeter();
		double diagonal = rect.diagonal();
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PERIMETER = %.2f%n", perimeter);
		System.out.printf("DIAGONAL = %.2f%n", diagonal);
		
		sc.close();
	}

}
