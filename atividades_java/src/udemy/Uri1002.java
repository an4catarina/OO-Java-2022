package udemy;
import java.util.Scanner;

public class Uri1002 {

	public static void main(String[] args) {
		double n = 3.14159;
		double area;
		double raio;
		
		Scanner entrada = new Scanner(System.in);
		raio = entrada.nextDouble();
		area = n * Math.pow(raio, 2.0);
		System.out.printf("A=%.4f\n", area);
		
		entrada.close();

	}

}
