package udemy;
import java.util.Scanner;

public class Uri1012 {

	public static void main(String[] args) {
		double A, B, C, TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO;
		
		Scanner entrada = new Scanner(System.in);
		A = entrada.nextDouble();
		B = entrada.nextDouble();
		C = entrada.nextDouble();
		
		TRIANGULO = (A * C)/2;
		CIRCULO = 3.14159 * Math.pow(C, 2.0);
		TRAPEZIO = ((A+B)*C)/2;
		QUADRADO = Math.pow(B, 2.0);
		RETANGULO = A*B;
		
		System.out.printf("TRIANGULO: %.3f\n", TRIANGULO);
		System.out.printf("CIRCULO: %.3f\n", CIRCULO);
		System.out.printf("TRAPEZIO: %.3f\n", TRAPEZIO);
		System.out.printf("QUADRADO: %.3f\n", QUADRADO);
		System.out.printf("RETANGULO: %.3f\n", RETANGULO);
		entrada.close();

	}

}
