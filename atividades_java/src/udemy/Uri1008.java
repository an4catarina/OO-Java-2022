package udemy;
import java.util.Scanner;

public class Uri1008 {

	public static void main(String[] args) {
		int num, hour;
		double valhour, valf;
		
		Scanner entrada = new Scanner(System.in);
		num = entrada.nextInt();
		hour = entrada.nextInt();
		valhour = entrada.nextDouble();
		
		valf = hour * valhour;
		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f\n", valf);
		entrada.close();

	}

}
